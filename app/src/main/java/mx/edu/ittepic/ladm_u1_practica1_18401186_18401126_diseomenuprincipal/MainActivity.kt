package mx.edu.ittepic.ladm_u1_practica1_18401186_18401126_diseomenuprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.ittepic.ladm_u1_practica1_18401186_18401126_diseomenuprincipal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMenu.setOnClickListener {
            var otraVentana = Intent (this,MainActivity2::class.java)
            startActivity(otraVentana)
            finish()
        }

        binding.btnSalir.setOnClickListener {
            finish()
        }
    }
}