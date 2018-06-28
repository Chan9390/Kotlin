package chandrapal.badshah.antivmfrida

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Build
import android.widget.Button
import chandrapal.badshah.antivmfrida.R.id.output
import java.util.logging.Logger


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById(R.id.button) as Button
        btn.setOnClickListener {
            if(hasEmulatorBuildProp()) {
                output.text = "You are running this on emulator"
            } else {
                output.text = "My Sensitive Android Application"
            }
        }
    }

    fun hasEmulatorBuildProp(): Boolean {

        return (Build.FINGERPRINT.startsWith("generic")
                || Build.FINGERPRINT.startsWith("unknown")
                || Build.MODEL.contains("google_sdk")
                || Build.MODEL.contains("sdk")
                || Build.MODEL.contains("Emulator")
                || Build.MODEL.contains("Android SDK built for x86")
                || Build.MANUFACTURER.contains("Genymotion")
                || Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")
                || Build.PRODUCT.contains("google_sdk")
                || Build.PRODUCT.contains("sdk")
                || Build.HARDWARE.contains("goldfish")
                || Build.HARDWARE.contains("ranchu")
                || Build.BOARD.contains("unknown")
                || Build.ID.contains("FRF91")
                || Build.MANUFACTURER.contains("unknown")
                || Build.USER.contains("android-build"))
    }
}


