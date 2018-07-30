package com.manager.font.fontlibreryigb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.manager.font.fontmanager.JGBFontManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // load icon using the library
        JGBFontManager.setTextViewFontAwesomeBrands(tv_icon_two,this).setText(JGBFontManager.fontCash)
        // load icon using inicode
        // for more icon here: https://fontawesome.com/icons?d=gallery&m=free
        JGBFontManager.setTextViewFontAwesomeBrands(tv_icon_one,this).setText("\uF2B9")
        // load icon using name fonts
        JGBFontManager.setTextViewFontAwesomeBrands(tv_icon_three,this).setText("Camera")

    }
}
