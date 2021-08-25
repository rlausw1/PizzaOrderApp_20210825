package com.nepplus.pizzaorderapp_20210825

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.nepplus.pizzaorderapp_20210825.datas.StoreData
import kotlinx.android.synthetic.main.activity_view_store_detail.*
import kotlinx.android.synthetic.main.pizza_store_list_item.*
import kotlinx.android.synthetic.main.pizza_store_list_item.logoImg
import kotlinx.android.synthetic.main.pizza_store_list_item.nameTxt

class EditNicknameActivity : BaseActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)
        setValues()
        setupEvents()

    override fun setupEvents() {

    }

    override fun setValues() {

        mNicknamedta = intent.get

//        mStoreData = intent.getSerializableExtra("store") as StoreData
//
//        nameTxt.text = mStoreData.name
//        phoneNumTxt.text = mStoreData.phoneNum
//        Glide.with(mContext).load(mStoreData.logoURL).into(logoImg)

    }


    }
}