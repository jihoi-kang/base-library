package com.base.library.ui

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.base.library.BR

open class BaseViewHolder(
    private val binding: ViewDataBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(item: Any?) {
        binding.setVariable(BR.item, item)
        binding.executePendingBindings()
    }

}