package com.example.myapplication

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imageFrom")
fun ImageView.imageFromU(url : String){
    Glide.with(this.context).load(url).into(this)
}
