package com.chandrapal.test.deviceinfo

import android.graphics.Typeface
import android.os.Build
import android.os.Build.VERSION
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        board.text = android.os.Build.BOARD
        bootloader.text = android.os.Build.BOOTLOADER
        brand.text = android.os.Build.BRAND
        device.text = android.os.Build.DEVICE
        display.text = android.os.Build.DISPLAY
        fingerprint.text = android.os.Build.FINGERPRINT
        hardware.text = android.os.Build.HARDWARE
        host.text = android.os.Build.HOST
        id.text = android.os.Build.ID
        manufacturer.text = android.os.Build.MANUFACTURER
        model.text = android.os.Build.MODEL
        product.text = android.os.Build.PRODUCT
        tags.text = android.os.Build.TAGS
        type.text = android.os.Build.TYPE
        unknown.text = android.os.Build.UNKNOWN
        user.text = android.os.Build.USER
        getRadio.text = android.os.Build.getRadioVersion()

    }
}
