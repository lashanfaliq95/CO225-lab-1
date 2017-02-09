package com.company;

import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the color: ");
        Scanner keyboard=new Scanner(System.in);
        int red=keyboard.nextInt();
        int green=keyboard.nextInt();
        int blue=keyboard.nextInt();
        int cred;
        int cgreen;
        int cblue;
        if(red>255 || red<0 || blue>255 || blue<0 || green>255 || green<0){//the range of values for the colour(0-255)
            System.out.print("Enter valid input");

        }
       else if((abs(red-(255-red))>32)||(abs(green-(255-green))>32)||(abs(blue-(255-blue))>32)){//if the absolute value of the difference
            // between each component of a color and its corresponding component of the colour's
            // complement is more than 32 that means the complement can be written by just substracting the value from 255.

             cred=255-red;
             cgreen=255-green;
             cblue=255-blue;
            System.out.println("The complement: " + cred +" " + cgreen +" "+ cblue);
        }
        else {

            if ((red < 128) && (green < 128) && (blue < 128)) {//if less than 128 you have to add 128

                cred = red + 128;
                cgreen = green + 128;
                cblue = blue + 128;
                System.out.println("The complement: " + cred +" " + cgreen +" "+ cblue);
            }
            else if ((red > 128) && (green > 128) && (blue > 128)) {//if more than 128 you have to substract 128
                cred = red - 128;
                cgreen = green - 128;
                cblue = blue - 128;
                System.out.println("The complement: " + cred +" " + cgreen +" "+ cblue);
            }
            else if ((red > 128) && (green > 128) && (blue < 128)) {
                cred = red - 128;
                cgreen = green - 128;
                cblue = blue + 128;
                System.out.println("The complement: " + cred +" " + cgreen +" "+ cblue);
            }
            else if ((red > 128) && (green < 128) && (blue > 128)) {
                cred = red - 128;
                cgreen = green + 128;
                cblue = blue - 128;
                System.out.println("The complement: " + cred +" " + cgreen +" "+ cblue);
            }
            else if ((red < 128) && (green > 128) && (blue > 128)) {
                cred = red + 128;
                cgreen = green - 128;
                cblue = blue - 128;
                System.out.println("The complement: " + cred +" " + cgreen +" "+ cblue);
            }
            else if ((red > 128) && (green < 128) && (blue < 128)) {
                cred = red - 128;
                cgreen = green + 128;
                cblue = blue + 128;
                System.out.println("The complement: " + cred +" " + cgreen +" "+ cblue);
            }
            else if ((red < 128) && (green < 128) && (blue > 128)) {
                cred = red + 128;
                cgreen = green + 128;
                cblue = blue - 128;
                System.out.println("The complement: " + cred +" " + cgreen +" "+ cblue);
            }
            else if ((red < 128) && (green > 128) && (blue < 128)) {
                cred = red + 128;
                cgreen = green - 128;
                cblue = blue + 128;
                System.out.println("The complement: " + cred +" " + cgreen +" "+ cblue);
            }
        }


    }

}
