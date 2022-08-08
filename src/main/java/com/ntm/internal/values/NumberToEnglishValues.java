package com.ntm.internal.values;

import java.util.HashMap;
import java.util.Map;

public class NumberToEnglishValues {

    private NumberToEnglishValues (){
        throw new IllegalAccessError("Util Class");
    }


        private static final Map<Integer, String> singleNumber
             = new HashMap<>() {{
          put(0,"");
         put(1," One");
         put(2," Two");
         put(3," Three");
         put(4," Four");
         put(5," Five");
         put(6," Six");
         put(7," Seven");
         put(8," Eight");
         put(9," Nine");
     }};

     private static final Map<Integer, String> twoDigitNumber=new HashMap<>(){
          {

               put(10, " Ten");
               put(11, " Eleven");
               put(12, " Twelve");
               put(13, " Thirteen");
               put(14, " Fourteen");
               put(15, " Fifteen");
               put(16, " Sixteen");
               put(17, " Seventeen");
               put(18, " Eighteen");
               put(19, " Nineteen");
          }};

   private static final Map<Integer, String> tensValues=new HashMap<>(){
          {
               put(20, " Twenty");
               put(30, " Thirty");
               put(40, " Forty");
               put(50, " Fifty");
               put(60, " Sixty");
               put(70, " Seventy");
               put(80, " Eighty");
               put(90, " Ninety");
          }};


     private static final Map<Integer, String> thousandValues=new HashMap<>(){{
         put(0,"");
           put(1," Thousand");
          put(2," Million");
          put(3," Billion");
          put(4," Trillion");
          put(5," Quadrillion");
         put(6," Quintrillion");
     }};


    private static final Map<Integer, String> hundredValues
            = new HashMap<>() {{
        put(100," One Hundred");
        put(200," Two Hundred");
        put(300," Three Hundred");
        put(400," Four Hundred");
        put(500," Five Hundred");
        put(600," Six Hundred");
        put(700," Seven Hundred");
        put(800," Eight Hundred");
        put(900," Nine Hundred");
    }};

     public static String getSingleDigitValue(int key) {
         return singleNumber.get(key);
     }

    public static String getHundredValue(int key) {
        return hundredValues.get(key);
    }
     public static String getTwoDigitValue(int key) {
          return twoDigitNumber.get(key);
     }

     public static String getTensValue(int key) {
          return tensValues.get(key);
     }

     public static String getThousandValue(int key) {
          return thousandValues.get(key);
     }




}
