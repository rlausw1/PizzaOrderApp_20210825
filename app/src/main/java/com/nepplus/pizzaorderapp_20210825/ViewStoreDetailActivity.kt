package com.nepplus.pizzaorderapp_20210825

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.nepplus.pizzaorderapp_20210825.datas.StoreData
import kotlinx.android.synthetic.main.activity_view_store_detail.*
import kotlinx.android.synthetic.main.pizza_store_list_item.*
import kotlinx.android.synthetic.main.pizza_store_list_item.logoImg
import kotlinx.android.synthetic.main.pizza_store_list_item.nameTxt

class ViewStoreDetailActivity : BaseActivity() {

    lateinit var mStoreData: StoreData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        setupEvents()
        setValues()


    override fun setupEvents() {



        dialBtn.setOnClickListener {

            val myUri = Uri.parse("tel:${mStoreData.phoneNum}")
            val myIntent = Intent ( Intent.ACTION_DIAL, myUri )
                    startActivity(myIntent)


    }

    override fun setValues() {

        mStoreData = intent.getSerializableExtra("store") as StoreData

        nameTxt.text = mStoreData.name
        phoneNumTxt.text = mStoreData.phoneNum
        Glide.with(mContext).load(mStoreData.logoURL).into(logoImg)








    }


    }
}