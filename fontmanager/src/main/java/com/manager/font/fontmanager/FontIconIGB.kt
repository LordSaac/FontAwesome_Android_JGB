package com.manager.font.fontmanager

import android.content.Context
import android.graphics.Typeface
import android.widget.*

//Created by jGutierrez 'LordIsaac'
// Date 2018

//<For Java>
class FontIconIGB{

    companion object {



        fun setTextEditFontAwesome_Edit_Text(edit:EditText): EditText{

            val context = edit.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
            edit.setTypeface(typeface)

            return edit
        }


        fun setTextEditFontAwesome_Edit_Text(edit:EditText,type: JGBFontManager.Companion.FAwesomeType): EditText{

            val context = edit.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getTypeFontAwesome(type))
            edit.setTypeface(typeface)

            return edit
        }

        fun setTextFontAwesome_Text_View(text: TextView): TextView{

            val context = text.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
            text.setTypeface(typeface)

            return  text

        }

        fun setTextFontAwesome_Text_View(text: TextView,type: JGBFontManager.Companion.FAwesomeType): TextView{

            val context = text.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getTypeFontAwesome(type))
            text.setTypeface(typeface)

            return  text

        }

        fun setTextFontAwesome_Button(btn: Button): Button{

            val context = btn.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
            btn.setTypeface(typeface)

            return btn
        }


        fun setTextFontAwesome_Button(btn: Button,type: JGBFontManager.Companion.FAwesomeType): Button{

            val context = btn.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getTypeFontAwesome(type))
            btn.setTypeface(typeface)

            return btn
        }

        fun setTextSwitchFontAwesome_Switch(swt: Switch):Switch{

            val context = swt.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
            swt.setTypeface(typeface)

            return swt

        }


        fun setTextSwitchFontAwesome_Switch(swt: Switch,type: JGBFontManager.Companion.FAwesomeType):Switch{

            val context = swt.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getTypeFontAwesome(type))
            swt.setTypeface(typeface)

            return swt

        }

        fun setTextCheckBoxFontAwesome_CheckBox(cb:CheckBox): CheckBox{

            val context = cb.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
            cb.setTypeface(typeface)

            return cb

        }

        fun setTextCheckBoxFontAwesome_CheckBox(cb:CheckBox,type: JGBFontManager.Companion.FAwesomeType): CheckBox{

            val context = cb.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getTypeFontAwesome(type))
            cb.setTypeface(typeface)

            return cb

        }

        fun setToggleButtonFontAwesome_ToggleButton(tgb:ToggleButton):ToggleButton{

            val context = tgb.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
            tgb.setTypeface(typeface)

            return tgb

        }

        fun setToggleButtonFontAwesome_ToggleButton(tgb:ToggleButton,type: JGBFontManager.Companion.FAwesomeType):ToggleButton{

            val context = tgb.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets,  JGBFontManager.getTypeFontAwesome(type))
            tgb.setTypeface(typeface)

            return tgb

        }

    }
}
//
//fun setFont(getFont:String,font: String ,valid: Int): Boolean{
//
//    if(getFont.equals(font))
//
//}

//<For Kotlin>

fun EditText.setTextFontAwesome(font: String){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
    this.setTypeface(typeface)
    this.setText(font)
}


fun EditText.setTextFontAwesome(font: String,type:JGBFontManager.Companion.FAwesomeType){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getTypeFontAwesome(type))
    this.setTypeface(typeface)
    this.setText(font)

}

fun TextView.setTextFontAwesome(font: String){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeRegular())
    this.setTypeface(typeface)
    this.setText(font)


}


fun TextView.setTextFontAwesome(font: String,type:JGBFontManager.Companion.FAwesomeType){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getTypeFontAwesome(type))
    this.setTypeface(typeface)
    this.setText(font)

}

fun Button.setTextFontAwesome(font: String){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeRegular())
    this.setTypeface(typeface)
    this.setText(font)

}


fun Button.setTextFontAwesome(font: String,type:JGBFontManager.Companion.FAwesomeType){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getTypeFontAwesome(type))
    this.setTypeface(typeface)
    this.setText(font)

}

fun Switch.setTextFontAwesome(font: String){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
    this.setTypeface(typeface)
    this.setText(font)

}

fun CheckBox.setTextFontAwesome(font: String){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
    this.setTypeface(typeface)
    this.setText(font)

}

fun CheckBox.setTextFontAwesome(font: String,type:JGBFontManager.Companion.FAwesomeType){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getTypeFontAwesome(type))
    this.setTypeface(typeface)
    this.setText(font)

}

fun ToggleButton.setTextFontAwesome(font: String){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
    this.setTypeface(typeface)
    this.setText(font)

}

fun ToggleButton.setTextFontAwesome(font: String,type:JGBFontManager.Companion.FAwesomeType){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getTypeFontAwesome(type))
    this.setTypeface(typeface)
    this.setText(font)

}




