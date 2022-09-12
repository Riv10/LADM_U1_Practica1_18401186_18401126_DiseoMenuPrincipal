package mx.edu.ittepic.ladm_u1_practica1_18401186_18401126_diseomenuprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.ittepic.ladm_u1_practica1_18401186_18401126_diseomenuprincipal.databinding.ActivityMain2Binding
import mx.edu.ittepic.ladm_u1_practica1_18401186_18401126_diseomenuprincipal.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegresar2.setOnClickListener {
            var Ventana= Intent(this,MainActivity2::class.java)
            startActivity(Ventana)
            finish()
        }

    }
}