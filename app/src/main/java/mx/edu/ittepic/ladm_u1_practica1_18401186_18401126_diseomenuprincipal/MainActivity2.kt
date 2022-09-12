package mx.edu.ittepic.ladm_u1_practica1_18401186_18401126_diseomenuprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import mx.edu.ittepic.ladm_u1_practica1_18401186_18401126_diseomenuprincipal.databinding.ActivityMain2Binding
import mx.edu.ittepic.ladm_u1_practica1_18401186_18401126_diseomenuprincipal.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEntrada.setOnClickListener {
            var ventanaP = Intent(this,MainActivity3::class.java)
            startActivity(ventanaP)
            finish()
        }

        binding.btnPlatoF.setOnClickListener {
            var ventanaP = Intent(this,MainActivity3::class.java)
            startActivity(ventanaP)
            finish()
        }

        binding.btnPostre.setOnClickListener {
            var ventanaP = Intent(this,MainActivity3::class.java)
            startActivity(ventanaP)
            finish()
        }

        binding.btnSnacks.setOnClickListener {
            Toast.makeText(this,"Lo sentimos, el menú de Snacks no se encuentra disponible.",
                Toast.LENGTH_LONG).show()
        }

        binding.btnBebidas.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Menú de Bebidas")
                .setMessage("1.- Naranjada \n" +
                        "2 .- Limonada \n"+
                        "3.- Coca-Cola \n"+
                        "4.- Agua de Jamaica \n"+
                        "5.- Agua de Horchata")
                .setPositiveButton("Aceptar"){d,i->
                    d.dismiss()
                }
                .setNegativeButton("Cancelar"){d,i->
                    d.cancel()
                }
                .show()
        }

        binding.btnRegresar.setOnClickListener {
            var ventanaP = Intent(this,MainActivity::class.java)
            startActivity(ventanaP)
            finish()
        }

    }
}