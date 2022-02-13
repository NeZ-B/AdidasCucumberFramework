package com.demoblaze.utilities;

public class BrowserUtils {

    //sleep methodu buraya koyacağız: try-catch blok olacak to handle the failed part.
    public static void sleep(int second){
        second*=1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){
            System.out.println("Something happened in the sleep method");
        }
    }

}
