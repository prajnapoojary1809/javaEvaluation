package Problem1;

import java.util.*;

public class DaysFormat {
        int year=0,months=0,days=0;
        int N=456;
        int remaining_days=0;
        int lyear=0;
        int daysLeft=0;



        public void NumberOfyear(){

            year=N/365;
            lyear=year/4;

            remaining_days=N%365;

            months=remaining_days/30;

            daysLeft=remaining_days%30;

        }

    public static void main(String[] args) {

            DaysFormat df=new DaysFormat();
            df.NumberOfyear();
        System.out.println("year" +df.year);
        System.out.println("months"+ df.months);
        System.out.println("days" +df.daysLeft);
    }

}



