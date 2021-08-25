package com.nepplus.pizzaorderapp_20210825.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.nepplus.pizzaorderapp_20210825.R
import com.nepplus.pizzaorderapp_20210825.datas.StoreData

class PizzaStoreAdapter(
    val mContext : Context,
    resID : Int,
    val mList : List<StoreData>) : ArrayAdapter<StoreData> (mContext, resID, mList){


    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.pizza_store_list_item, null)
    }

    val row = tempRow!!
    return row




    }



}