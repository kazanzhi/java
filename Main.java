package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        Znak z = new Znak();
        z.set_BirthDate(new GregorianCalendar(1956,1,1));
        System.out.println(z.zodiac());
    }
}

