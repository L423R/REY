package ru.maxon.project;

import java.util.Date;

/**
 * Created by Maxon on 11.01.2017.
 */
public class test {
    public static void main(String[] args) {
        Date date = new Date(2016-1900,1,13);
        System.out.println(date);

        java.sql.Date date1 = new java.sql.Date(2016-1900,33,13);
        System.out.println(date1);

        String s="1.5.2017";
        String[] mas = s.split("\\.");
        int day= Integer.parseInt(mas[0]);
        int month= Integer.parseInt(mas[1]);
        int year= Integer.parseInt(mas[2]);
        System.out.println(year+" "+month+" "+day);
        System.out.println(new java.sql.Date(year,month,day));

    }
}
