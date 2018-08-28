 # Font Manager 0.0.8

### Dependency

dependencies {<br>
` implementation 'com.manager.font.fontlibreryigb:fontmanager:0.0.8'`
 <br>
}

<img src="https://github.com/LordSaac/FontLibreryJGB/blob/master/app/src/main/res/drawable/screen.png">

### Kotlin Code Compatible with:
 <h4>TextView</h4>
 yourTextView.setTextFontAwesome("camera")

 <h4>EditText</h4>
 <a>yourEditText.setTextFontAwesome("user")</a>

 <h4>Button</h4>
 yourButton.setTextFontAwesome("android")

 <h4>Swictht</h4>
 yourSwich.setTextFontAwesome("anchor")

 <h4>CheckBox</h4>
 yourCheckBox.setTextFontAwesome("exclamation-circle")

<h4>ToggleButton</h4>
 yourToggleButton.setTextFontAwesome("angellist")


### Java Code Compatible with:
 <h4>TextView</h4>
  FontIconIGB.setTextFontAwesome_Text_View(yourTextView).setText("user")

 <h4>EditText</h4>
  FontIconIGB.setTextEditFontAwesome_Edit_Text(yourEditText).setText("user")

 <h4>Button</h4>
  FontIconIGB.setTextEditFontAwesome_Edit_Text(yourButton).setText("user")

 <h4>Swictht</h4>
  FontIconIGB.setTextSwitchFontAwesome_Switch(yourSwicht).setText("user")

 <h4>CheckBox</h4>
  FontIconIGB.setTextCheckBoxFontAwesome_CheckBox(yourCheckBox).setText("user")

<h4>ToggleButton</h4>
  FontIconIGB.setToggleButtonFontAwesome_ToggleButton(yourToggleButton).setText("user"))
  
### XML Button & TextView:
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

https://fontawesome.com/icons?d=gallery

## Licence

Copyright 2018 Isaac G. Banda

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
