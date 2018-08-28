package com.manager.font.fontmanager.ext;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

import com.manager.font.fontmanager.FontIconIGB;
import com.manager.font.fontmanager.R;

public class FontAwesomeTextView extends TextView {

    public String fontawesome;

    public FontAwesomeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.FontAwesomeTextView, 0, 0);

        //String str = a.getString(R.styleable.FontAwesomeButton_fontawesome);
        FontIconIGB.Companion.setTextFontAwesome_Text_View(this);

    }


    public String getFontawesome() {
        return fontawesome;
    }

    public void setFontawesome(String fontawesome) {
        this.fontawesome = fontawesome;
    }
}
