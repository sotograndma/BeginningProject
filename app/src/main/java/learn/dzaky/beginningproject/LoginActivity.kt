package learn.dzaky.beginningproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {

    private lateinit var dataEmail: Array<String>
    private lateinit var dataPassword: Array<String>
    private var progressBar: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val edtemail : EditText = findViewById(R.id.edt_email)
        val edtpassword : EditText = findViewById(R.id.edt_password)
        val btnLogin : Button = findViewById(R.id.btn_login)
        val btnRegister : Button = findViewById(R.id.btn_register)
        progressBar = findViewById(R.id.progress_bar)
        val btnForgetPass : TextView = findViewById(R.id.forget_password)
        val radioremember : RadioButton = findViewById(R.id.rememberme)

        val builder = AlertDialog.Builder(this, R.style.AlertDialog_AppCompat).create()
        builder.setTitle("Harap isi dengan careful!")
        builder.setMessage("Tentukan your choice")
        builder.setIcon(R.drawable.ic_profile)
        builder.
        builder.setCancelable(true)
        builder.show()

        val dataEmail = arrayOf("Deez", "Nuts", "Belly")
        var dataEassword = arrayOf("1234", "4321", "1432")

        btnLogin.setOnClickListener{
            progressBar?.visibility = View.VISIBLE
            signIn(edtemail.text.toString(), edtpassword.text.toString())
        }

        btnRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

    }

    fun signIn(email: String, password : String)
    {
        for (i in dataEmail.indices){
            val takedataEmail = dataEmail.get(i)
            val takedataPassword = dataPassword.get(i)
            if (takedataEmail == email && takedataPassword == password){
                Toast.makeText(this, "LogedIn", Toast.LENGTH_SHORT).show()
                progressBar?.visibility = View.GONE
                startActivity(Intent(this, Home::class.java))
                break
            }else{
                progressBar?.visibility = View.GONE
                Toast.makeText(this, "Akun Salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}