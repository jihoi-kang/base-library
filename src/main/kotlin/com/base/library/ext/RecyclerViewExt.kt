package com.base.library.ext

import androidx.annotation.LayoutRes
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.base.library.ui.BaseAdapter
import com.base.library.ui.BaseListAdapter

@BindingAdapter(
    "items",
    "item_layout",
    "diff_callback",
    requireAll = false
)
fun RecyclerView.bindAdapter(
    items: List<Any>,
    @LayoutRes layoutResId: Int,
    diffCallback: DiffUtil.ItemCallback<Any>? = null
) {
    if (diffCallback == null) {
        val adapter = this.adapter as? BaseAdapter
            ?: BaseAdapter(layoutResId).also {
                this.adapter = it
            }

        adapter.replaceAll(items)
    } else {
        val adapter = this.adapter as? BaseListAdapter
            ?: BaseListAdapter(layoutResId, diffCallback).also {
                this.adapter = it
            }

        adapter.submitList(items)
    }
}