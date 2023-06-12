package com.company.online_president_saylovi.frontend.util;

import java.util.Scanner;

public class ScanUtil {
    public static String getInputAsString(String title){
        System.out.println(title);
        return new Scanner(System.in).nextLine();
    }
    public static Integer getInputAsInteger(String title){
        System.out.println(title);
        return new Scanner(System.in).nextInt();
    }
}
