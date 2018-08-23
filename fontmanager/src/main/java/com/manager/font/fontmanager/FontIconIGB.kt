package com.manager.font.fontmanager

import android.graphics.Typeface
import android.widget.*


//<For Java>
class FontIconIGB{

    companion object {

        fun setEditFontAwesome(font: String, edit:EditText){

            val context = edit.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
            edit.setTypeface(typeface)
            edit.setText(font)

        }

        fun setViewFontAwesome(font: String, text: TextView){

            val context = text.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
            text.setTypeface(typeface)
            text.setText(font)

        }

        fun setButtonFontAwesome(font: String, btn: Button){

            val context = btn.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
            btn.setTypeface(typeface)
            btn.setText(font)

        }

        fun setSwitchFontAwesome(font: String, swt: Switch){

            val context = swt.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
            swt.setTypeface(typeface)
            swt.setText(font)

        }

        fun setCheckBoxFontAwesome(font: String, cb:CheckBox){

            val context = cb.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
            cb.setTypeface(typeface)
            cb.setText(font)

        }

        fun setToggleButtonFontAwesome(font: String,tgb:ToggleButton){

            val context = tgb.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
            tgb.setTypeface(typeface)
            tgb.setText(font)

        }

    }
}


//<For Kotlin>
fun EditText.setTextFontAwesome(font: String){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
    this.setTypeface(typeface)
    this.setText(font)

}

fun TextView.setTextFontAwesome(font: String){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
    this.setTypeface(typeface)
    this.setText(font)

}

fun Button.setTextFontAwesome(font: String){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
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

fun ToggleButton.setTextFontAwesome(font: String){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
    this.setTypeface(typeface)
    this.setText(font)

}





