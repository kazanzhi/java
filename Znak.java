package com.company;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Calendar;

public class Znak
{
    private String FIO;
    private Calendar BirthDate;

    public String get_FIO(){ return FIO;}
    public void set_FIO(String FIO){ this.FIO = FIO;}
    public Calendar get_BirthDate(){ return BirthDate;}
    public void set_BirthDate(Calendar BirthDate){ this.BirthDate = BirthDate;}

    public void Input(String _FIO,Calendar _BirthDate)
    {
        if(_FIO.length() < 30)
            FIO = _FIO;
        if(_BirthDate.after(new GregorianCalendar(1900,1,1)))
            BirthDate = _BirthDate;
    }
    public void Output()
    {
        System.out.println("Фио: " + FIO);
        System.out.println("Дата рождения: " + BirthDate.get(Calendar.YEAR) + "." + BirthDate.get(Calendar.MONTH) + "." + BirthDate.get(Calendar.DAY_OF_MONTH));
    }
    public String zodiac()
    {

        String date = String.valueOf(BirthDate.get(Calendar.MONTH) + "." + BirthDate.get(Calendar.DAY_OF_MONTH));
        double i = Double.parseDouble(date);

        String r = "";
        if(1.1 <= i && i < 1.23)
        {
            r = "Capricorn";
        }
         else if (01.23 <= i && i <= 02.19)
        {
            r = "Aquarius";
        }
        else if (02.20 <= i && i <= 03.21)
        {
            r = "Pisces";
        }
        else if (03.21 <= i && i <= 04.21)
        {
            r = "Aries";
        }
        else if (04.21 <= i && i <= 05.20)
        {
            r = "Taurus";
        }
        else if (05.21 <= i && i <= 06.20)
        {
            r = "Gemini";
        }
        else if (06.21 <= i && i <= 07.22)
        {
            r = "Cancer";
        }
        else if (07.23 <= i && i <= 08.23)
        {
            r = "Leo";
        }
        else if (08.24 <= i && i <= 09.23)
        {
            r = "Virgo";
        }
        else if (09.24 <= i && i <= 10.23)
        {
            r = "Libra";
        }
        else if (10.24 <= i && i <= 11.21)
        {
            r = "Scorpio";
        }
        else if (11.22 <= i && i <= 12.21)
        {
            r = "Sagittarius";
        }
        else if (12.22 <= i )
        {
            r = "Capricorn";
        }
        else
        {
            r = "invalid data";
        }
        return r;


    }
}
