package com.example.agrostoremini;

import android.content.Context;
import android.content.DialogInterface;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.Locale;

public class AppLanguageDialog {

    public static void show(Context context) {

        new MaterialAlertDialogBuilder(context)
                .setTitle(R.string.app_language)
                .setIcon(R.drawable.round_language_24)
                .setSingleChoiceItems(R.array.app_languages, 0, (DialogInterface.OnClickListener) (dialog, which) -> {

                    switch (which) {

                        case 0:
                            Locale.setDefault(Locale.forLanguageTag("en"));
                            break;
                        case 1:
                            Locale.setDefault(Locale.forLanguageTag("hi"));
                            break;
                        case 2:
                            Locale.setDefault(Locale.forLanguageTag("mr"));
                            break;
                        default:
                            break;
                    }
                    dialog.dismiss();
                })
                .create()
                .show();
    }
}
