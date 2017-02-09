package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner keyboard=new Scanner(System.in);
        int number=keyboard.nextInt();
        boolean special;
        boolean weird;
        boolean big;

        if(number%15==0){ special=true;}
        else{special=false;}

        if(number>999){big=true;}
        else{big=false;}

        if(number%5==0 && number%6==0 && number%18!=0){weird=true;}
       else{weird=false;}

       if(special==true && big==true && weird==true){//special,weird and big
           System.out.println(number + " is special, big, weird and scary.");
       }
       else if(special==false && big==false && weird==false){//not special,not big and not weird
           System.out.println(number + " is not special or not scary.");
       }
       else if(special==true && big==false && weird==false) {//special,not big or weird
           System.out.println(number + " is special but not scary.");
       }
       else if(special==false && big==true && weird==false) {//not special or weird but big
           System.out.println(number + " is not special, big and scary but not weird.");
       }
       else if(special==false && big==false && weird==true) {//not special or big,but weird
           System.out.println(number + " is not special, weird and scary but not big.");
       }
       else if(special==true && big==true && weird==false) {//special and big but not weird
           System.out.println(number + " is special, big and scary but not weird.");
       }
       else if(special==true && big==false && weird==true) {//special and weird but not big
           System.out.println(number + " is special, weird and scary but not big.");
       }
       else if(special==false && big==true && weird==true) {//not special but big or weird
           System.out.println(number +" is not special but big,weird and scary.");
       }
       }
}
