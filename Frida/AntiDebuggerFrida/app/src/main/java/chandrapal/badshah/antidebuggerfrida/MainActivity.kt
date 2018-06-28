package chandrapal.badshah.antidebuggerfrida

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById(R.id.button) as Button
        btn.setOnClickListener {
            if(android.os.Debug.isDebuggerConnected()) {
                textView.text = "App is being debugged"
            }
            else {
                textView.text = "My Sensitive App"
            }
        }
    }
}


