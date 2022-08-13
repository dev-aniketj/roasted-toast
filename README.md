
# RoastedToast ❤️🔥

[![platform](https://img.shields.io/badge/platform-Android-brightgreen.svg?style=flat)](https://www.android.com)
[![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=16)
[![1.0.2](https://jitpack.io/v/dev-aniketj/roasted-toast.svg)](https://jitpack.io/#dev-aniketj/roasted-toast)

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
	        implementation 'com.github.dev-aniketj:roasted-toast:1.0.2'
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
Toasty.custom(Context context, String message, int drawable, String backgroundColor, int textSize, String textColor)
```
> #### Example 1:
```
Toasty.custom(context, "Custom Toast", R.drawable.icon, "#ff3300", 16, "#f9f9f9");
```

> #### Way 2:
```
Toasty.custom(Context context, String message, int gravity, int duration, int drawable, String backgroundColor, int textSize, String textColor)
```
> #### Example 2:
```
Toasty.custom(context, "Custom Toast", Gravity.BOTTOM, Toast.LENGTH_SHORT, R.drawable.icon, "#ff3300", 16, "#f9f9f9");
```

## Contributing

Please fork this repository and contribute back. Any contributions, large or small, major or minor features, bug fixes, are welcomed and appreciated but will be thoroughly reviewed.
#### Thank you.
