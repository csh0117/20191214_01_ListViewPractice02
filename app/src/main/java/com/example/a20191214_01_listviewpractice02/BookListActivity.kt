package com.example.a20191214_01_listviewpractice02


import android.os.Bundle
import com.example.a20191214_01_listviewpractice02.adapters.BookAdapter
import com.example.a20191214_01_listviewpractice02.datas.BookData
import kotlinx.android.synthetic.main.activity_book_list.*

class BookListActivity : BaseActivity() {
    var bookAdapter: BookAdapter? = null
    val bookList = ArrayList<BookData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {
        addBooks()
        bookAdapter = BookAdapter(mContext, R.layout.game_list_item, bookList)
        bookListView.adapter = bookAdapter
    }

    fun addBooks() {
        bookList.add(BookData("드래곤볼", "일본"))
        bookList.add(BookData("해리포터", "영국"))
        bookList.add(BookData("반지의 제왕", "미국"))
        bookList.add(BookData("팔라독(Paladog)", "FazeCat"))
        bookList.add(BookData("Plants Vs. Zombie", "EA Swiss Sarl"))
        bookList.add(BookData("스왐피 (Swampy)", "Disney"))
    }

}
