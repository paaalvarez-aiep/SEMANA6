package com.example.firebaseloginapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.google.firebase.auth.FirebaseAuth

class MainActivity : ComponentActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        auth = FirebaseAuth.getInstance()

        // Verificar si el usuario ya está autenticado
        if (auth.currentUser != null) {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish() // Close MainActivity
        } else {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // Close MainActivity
        }
    }
}
