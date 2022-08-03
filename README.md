
# RoastedToast ❤️🔥

[![platform](https://img.shields.io/badge/platform-Android-brightgreen.svg?style=flat)](https://www.android.com)
[![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=16)
[![1.0.1](https://jitpack.io/v/dev-aniketj/RoastedToast.svg)](https://jitpack.io/#dev-aniketj/RoastedToast)

[!["Buy Me A Coffee"](https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png)](https://www.buymeacoffee.com/aniketjain)

## Prerequisites

Add this in your root `build.gradle` file (not your module `build.gradle` file):

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```
dependencies {
	        implementation 'com.github.dev-aniketj:RoastedToast:1.0.1'
	}
```

## Usage

To display an normal Toast:
```
Toasty.normal(context, "Normal Toast");
```

To display an success Toast:
```
Toasty.success(context, "Success Toast");
```

To display an error Toast:
```
Toasty.error(context, "Error Toast");
```

To display an warning Toast:
```
Toasty.warning(context, "Warning Toast");
```

## Screenshots

<p float="left">
	<img src="https://github.com/dev-aniketj/RoastedToast/blob/master/Screenshots/normal_SS.png" width="200"/>
	<img src="https://github.com/dev-aniketj/RoastedToast/blob/master/Screenshots/success_SS.png" width="200"/>
	<img src="https://github.com/dev-aniketj/RoastedToast/blob/master/Screenshots/error_SS.png" width="200"/>
	<img src="https://github.com/dev-aniketj/RoastedToast/blob/master/Screenshots/warning_SS.png" width="200"/>
	<img src="https://github.com/dev-aniketj/RoastedToast/blob/master/Screenshots/custom_SS.png" width="200"/>
</p>

## Custom Toast 🔥❤️🔥

To display the custom Toast:

### There is many ways to write a custom Toast, use anyone of them to create a custom Toast.

> #### Way 1:
```
Toasty.custom(Context context, String message)
```
> #### Example 1:
```
Toasty.custom(context, "Custom Toast");
```

> #### Way 2:
```
Toasty.custom(Context context, String message, int textSize)
```
> #### Example 2:
```
Toasty.custom(context, "Custom Toast", 18);
```

> #### Way 3:
```
Toasty.custom(Context context, String message, int gravity, int duration)
```
> #### Example 3:
```
Toasty.custom(context, "Custom Toast", Gravity.CENTER, Toast.LENGTH_SHORT);
```

> #### Way 4:
```
Toasty.custom(Context context, String message, int drawable, String backgroundColor)
```
> #### Example 4:
```
Toasty.custom(context, "Custom Toast", R.drawable.icon, "#ff3300");
```

> #### Way 5:
```
Toasty.custom(Context context, String message, int duration, int drawable, String backgroundColor)
```
> #### Example 5:
```
Toasty.custom(context, "Custom Toast", Toast.LENGTH_SHORT, R.drawable.icon, "#ff3300");
```

> #### Way 6:
```
Toasty.custom(Context context, String message, int gravity, int duration, int drawable, String backgroundColor)
```
> #### Example 6:
```
Toasty.custom(context, "Custom Toast", Gravity.CENTER, Toast.LENGTH_SHORT, R.drawable.icon, "#ff3300");
```

> #### Way 7:
```
Toasty.custom(Context context, String message, int drawable, String backgroundColor, int textSize, String textColor)
```
> #### Example 7:
```
Toasty.custom(context, "Custom Toast", R.drawable.icon, "#ff3300", 19, "#f9f9f9");
```

> #### Way 8:
```
Toasty.custom(Context context, String message, int duration, int drawable, String backgroundColor, int textSize, String textColor)
```
> #### Example 8:
```
Toasty.custom(context, "Custom Toast", Toast.LENGTH_SHORT, R.drawable.icon, "#ff3300", 19, "#f9f9f9");
```

> #### Way 9:
```
Toasty.custom(Context context, String message, int gravity, int duration, int drawable, String backgroundColor, int textSize, String textColor)
```
> #### Example 9:
```
Toasty.custom(context, "Custom Toast", Gravity.CENTER, Toast.LENGTH_SHORT, R.drawable.icon, "#ff3300", 19, "#f9f9f9");
```

> #### Way 10:
```
Toasty.custom(Context context, String message, int drawable, String backgroundColor, int toastyWidth, int toastyHeight)
```
> #### Example 10:
```
Toasty.custom(context, "Custom Toast", R.drawable.icon, "#ff3300", 200, 200);
```

> #### Way 11:
```
Toasty.custom(Context context, String message, int gravity, int duration, int drawable, String backgroundColor, int toastyWidth, int toastyHeight)
```
> #### Example 11:
```
Toasty.custom(context, "Custom Toast", Gravity.CENTER, Toast.LENGTH_SHORT, R.drawable.icon, "#ff3300", 200, 200);
```

> #### Way 12:
```
Toasty.custom(Context context, String message, int drawable, String backgroundColor, int textSize, String textColor, int toastyWidth, int toastyHeight)
```
> #### Example 12:
```
Toasty.custom(context, "Custom Toast", R.drawable.icon, "#ff3300", 19, "#f9f9f9", 200, 200);
```

> #### Way 13:
```
Toasty.custom(Context context, String message, int gravity, int duration, int drawable, String backgroundColor, int textSize, String textColor, int toastyWidth, int toastyHeight)
```
> #### Example 13:
```
Toasty.custom(context, "Custom Toast", Gravity.CENTER, Toast.LENGTH_SHORT, R.drawable.icon, "#ff3300", 19, "#f9f9f9", 200, 200);
```

## Contributing

Please fork this repository and contribute back. Any contributions, large or small, major or minor features, bug fixes, are welcomed and appreciated but will be thoroughly reviewed.
#### Thank you.

## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2022 dev-aniketj

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
