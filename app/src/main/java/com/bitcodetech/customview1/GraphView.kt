package com.bitcodetech.customview1

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.Toast
import androidx.core.widget.ImageViewCompat
import kotlin.random.Random

@SuppressLint("AppCompatCustomView")
class GraphView(context: Context, attrs : AttributeSet) : ImageView(context, attrs) {

    var values : Array<Int> = arrayOf(0)
    get() = field
    set(values) {
        field = values
    }
    var paint = Paint()


    init {
        paint.color = Color.RED
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        if( values == null )
            return

        Toast.makeText(context, values.size.toString(), Toast.LENGTH_LONG).show()

        var sx = 0f
        var sy = 0f

        paint.color = Color.rgb(
            Math.abs( Random.nextInt() ) % 256,
            Math.abs( Random.nextInt() ) % 256,
            Math.abs( Random.nextInt() ) % 256
        )

        for(i in 0 .. (values.size - 1) ) {
            sy = (height - values[i] * height/100).toFloat()
            canvas?.drawRect(sx, sy, sx - 10 + width/values.size, height.toFloat(), paint)
            sx += width/values.size
        }

    }
}