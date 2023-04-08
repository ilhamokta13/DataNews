package com.example.datanews

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.datanews.databinding.FragmentNewsBinding

class NewsFragment : Fragment() {

    lateinit var binding: FragmentNewsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentNewsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listNews = arrayListOf(
            ListNews("Jalur Alternatif Hindari Proyek Aloha", "02/04/2023",R.drawable.aloha, "Sidoarjo - Proyek pembangunan Flyover Aloha di sisi Jalan Raya Juanda mulai dilakukan. Rekayasa lalu lintas dengan cara mengalihkan rute sejumlah kendaraan di Jalan Raya Aloha dilakukan mulai hari ini dan berpotensi menyebabkan kepadatan lalu lintas.", "Arkhelaus Wisnu Triyogo"),
            ListNews("Harga Emas Anjlok","01/04/2023",R.drawable.emas, "Jakarta, CNN Indonesia -- Harga emas PT Aneka Tambang (Persero) Tbk alias Antam bertengger di Rp1,077 juta pada Selasa (28/3). Posisi ini melemah Rp10 ribu dibandingkan Senin (27/3) kemarin", "Ramadhan"),
            ListNews("Peluncuran Lenovo Yoga 9i dan 6","04/04/2023", R.drawable.laptop, "“Generasi terbaru dari Lenovo Yoga seri convertible ini hadir untuk mendukung gaya hidup hybrid yang fleksibel dengan resolusi layar terbaru, kekuatan dari prosesor terbaru, dan layar touchscreen yang dapat memungkinkan content creator untuk selalu berkarya,” kata Santi Nainggolan, Consumer Lead Lenovo Indonesia dalam keterangannya, Kamis (30/3/2023)\n"
                    , "M.Dipa"),
            ListNews("UB dan UGM favorit di SNBP 2023", "29/03/2023", R.drawable.ub, "TEMPO.CO, Jakarta - Ketua Umum Seleksi Nasional Penerimaan Mahasiswa Baru (SNPMB) Mochamad Ashari menyatakan Universitas Brawijaya menjadi perguruan tinggi negeri (PTN) yang paling diminati oleh para peserta jalur Seleksi Nasional Berdasarkan Prestasi (SNBP) 2023.\n" +
                    "\n" +
                    "\"Dari 137 PTN yang membuka penerimaan mahasiswa baru melalui jalur SNBP pada tahun ini ternyata Universitas Brawijaya menjadi terfavorit dengan pendaftar paling banyak, mencapai 26.487 peserta,\" ujar Mochamad Ashari dalam konferensi pers secara daring pada Senin, 27 Maret 2023.", "Devy Ernis" ),
            ListNews("20 prodi polinema akreditasi internasional", "29/12/2020", R.drawable.polinema, "MALANG - 20 dari 29 Program Studi (Prodi) yang ada di Politeknik Negeri Malang (Polinema) telah memperoleh akreditasi internasional, yakni Accreditation Service For Internasional School Colleges & Universities (ASIC) yang diadakan beberapa waktu yang lalu.Direktur Polinema, Awan Setiawan, mengatakan 20 prodi telah berhasil terakreditasi internasional artinya sudah mencapai 60 persen dari seluruh program studi yang ada di kampus. \n" +
                    "Awan menyebutkan, Prodi yang terakreditasi internasional merupakan Prodi yang telah cukup lama ada. Sedangkan untuk Prodi yang baru masih belum terakreditasi.", "Roni")



            )

        binding.rvNews.adapter = NewsAdapter(listNews)
        binding.rvNews.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }
}