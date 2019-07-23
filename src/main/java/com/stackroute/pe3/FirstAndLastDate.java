package com.stackroute.pe3;
import java.util.*;
import java.text.*;
public class FirstAndLastDate {
    public boolean startDate() {
        Calendar calendar= Calendar.getInstance();

// Set the calendar to monday of the current week
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        DateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
       // System.out.println(df.format(c.getTime()));
        String s1 = dateFormat.format(calendar.getTime());
        if (s1.equals("Mon 22/07/2019"))
            return true;
        else
            return false;

    }

    public boolean endDate() {
        Calendar calendar = Calendar.getInstance();
        String s2 = "";
// Set the calendar to monday of the current week
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        DateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
        calendar.add(Calendar.DATE, 6);
        //  System.out.println( c.add(Calendar.DATE,1));
        s2 = (dateFormat.format(calendar.getTime()));
        if (s2.equals("Sun 28/07/2019"))
            return true;
        else
            return false;

    }
}
