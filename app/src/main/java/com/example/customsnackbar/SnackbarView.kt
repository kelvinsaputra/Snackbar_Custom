package com.example.customsnackbar

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.ContentViewCallback

class SnackbarView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr), ContentViewCallback {

    override fun animateContentOut(delay: Int, duration: Int) {

    }

    override fun animateContentIn(delay: Int, duration: Int) {

    }

    init {
        View.inflate(context, R.layout.snackbar_view, this)
    }
}