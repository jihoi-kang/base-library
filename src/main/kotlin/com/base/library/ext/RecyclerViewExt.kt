package com.base.library.ext

import androidx.annotation.LayoutRes
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.base.library.ui.BaseAdapter

@BindingAdapter(
    "items",
    "item_layout"
)
fun RecyclerView.bindAdapter(
    items: List<Any>,
    @LayoutRes layoutResId: Int,
) {
    val adapter = this.adapter as? BaseAdapter
        ?: BaseAdapter(layoutResId).also {
            this.adapter = it
        }

    adapter.replaceAll(items)
}