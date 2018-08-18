package com.manager.font.fontmanager

import android.graphics.Typeface
import android.widget.*

;
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





