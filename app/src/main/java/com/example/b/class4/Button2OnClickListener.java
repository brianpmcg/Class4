package com.example.b.class4;


import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
/**
 * Created by b on 1/21/2016.
 */
public class Button2OnClickListener implements View.OnClickListener {

    @Override
    public void onClick(View arg0) {
        Toast.makeText(arg0.getContext(), "Button2 class OnClickListener", Toast.LENGTH_SHORT).show();

    }
}
