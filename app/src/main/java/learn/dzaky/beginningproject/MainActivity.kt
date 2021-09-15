package learn.dzaky.beginningproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var dataEmail: Array<String>
    private lateinit var dataPassword: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtemail : EditText = findViewById(R.id.edt_email)
        val edtpassword : EditText = findViewById(R.id.edt_password)
        val btnLogin : Button = findViewById(R.id.btn_login)
        val btnRegister : Button = findViewById(R.id.btn_register)
        val btnForgetPass : TextView = findViewById(R.id.forget_password)
        val radioremember : RadioButton = findViewById(R.id.rememberme)

        val dataEmail = arrayOf("Deez", "Nuts", "Belly")
        var dataEassword = arrayOf("1234", "4321", "1432")

        btnLogin.setOnClickListener{
            signIn(edtemail.text.toString(), edtpassword.text.toString())
        }

    }

    fun signIn(email: String, password : String)
    {
        for (i in dataEmail.indices){
            val takedataEmail = dataEmail.get(i)
            val takedataPassword = dataPassword.get(i)
            if (takedataEmail == email && takedataPassword == password){
                Toast.makeText(this, "LogedIn", Toast.LENGTH_SHORT).show()
                break
            }else{
                Toast.makeText(this, "Akun Salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}