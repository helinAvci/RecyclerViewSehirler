//sehirler RecyclerView

package com.helinavci.recyclerviewsehirler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.helinavci.recyclerviewsehirler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var sehirler : ArrayList<sehirler>
    private lateinit var adapter : sehirlerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        sehirler = ArrayList<sehirler>()
        val s1 = sehirler("İSTANBUL")
        val s2 = sehirler("İZMİR")
        val s3 = sehirler("ANKARA")
        val s4 = sehirler("ISPARTA")
        val s5 = sehirler("UŞAK")
        val s6 = sehirler("ANTALYA")
        sehirler.add(s1)
        sehirler.add(s2)
        sehirler.add(s3)
        sehirler.add(s4)
        sehirler.add(s5)
        sehirler.add(s6)
        adapter = sehirlerAdapter(this ,sehirler)
        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = StaggeredGridLayoutManager(1 , StaggeredGridLayoutManager.VERTICAL)
        binding.rv.adapter = adapter
    }
}