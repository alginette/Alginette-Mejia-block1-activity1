import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.mejia.alginette.block1.p1.quiz.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Example: Navigate to SignUpActivity on login button click
        // Replace this with your login logic
        // For instance, set a click listener on a login button to handle authentication
        // and then navigate to the signup screen
        // Here is just an example to demonstrate navigation:

        // Example assuming you have a login button with id loginButton
        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            val intent = Intent(this@LoginActivity, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
