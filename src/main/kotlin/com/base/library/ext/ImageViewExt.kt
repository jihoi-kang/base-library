package com.base.library.ext

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("load_url")
fun ImageView.bindLoadUrl(url: String) {
    Glide.with(this)
        .load(url)
        .into(this)
}