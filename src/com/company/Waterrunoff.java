package com.company;
import java.util.Scanner;
public class Waterrunoff {
    public static void main (String [] args){
        Scanner Keyboard = new Scanner(System.in);

        System.out.println("Length of roof in feet");
        int Lengthofroofinfeet = Keyboard.nextInt();

        System.out.println("Width of roof in feet");
        int Widthofroofinfeet = Keyboard.nextInt();

        System.out.println("Number of inches of rainfall");
        int Numberofinchesofrainfall = Keyboard.nextInt();

        double cu_in_water = (Lengthofroofinfeet* 12) * (Widthofroofinfeet * 12) * Numberofinchesofrainfall;

        double gallons_water = cu_in_water / 231;
        System.out.println(cu_in_water + "\n" + gallons_water);





    }
}
