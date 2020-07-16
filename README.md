 <h1 align="left"> FontAwesome Manager 1.0.5 </h1>
 
 <p>Easy library for add icons using FontAwesome fonts in your Android project.</p>

<div align="center">

<p align="center">

|Sample 1|Sample 2|
|:----:|:----:|
|<img  height="568" width="320" src="https://github.com/LordSaac/FontAwesome_Android_JGB/blob/master/app/src/main/res/drawable/android.PNG">|<img height="568" width="320" src="https://github.com/LordSaac/FontAwesome_Android_JGB/blob/master/app/src/main/res/drawable/file2.png">|
</p>
 

</div>
 <br>
 <h1 align="left"> Kotlin Code </h1>
 
 <h4> - TextView</h4>
 <code>
 yourTextView.setTextFontAwesome("camera")
 yourTextView.setTextFontAwesome("atom",JGBFontManager.Companion.FAwesomeType.BRANDS)
</code>
 <h4> - EditText</h4>
 <code>
 yourEditView.setTextFontAwesome("atom",JGBFontManager.Companion.FAwesomeType.BRANDS)
 yourEditView.setTextFontAwesome("acquisitions-incorporated",JGBFontManager.Companion.FAwesomeType.REGULAR)
  </code>
 <h4> - Button</h4>
  <code>
 yourButton.setTextFontAwesome("android")
 yourButton.setTextFontAwesome("acquisitions-incorporated",JGBFontManager.Companion.FAwesomeType.REGULAR)
 </code>
 <h4> - Swictht</h4>
  <code>
 yourSwich.setTextFontAwesome("anchor")
 yourSwich.setTextFontAwesome("acquisitions-incorporated",JGBFontManager.Companion.FAwesomeType.REGULAR)
 </code>
 <h4> - CheckBox</h4>
  <code>
 yourCheckBox.setTextFontAwesome("exclamation-circle")
 yourCheckBox.setTextFontAwesome("acquisitions-incorporated",JGBFontManager.Companion.FAwesomeType.REGULAR)
  </code>
<h4> - ToggleButton</h4>
 <code>
 yourToggleButton.setTextFontAwesome("angellist")
 yourToggleButton.setTextFontAwesome("acquisitions-incorporated",JGBFontManager.Companion.FAwesomeType.REGULAR)
  </code>
 <br>
<h1 align="left"> Java Code </h1>
 <h4>- TextView</h4>
  <code>
  FontIconIGB.Companion.setTextFontAwesome_Text_View(yourTextView).setText("user")
  FontIconIGB.Companion.setTextFontAwesome_Text_View(yourTextView,JGBFontManager.Companion.FAwesomeType.BRANDS).setText("user")
  </code>
 <h4>- EditText</h4>
  <code>
  FontIconIGB.Companion.setTextEditFontAwesome_Edit_Text(yourEditText).setText("user")
 FontIconIGB.Companion.setTextEditFontAwesome_Edit_Text(yourTextView,JGBFontManager.Companion.FAwesomeType.BRANDS).setText("user")
  </code>
 <h4>- Button</h4>
  <code>
  FontIconIGB.Companion.setTextEditFontAwesome_Button(yourButton).setText("user")
  FontIconIGB.Companion.setTextEditFontAwesome_Button(yourTextView,JGBFontManager.Companion.FAwesomeType.BRANDS).setText("user")
 </code>
 <h4>- Swictht</h4>
  <code>
  FontIconIGB.Companion.setTextSwitchFontAwesome_Switch(yourSwicht).setText("user")
   FontIconIGB.Companion.setTextSwitchFontAwesome_Switch(yourTextView,JGBFontManager.Companion.FAwesomeType.BRANDS).setText("user")
    </code>
 <h4>- CheckBox</h4>
  <code>
  FontIconIGB.Companion.setTextCheckBoxFontAwesome_CheckBox(yourCheckBox).setText("user")
  FontIconIGB.Companion.setTextCheckBoxFontAwesome_CheckBox(yourTextView,JGBFontManager.Companion.FAwesomeType.BRANDS).setText("user")
 </code>

<h4>- ToggleButton</h4>
 <code>
   FontIconIGB.Companion.setToggleButtonFontAwesome_ToggleButton(yourToggleButton).setText("user"))           FontIconIGB.Companion.setToggleButtonFontAwesome_ToggleButton(yourTextView,JGBFontManager.Companion.FAwesomeType.BRANDS).setText("user")
 </code>
 
## XML Button & TextView:
Write the name font in text

    <com.manager.font.fontmanager.ext.FontAwesomeButton

                android:id="@+id/Button2"
                android:layout_width="match_parent"
                android:layout_height="fill_parent"
                android:includeFontPadding="false"
                android:text="user"
                android:textSize="30sp"
                app:fontawesome="user" />


    <com.manager.font.fontmanager.ext.FontAwesomeTextView

                android:id="@+id/textEdit"
                android:layout_width="match_parent"
                android:layout_height="fill_parent"
                android:includeFontPadding="false"
                android:text="bomb" 
                android:textSize="40sp"
                app:fontawesome="user" />
                
                
### For More Icons:

See more icon here: https://fontawesome.com/icons?d=gallery

# Gradle:

dependencies {

`implementation 'com.manager.font.fontlibreryigb:fontmanager:1.0.5'`

}
<br>
<br>
:coffee: Oh, amazing, I buy you a coffee [Here](https://paypal.me/LordSaac?locale.x=es_XC)
<br>
:star: Or you could give a star [Here](https://github.com/LordSaac/FontAwesome_Android_JGB)
<br>
:raised_hands: Thanks! 


<h2>FontAwesome Released June 18, 2020</h2>

Religion Category Pack
All the major religions of the world (and then some) are represented by these 90 icons in this long-awaited category.
More Business Icons Added
It's Business Time thanks to these 105 boardroom-friendly additions. Sorry, washroom-executive didn't make the cut.
Marketing Category Pack
Use these 93 icons to help your conversion rate, retain your customers, and create fun campaigns.
More Math Icons Added
You can never have enough mathematics. We hope these 57 never-derivative new icons help you crunch those numbers.
More Status Icons Added
We've added more states and options to our volume, wifi, and status icons. Can you hear us now? Okay, good!


## Licence

Copyright 2020 Isaac G. Banda

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
