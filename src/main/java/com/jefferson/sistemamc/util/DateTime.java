package com.jefferson.sistemamc.util;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateTime {

    public static String getCurrentDateTimeInMillis() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        return sdf.format(new Date());
    }
}