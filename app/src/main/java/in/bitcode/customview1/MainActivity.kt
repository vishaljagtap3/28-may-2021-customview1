package `in`.bitcode.customview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton

class MainActivity : AppCompatActivity() {

    lateinit var btnExit: ExitButton
    var chkExit: CheckBox? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        btnExit = findViewById(R.id.btnExit)
        chkExit = findViewById(R.id.chkExit)

        chkExit?.setOnCheckedChangeListener(ChkExitCheckChangeListener())

        /*
        btnExit = ExitButton(this)
        setContentView(btnExit)*/
    }

    private inner class ChkExitCheckChangeListener : CompoundButton.OnCheckedChangeListener {
        override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
            btnExit.exitable = isChecked
        }
    }
}