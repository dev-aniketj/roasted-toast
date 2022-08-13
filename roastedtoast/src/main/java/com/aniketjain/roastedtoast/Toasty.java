package com.aniketjain.roastedtoast;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Toasty extends ToastyColors {
    private static Toast toast;
    @SuppressLint("StaticFieldLeak")
    private static View view;
    @SuppressLint("StaticFieldLeak")
    private static LinearLayout toastyLinearLayout;
    @SuppressLint("StaticFieldLeak")
    private static ImageView toastyImageView;
    @SuppressLint("StaticFieldLeak")
    private static TextView toastyTextView;

    private static void createToast(Context context) {
        toast = new Toast(context);
    }

    @SuppressLint("InflateParams")
    private static void createView(Context context) {
        view = LayoutInflater.from(context).inflate(R.layout.toasty_layout, null, false);
        findViews(view);
    }

    private static void setUpTextView(int textSize, String textColor) {
        toastyTextView.setTextSize(textSize);
        toastyTextView.setTextColor(Color.parseColor(textColor));
    }

    private static void setUpToast(int duration) {
        toast.setView(view);
        toast.setDuration(duration);
        toast.show();
    }

    private static void findViews(View view) {
        toastyLinearLayout = view.findViewById(R.id.toasty_LinearLayout);
        toastyImageView = view.findViewById(R.id.toasty_imageView);
        toastyTextView = view.findViewById(R.id.toasty_textView);
    }

    private static void basicSetup(String message, int drawable, String backgroundColor) {
        toastyLinearLayout.setBackgroundColor(Color.parseColor(backgroundColor));
        toastyImageView.setBackgroundResource(drawable);
        toastyTextView.setText(message);
    }

    public static void normal(Context context, String message) {
        custom(context, message, 17);
    }

    public static void success(Context context, String message) {
        custom(context, message, R.drawable.ic_baseline_done_24, ToastyColors.SUCCESS_COLOR, 17, ToastyColors.TEXT_COLOR);
    }

    public static void error(Context context, String message) {
        custom(context, message, R.drawable.ic_baseline_error_outline_24, ToastyColors.ERROR_COLOR, 17, ToastyColors.TEXT_COLOR);
    }

    public static void warning(Context context, String message) {
        custom(context, message, R.drawable.ic_baseline_warning_24, ToastyColors.WARNING_COLOR, 17, ToastyColors.TEXT_COLOR);
    }

    // for normal only
    private static void custom(Context context, String message, int textSize) {
        createToast(context);
        createView(context);

        toastyImageView.setVisibility(View.GONE);
        toastyTextView.setText(message);
        toastyTextView.setTextSize(textSize);

        setUpToast(0);
    }

    // for use
    public static void custom(Context context, String message, int drawable, String backgroundColor, int textSize, String textColor) {
        createToast(context);
        createView(context);

        basicSetup(message, drawable, backgroundColor);

        //added
        setUpTextView(textSize, textColor);

        setUpToast(0);
    }

    public static void custom(Context context, String message, int gravity, int duration, int drawable, String backgroundColor, int textSize, String textColor) {
        createToast(context);
        createView(context);

        basicSetup(message, drawable, backgroundColor);

        //added
        setUpTextView(textSize, textColor);

        toast.setGravity(gravity, 0, 0);
        setUpToast(duration);
    }
}
