package com.test.helper;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {

    public static String getDateWithoutTime(Date date){
        SimpleDateFormat formatter = new SimpleDateFormat(
                "MMMM dd ,yyyy");
        return formatter.format(date);
    }

}
