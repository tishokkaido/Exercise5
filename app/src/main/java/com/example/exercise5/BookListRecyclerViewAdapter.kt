package com.example.exercise5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookListRecyclerViewAdapter(
    private val books: List<Book>
) : RecyclerView.Adapter<BookListRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // アイテムのViewを生成
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.book_item, parent, false)
        // ViewHolderを作成
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(books[position])
    }

    override fun getItemCount(): Int = books.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView.rootView) {
        fun bind(book: Book) {
            itemView.findViewById<TextView>(R.id.text_author).text = book.author
            itemView.findViewById<TextView>(R.id.text_title).text = book.title
        }
    }

    data class Book(
        val author: String,
        val title: String
    )
}