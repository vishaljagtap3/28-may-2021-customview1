package com.bitcodetech.customview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.CompoundButton

class MainActivity : AppCompatActivity() {

    /*lateinit var btnExit: ExitButton
    var chkExit: CheckBox? = null*/

    var graphView : GraphView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        graphView = findViewById(R.id.graphView)
        graphView?.values = arrayOf(90, 50, 40, 80, 60)

        /*btnExit = findViewById(R.id.btnExit)
        chkExit = findViewById(R.id.chkExit)
        chkExit?.setOnCheckedChangeListener(ChkExitCheckChangeListener())
        */

        /*
        btnExit = ExitButton(this)
        setContentView(btnExit)*/
    }

    private inner class ChkExitCheckChangeListener : CompoundButton.OnCheckedChangeListener {
        override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
            //btnExit.exitable = isChecked
        }
    }
}