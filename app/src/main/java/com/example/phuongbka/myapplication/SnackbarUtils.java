package com.example.phuongbka.myapplication;

import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by phuongbka on 11/16/17.
 */

public class SnackbarUtils {
    public static Snackbar getInstance1(View view, String messenger) {
        return Snackbar.make(view, messenger, Snackbar.LENGTH_LONG);
    }

    public static void getInstance2(View view, final String message) {
        Snackbar snackbar = Snackbar
                .make(view, "first snackbar", Snackbar.LENGTH_LONG)
                .setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar snackbar1 = Snackbar.make(view, message, Snackbar.LENGTH_LONG);
                        snackbar1.show();
                    }
                });
        snackbar.show();
    }
}
