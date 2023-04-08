package com.example.datanews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.datanews.databinding.ItemNewsBinding

class NewsAdapter (var listNews: ArrayList<ListNews>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemNewsBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindNews(itemData: ListNews) {
            binding.news = itemData

            binding.btnCard.setOnClickListener {
                var bundle = Bundle()
                bundle.putSerializable("data_news", itemData)

                Navigation.findNavController(itemView).navigate(R.id.action_newsFragment_to_detailFragment, bundle)
            }


        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemNewsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: NewsAdapter.ViewHolder, position: Int) {
        holder.bindNews(listNews[position])
    }


    override fun getItemCount(): Int {
        return listNews.size

    }

}


