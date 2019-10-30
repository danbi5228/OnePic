package com.example.a1028_onepic_2.ui.PIC_Map;

import android.app.Dialog;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.a1028_onepic_2.Image;

public class ImageDialog extends Dialog {
    TextView cameraText;
    TextView locationText;
    public ImageDialog(@NonNull Context context, Image image) {
        super(context);

    }
}
