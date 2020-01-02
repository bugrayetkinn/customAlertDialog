package com.example.alertview;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;

public class AlertDialogBuilder {

    private Context mContext;
    private AlertDialog.Builder builder;
    private AlertDialog dialog;

    public Context getmContext() {
        return mContext;
    }

    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }

    public AlertDialog.Builder getBuilder() {
        return builder;
    }

    public void setBuilder(AlertDialog.Builder builder) {
        this.builder = builder;
    }

    public AlertDialog getDialog() {
        return dialog;
    }

    public void setDialog(AlertDialog dialog) {
        this.dialog = dialog;
    }


    public void method(Context context, View view){

        this.mContext=context;

        builder=new AlertDialog.Builder(context);
        builder.setIcon(R.drawable.logo);
        builder.setView(view);

        dialog=builder.create();

    }
}
