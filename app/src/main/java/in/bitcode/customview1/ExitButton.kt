package `in`.bitcode.customview1

import android.content.Context
import android.view.View
import androidx.appcompat.widget.AppCompatButton

class ExitButton(context : Context) : AppCompatButton(context) {

    var exitable: Boolean  = true
    get() = field
    set(value) { field = value }

    var i = 100

    init {
        setOnClickListener(ExitButtonClickListener())
    }

    private inner class ExitButtonClickListener : View.OnClickListener {
        override fun onClick(v: View?) {
            if( exitable ) {
                System.exit(0)
            }
        }
    }

}