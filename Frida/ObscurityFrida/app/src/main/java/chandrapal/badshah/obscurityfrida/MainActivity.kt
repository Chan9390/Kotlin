package chandrapal.badshah.obscurityfrida

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private fun nothingImportant1(): String {
        val notImportantVariable = listOf(0x42, 0x61, 0x64, 0x73, 0x68, 0x61, 0x68)
        val buf = StringBuffer()
        notImportantVariable.forEach() {
            buf.append(it.toChar())
        }
        return buf.toString();
    }

    private fun nothingImportant2(): String {
        val notImportantVariable = listOf(0x43, 0x68, 0x40, 0x6e, 0x64, 0x72, 0x40, 0x70, 0x40, 0x31)
        val buf = StringBuffer()
        notImportantVariable.forEach() {
            buf.append(it.toChar())
        }
        return buf.toString();
    }

    private fun controlTextView(one: String, two: String) {
        val textView: TextView = findViewById(R.id.passwd) as TextView
        textView.text = "User: $one \nSecret: $two"
    }

    private fun obscurity() {
        val s = nothingImportant1()
        val t = nothingImportant2()
        controlTextView(s, t)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById(R.id.button) as Button
        btn.setOnClickListener {
            obscurity()
        }
    }
}