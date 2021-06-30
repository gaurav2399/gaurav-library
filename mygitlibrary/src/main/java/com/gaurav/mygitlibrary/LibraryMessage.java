package com.gaurav.mygitlibrary;

import android.content.Context;
import android.widget.Toast;

public class LibraryMessage {

    public static void msg(Context c, String m){
        Toast.makeText(c,m,Toast.LENGTH_LONG).show();
    }
}
