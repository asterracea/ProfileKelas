package com.example.myapplicationk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var fotoList: ArrayList<fotokls>
    private lateinit var fotoAdapter: fotoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        fotoList = ArrayList()
        fotoList.add(fotokls(R.drawable.adamm, "Adam Gibran "))
        fotoList.add(fotokls(R.drawable.foto2, "Alieffiea Widya "))
        fotoList.add(fotokls(R.drawable.foto3, "Ami Rofiatin"))
        fotoList.add(fotokls(R.drawable.foto4, "Amir Zuhdi "))
        fotoList.add(fotokls(R.drawable.foto5, "Annisa Qurrotaa'yun"))
        fotoList.add(fotokls(R.drawable.foto6, "Asrizal Nova "))
        fotoList.add(fotokls(R.drawable.foto7, "Avilia Indyra "))
        fotoList.add(fotokls(R.drawable.foto8, "Elsa Bhuwana "))
        fotoList.add(fotokls(R.drawable.foto9, "Ersado Cahya "))
        fotoList.add(fotokls(R.drawable.foto10, "Fahrizal Angga "))
        fotoList.add(fotokls(R.drawable.foto11, "Fahrul Roziqin "))
        fotoList.add(fotokls(R.drawable.foto12, "Hafina Meilawati"))
        fotoList.add(fotokls(R.drawable.foto13, "Harbina Putri "))
        fotoList.add(fotokls(R.drawable.foto14, "Ica Chintyasari"))
        fotoList.add(fotokls(R.drawable.foto15, "Irsyad Thariq "))
        fotoList.add(fotokls(R.drawable.foto16, "Kresnabayu Dwirifanto"))
        fotoList.add(fotokls(R.drawable.foto17, "Meicho Hendra"))
        fotoList.add(fotokls(R.drawable.foto18, "Muhammad Dimas "))
        fotoList.add(fotokls(R.drawable.foto19, "Muhammad Fariz"))
        fotoList.add(fotokls(R.drawable.foto20, "Muhammad Ridwan "))
        fotoList.add(fotokls(R.drawable.foto21, "Nabila Eka "))
        fotoList.add(fotokls(R.drawable.foto22, "Natasya Inge "))
        fotoList.add(fotokls(R.drawable.foto23, "Ranto"))
        fotoList.add(fotokls(R.drawable.foto24, "Rifki Muhammad"))
        fotoList.add(fotokls(R.drawable.foto25, "Rinda Kusuma"))
        fotoList.add(fotokls(R.drawable.foto26, "Rochmat Choiruly"))
        fotoList.add(fotokls(R.drawable.foto27, "Sang Pralambang"))
        fotoList.add(fotokls(R.drawable.foto28, "Yusril Mahfudhi"))

        fotoAdapter = fotoAdapter(fotoList)
        recyclerView.adapter = fotoAdapter

        fotoAdapter.onItemClick ={
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("foto", it)
            startActivity(intent)
        }
    }
}