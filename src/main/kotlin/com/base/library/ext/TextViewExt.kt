package com.base.library.ext

import android.os.Build
import android.text.Html
import android.widget.TextView
import androidx.annotation.StringRes
import androidx.databinding.BindingAdapter

@Suppress("DEPRECATION")
@BindingAdapter("html_text")
fun TextView.bindHtmlText(text: String) {
    this.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        Html.fromHtml(text, Html.FROM_HTML_MODE_LEGACY)
    } else {
        Html.fromHtml(text)
    }
}

@BindingAdapter("res_text")
fun TextView.bindResText(@StringRes resId: Int) {
    text = this.context.getString(resId)
}