package com.bitcodetech.customview1

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.TextViewCompat

@SuppressLint("AppCompatCustomView")
class TaskView(context: Context, attrs : AttributeSet?) : TextView(context, attrs) {

    var text : String? = null
    get() = field
    set(value) {
        field = value
    }

    var paint = Paint()

    var isDone = false
    get() = field
    set(value) {
        field = value
    }


    init {
        setPadding(120, 20, 20, 20)
        paint.color = Color.RED
        setOnClickListener(TaskClickListener())
    }

    constructor(context: Context) : this(context, null)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        Log.e("tag", "onDraw Called")
        Toast.makeText(context, "onDraw", Toast.LENGTH_LONG).show()
        canvas?.drawLine(50F, 0F, 50F, bottom.toFloat(), paint)
        canvas?.drawLine(80F, 0F, 80F, bottom.toFloat(), paint)
    }

    private inner class TaskClickListener : View.OnClickListener {
        override fun onClick(v: View?) {
            isDone = !isDone
            setTextColor( if( isDone) Color.GREEN else Color.BLACK)
        }
    }

}