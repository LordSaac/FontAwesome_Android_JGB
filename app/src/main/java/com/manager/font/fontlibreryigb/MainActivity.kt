package com.manager.font.fontlibreryigb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.manager.font.fontmanager.*
import kotlinx.android.synthetic.main.activity_main.*


//Created by jGutierrez 'LordIsaac'
// Date 2018

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Todo 'Kotlin Code Compatible with'




        //TODO load icon SIMPLE
        tv_icon_three.setTextFontAwesome("d-and-d")

        //TODO load icon SIMPLE
        switch1.setTextFontAwesome("anchor")

        //TODO load icon SIMPLE
        button.setTextFontAwesome("angellist")


         //** READ ME IMPORTANT **
        //TODO IF ICON NOT LOAD, TRY WITH SET TYPE
        //TODO TYPE: BRANDS,REGULAR,SOLID.

        //TODO load icon with TYPE FONT
        tv_icon_one.setTextFontAwesome("creative-commons-sa",JGBFontManager.Companion.FAwesomeType.REGULAR)

        //TODO load icon with TYPE FONT
        tv_icon_two.setTextFontAwesome("allergies",JGBFontManager.Companion.FAwesomeType.BRANDS)


        /*
        Todo 'Java Code'
        TextView
        FontIconIGB.Companion.setTextFontAwesome_Text_View(yourTextView,JGBFontManager.Companion.FAwesomeType.BRANDS).setText("user")
        EditText
        FontIconIGB.Companion.setTextEditFontAwesome_Edit_Text(yourEditText).setText("user")
        Button
        FontIconIGB.Companion.setTextEditFontAwesome_Button(yourButton).setText("user")
        FontIconIGB.Companion.setTextSwitchFontAwesome_Switch(yourSwicht).setText("user")
        CheckBox
        FontIconIGB.Companion.setTextCheckBoxFontAwesome_CheckBox(yourCheckBox).setText("user")
        Swictht
        ToggleButton
        FontIconIGB.Companion.setToggleButtonFontAwesome_ToggleButton(yourToggleButton).setText("user"))
        */
    }
}
