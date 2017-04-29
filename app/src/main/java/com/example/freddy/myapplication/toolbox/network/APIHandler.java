package com.example.freddy.myapplication.toolbox.network;

import android.app.Activity;
import android.content.Intent;

import com.example.freddy.myapplication.LoginActivity;

/**
 * Created by Freddy on 4/29/2017.
 */

public class APIHandler
{
    private String privateKey;
    private String publicKey;

    public static void authenticate(Activity launcher)
    {
        Intent intent = new Intent(launcher, LoginActivity.class);
        launcher.startActivity(intent);
    }

}
