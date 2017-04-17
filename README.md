# LineHeightEditText

Fix edittext lineHeight and cursor effect when set lineSpacingExtra or lineSpacingMultiplier

## EditText vs LineHeightEditText

![EditText vs LineHeightEditText](https://raw.githubusercontent.com/hanks-zyh/LineHeightEditText/master/demo.gif)

## Usage

```groovy
compile 'com.hanks:lineheightedittext-library:1.0'
```

```xml
<com.hanks.lineheightedittext.LineHeightEditText
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:lineSpacingExtra="16dp"
    android:text="Hello World!\nHello World!\nHello World!"
    android:textSize="18sp"
    app:cursorColor="#ff0000"
    app:cursorHeight="21dp"
    app:cursorWidth="2dp"/>
```


# License

```
Copyright 2017 hanks

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
