package com.bitcodetech.customview1

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatButton

class ExitButton(context : Context, attrs : AttributeSet?) : AppCompatButton(context, attrs) {

    var exitable: Boolean  = true
    get() = field
    set(value) { field = value }

    lateinit var mContext : Context

    init {
        setOnClickListener(ExitButtonClickListener())
        mContext = context
    }

    constructor(context: Context) : this(context, null)

    private inner class ExitButtonClickListener : View.OnClickListener {
        override fun onClick(v: View?) {
            if( exitable ) {
                System.exit(0)
            }
        }
    }

}