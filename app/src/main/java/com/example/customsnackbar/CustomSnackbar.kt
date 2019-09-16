package com.example.customsnackbar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar

class CustomSnackbar (
    parent: ViewGroup,
    content: SnackbarView
) : BaseTransientBottomBar<CustomSnackbar>(parent, content, content) {
    init {
        getView().setBackgroundColor(ContextCompat.getColor(view.context, android.R.color.transparent))
    }

    companion object {

        fun make(view: View): CustomSnackbar {

            // First we find a suitable parent for our custom view
            val parent = view.findSuitableParent() ?: throw IllegalArgumentException(
                "No suitable parent found from the given view. Please provide a valid view."
            )

            // We inflate our custom view
            val customView = LayoutInflater.from(view.context).inflate(
                R.layout.layout_custom_snackbar,
                parent,
                false
            ) as SnackbarView

            // We create and return our Snackbar
            return CustomSnackbar(
                parent,
                customView
            )
        }

    }
}