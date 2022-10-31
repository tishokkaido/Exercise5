package com.example.exercise5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView

class FavoriteFragment : Fragment() {
    private lateinit var adapter: BookListRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_favorite, container, false)

        adapter = BookListRecyclerViewAdapter(FAVORITE_BOOK_LIST)

        view.findViewById<RecyclerView>(R.id.list_favorite).also {
            it.adapter = adapter
            it.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }
        return view
    }

    companion object {
        val FAVORITE_BOOK_LIST = listOf(
            BookListRecyclerViewAdapter.Book(
                "島田荘司",
                "占星術殺人事件"
            ),
            BookListRecyclerViewAdapter.Book(
                "追尾秀介",
                "カラスの親指"
            ),
            BookListRecyclerViewAdapter.Book(
                "横山秀夫",
                "半落ち"
            ),
            BookListRecyclerViewAdapter.Book(
                "高野和明",
                "13階段"
            ),
            BookListRecyclerViewAdapter.Book(
                "誉田哲也",
                "ストロベリーナイト"
            ),
            BookListRecyclerViewAdapter.Book(
                "伊坂幸太郎",
                "モダンタイムス"
            ),
            BookListRecyclerViewAdapter.Book(
                "海堂尊",
                "ナイチンゲールの沈黙"
            ),
            BookListRecyclerViewAdapter.Book(
                "歌野章午",
                "葉桜の季節に君を想うということ"
            ),
            BookListRecyclerViewAdapter.Book(
                "東野圭吾",
                "容疑者Xの献身"
            ),
            BookListRecyclerViewAdapter.Book(
                "貫井徳郎",
                "慟哭"
            ),
            BookListRecyclerViewAdapter.Book(
                "絢辻行人",
                "十角館の殺人"
            ),
            BookListRecyclerViewAdapter.Book(
                "佐々木譲",
                "廃墟に乞う"
            ),
            BookListRecyclerViewAdapter.Book(
                "貴志祐介",
                "悪の教典"
            ),
            BookListRecyclerViewAdapter.Book(
                "宮部みゆき",
                "火車"
            ),
            BookListRecyclerViewAdapter.Book(
                "柳広司",
                "ジョーカー・ゲーム"
            ),
            BookListRecyclerViewAdapter.Book(
                "東川篤哉",
                "謎解きはディナーの後で"
            )
        )
    }
}