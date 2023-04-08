package com.example.datanews

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.datanews.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {


    lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val getNews = arguments?.getSerializable("data_news") as ListNews
        binding.detailJudul.text = getNews.judul
        binding.detailTanggal.text = getNews.tanggal
        binding.detailPenulis.text = getNews.penulis
        binding.detailImage.setImageResource(getNews.image)
        binding.detailContent.text = getNews.content
    }

}