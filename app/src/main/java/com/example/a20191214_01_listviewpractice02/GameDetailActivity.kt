package com.example.a20191214_01_listviewpractice02

import android.os.Bundle
import com.example.a20191214_01_listviewpractice02.datas.GameData
import kotlinx.android.synthetic.main.activity_game_detail.gameTitleTxt
import kotlinx.android.synthetic.main.game_list_item.*

class GameDetailActivity : BaseActivity() {

    var mGameData: GameData? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_detail)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {
    }

    override fun setValues() {
        mGameData = intent.getSerializableExtra("gameData") as GameData

        gameTitleTxt.text = mGameData?.title
        gameCompanyNameTxt.text = mGameData?.companyName

    }
}
