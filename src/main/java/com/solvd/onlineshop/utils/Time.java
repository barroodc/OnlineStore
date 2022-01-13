package com.solvd.onlineshop.utils;

import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.Random;

public class Time {

    public static void timeCalc(){
        long rangebegin = Timestamp.valueOf("2021-01-01 00:00:00").getTime();
        long rangeend = Timestamp.valueOf("2022-01-11 23:59:59").getTime();
        long diff = rangeend - rangebegin + 1;
        Timestamp rand = new Timestamp(rangebegin + (long)(Math.random() * diff));
        System.out.println(rand.toInstant());
    }

    public static void main(String[] args) {
        timeCalc();
    }
}
