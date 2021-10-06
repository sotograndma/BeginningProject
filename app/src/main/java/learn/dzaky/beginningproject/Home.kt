package learn.dzaky.beginningproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val datasGambar = arrayOf("https://i.ytimg.com/vi/Zss4438ON2k/hqdefault.jpg",
                                "https://thumbs.dreamstime.com/b/common-gray-toad-shore-close-up-common-gray-toad-shore-pond-close-up-229858844.jpg")
        val datasJudul = arrayOf("gray toad", "gray toad")
        val datasBuyer = arrayOf("3000", "3000")

        val rvItem : RecyclerView = findViewById(R.id.rv_item)
        rvItem.adapter = AdapterRecyclerView(this, datasGambar, datasJudul, datasBuyer)
        rvItem.layoutManager = LinearLayoutManager(this)
        rvItem.setHasFixedSize(true)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_home9, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.bahasa -> {
                Toast.makeText(this, "Pengaturan Bahasa", Toast.LENGTH_SHORT). show()
                return true
            }
            R.id.tampilan -> {
                Toast.makeText(this, "Pengaturan Tampilan", Toast.LENGTH_SHORT). show()
                return true
            }
            R.id.logout -> {
                startActivity(Intent(this, LoginActivity::class.java))
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }



}