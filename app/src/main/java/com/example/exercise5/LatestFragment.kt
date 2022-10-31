package com.example.exercise5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView

/**
 * A fragment representing a list of Items.
 */
class LatestFragment : Fragment() {
    private lateinit var adapter: BookListRecyclerViewAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_latest, container, false)

        adapter = BookListRecyclerViewAdapter(LATEST_BOOK_LIST)

        view.findViewById<RecyclerView>(R.id.list_latest).also {
            it.adapter = adapter
            it.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }

        return view
    }

    companion object {
        val LATEST_BOOK_LIST = listOf(
            BookListRecyclerViewAdapter.Book(
                "住野よる",
                "君の膵臓を食べたい"
            ),
            BookListRecyclerViewAdapter.Book(
                "米澤穂信",
                "満願"
            ),
            BookListRecyclerViewAdapter.Book(
                "中村文則",
                "去年の冬、きみと別れ"
            ),
            BookListRecyclerViewAdapter.Book(
                "川上途行",
                "ナースコール！こちら蓮田市リハビリテーション病院"
            ),
            BookListRecyclerViewAdapter.Book(
                "上橋菜穂子",
                "鹿の王4"
            ),
            BookListRecyclerViewAdapter.Book(
                "湊かなえ",
                "豆の上で眠る"
            ),
            BookListRecyclerViewAdapter.Book(
                "上橋菜穂子",
                "鹿の王3"
            ),
            BookListRecyclerViewAdapter.Book(
                "田中尚喜",
                "百歳まで歩く"
            ),
            BookListRecyclerViewAdapter.Book(
                "中路啓太",
                "もののふ莫迦"
            ),
            BookListRecyclerViewAdapter.Book(
                "上橋菜穂子",
                "鹿の王1"
            ),
            BookListRecyclerViewAdapter.Book(
                "中村文則",
                "教団X"
            ),
            BookListRecyclerViewAdapter.Book(
                "上橋菜穂子",
                "鹿の王2"
            ),
            BookListRecyclerViewAdapter.Book(
                "内藤了",
                "MIX 猟奇犯罪捜査班・藤堂比奈子"
            ),
            BookListRecyclerViewAdapter.Book(
                "林宏司",
                "コード・ブルー ドクターヘリ救急救命 2ndシーズン"
            ),
            BookListRecyclerViewAdapter.Book(
                "東野圭吾",
                "ナミヤ雑貨店の奇蹟"
            ),
            BookListRecyclerViewAdapter.Book(
                "池井戸潤",
                "アキラとあきら"
            )
        )
    }
}