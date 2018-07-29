package com.manager.font.fontmanager

import android.content.Context
import android.graphics.Typeface
import android.widget.EditText
import android.widget.TextView

class JGBFontAwesomeManager {

    companion object {

        private val ruteFont: String = "fonts/"
        private val typeFont :String = ".otf"

        private val fontAwesomeRegular: String = "Font Awesome 5 Brands-Regular-400"
        private val fontAwesomeSolid: String = "Font Awesome 5 Free-Regular-400"
        private val fontAwesomeBrands: String = "Font Awesome 5 Free-Solid-900"

        val fontList: String = "\uF46D"
        val fontDownload:String = "\uF381"
        val fontEndDay :String= "\uF0C7"
        val fontLogOut :String= "\uF2F5"
        val fontInventory :String= "\uF466"
        val fontSettings :String= "\uF085"
        val fontSupport :String= "\uF0ad"
        val fontChevronRight: String = "\uF054"
        val fontChange: String = "\uF362"
        val fontWarning: String = "\uF071"
        val fontBack: String = "\uF359"
        val fontInstal: String = "\uF0ad"
        val fontListConstans: String = "\uF46d"
        val fontChain: String = "\uF0c1"
        val fontNotch: String = "\uF1ce"
        val fontPlus: String = "\uF055"
        val fontBriefCase: String = "\uF0b1"
        val fontCamera: String = "\uF030"
        val fontsend: String = "\uF1d8"
        val fontExclametion: String = "\uF06a"
        val fontCheckReady: String = "\uF058"
        val fontMine: String = "\uF056"
        val fontFolder: String =  "\uF07c"
        val fontDownloadRow = "\uF019"
        val fontEdit = "\uF044"
        val fontErase = "\uF2ed"
        val fontDelete = "\uF057"
        val fontLocation = "\uF3c5"
        val fontIdCard = "\uF2c2"
        val fontChevronLeft = "\uF053"
        val fontCaretRight = "\uF0da"
        val fontCaretDown = "\uF0d7"
        val fontHoriEllipsi = "\uF141"
        val fontVertEllipsi = "\uF142"
        val fontDotCircle = "\uF138"
        val fontCircle = "\uF111"
        val fontInvoiceDollar = "\uF155"
        val fontCreditCard = "\uF09d"
        val fontCash = "\uF3d1"
        val fontCheck = "\uF53d"
        val fontChecked = "\uF00c"
        val fontUniversity = "\uF19c"

        val fontDownloadBasic = "\uF019"
        val fontUploadBasic = "\uF093"
        val fontHourglassBasic = "\uF253"
        val fontUserCircleOne = "\uF2bd"
        val fontUserCircleTwo = "\uF2bd"
        val fontFileDownload = "\uF56d"
        val fontSave = "\uF0c7"
        val fontBuilding = "\uF1ad"
        val fontMaps = "\uF5a0"
        val fontTrashAlt = "\uF2ed"
        val fontLock = "\uF023"
        val fontPrint = "\uF02f"
        val FontUs = "\uF007"

        fun getFontAwesomeBrands():String{
            return ruteFont + fontAwesomeBrands + typeFont
        }

        fun getFontAwesomeSolid():String{
            return ruteFont + fontAwesomeSolid + typeFont
        }

        fun getFontAwesomeRegular():String{
            return ruteFont + fontAwesomeRegular + typeFont
        }


        fun setEditTextFontAwesomeSolid(edt: EditText, contex: Context):EditText{
            val typeface = Typeface.createFromAsset(contex.assets, getFontAwesomeSolid())
            edt.setTypeface(typeface)
            return edt
        }

        fun setTextViewFontAwesomeSolid(tv: TextView, contex:Context):TextView{
            val typeface = Typeface.createFromAsset(contex.assets, getFontAwesomeSolid())
            tv.setTypeface(typeface)
            return tv
        }

        fun setEditTextFontAwesomeBrands(edt: EditText, contex: Context):EditText{
            val typeface = Typeface.createFromAsset(contex.assets, getFontAwesomeBrands())
            edt.setTypeface(typeface)
            return edt
        }

        fun setTextViewFontAwesomeBrands(tv: TextView, contex:Context):TextView{
            val typeface = Typeface.createFromAsset(contex.assets, getFontAwesomeBrands())
            tv.setTypeface(typeface)
            return tv
        }


        fun setEditTextFontAwesomeRegular(edt: EditText, contex: Context):EditText{
            val typeface = Typeface.createFromAsset(contex.assets, getFontAwesomeRegular())
            edt.setTypeface(typeface)
            return edt
        }

        fun setTextViewFontAwesomeRegular(tv: TextView, contex:Context):TextView{
            val typeface = Typeface.createFromAsset(contex.assets, getFontAwesomeRegular())
            tv.setTypeface(typeface)
            return tv
        }
    }
}