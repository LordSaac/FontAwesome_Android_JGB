package com.manager.font.fontlibreryigb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.manager.font.fontmanager.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //<For Kotlin>
        // load icon using the library
        tv_icon_one.setTextFontAwesome(JGBFontManager.fontCash)
        // load icon using inicode
        // for more icon here: https://fontawesome.com/icons?d=gallery&m=free
        tv_icon_two.setTextFontAwesome("\uF2B9")
        // load icon using name fonts
        tv_icon_three.setTextFontAwesome("\uF5dc")
        // load icon
        switch1.setTextFontAwesome("lightbulb")
        // load icon
        button.setTextFontAwesome("brain")

        //<For Java>

        FontIconIGB.setButtonFontAwesome("brain",button)

    }
}
