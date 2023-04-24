package com.miempresa.proyectoactividadesintentsv4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lblEstado.setText("Estas en el metodo onCreate")
        Toast.makeText(this, "Estas en el metodo onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        lblEstado.setText("Estas en el metodo onStart")
        Toast.makeText(this, "Estas en el metodo onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        lblEstado.setText("Estas en el metodo onResume")
        Toast.makeText(this, "Estas en el metodo onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        lblEstado.setText("Estas en el metodo onPause")
        Toast.makeText(this, "Estas en el metodo onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        lblEstado.setText("Estas en el metodo onStop")
        Toast.makeText(this, "Estas en el metodo onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        lblEstado.setText("Estas en el metodo onRestart")
        Toast.makeText(this, "Estas en el metodo onRestart", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        lblEstado.setText("Estas en el metodo onDestroy")
        Toast.makeText(this, "Estas en el metodo onDestroy", Toast.LENGTH_SHORT).show()
    }

}