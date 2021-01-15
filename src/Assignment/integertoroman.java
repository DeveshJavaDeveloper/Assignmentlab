package Assignment;

// WAP to convert any integernumber between 1 to 500 in a roman Expression..

import java.util.Scanner;

public class integertoroman {

    public static void main(String[] args) {
        D obj = new D();
        System.out.println("Please Enter Value From 1 to 500");
        obj.setN();
        obj.checkCondition();
    }
}

class D {

    static int n;
    static String roman = "";
    String temp;

    public void setN() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
    }

    public void getN() {
        System.out.println("The roman is " + roman);
    }

    public void checkCondition() {
        if (n > 0 && n < 501) {
            while (n > 0) {
                checkRoman();
            }
            getN();
        } else {
            System.out.println("You have entered the wrong value....");
        }

    }

    public void checkRoman() {
        if (n >= 500) {
            temp = "D";
            n -= 500;
            roman = roman + temp;
            return;
        }
        if (n >= 400) {
            temp = "CD";
            n -= 400;
            roman = roman + temp;
            return;
        }
        if (n >= 100) {
            temp = "C";
            n -= 100;
            roman = roman + temp;
            return;
        }
        if (n >= 90) {
            temp = "XC";
            n -= 90;
            roman = roman + temp;
            return;
        }
        if (n >= 50) {
            temp = "L";
            n -= 50;
            roman = roman + temp;
            return;
        }
        if (n >= 40) {
            temp = "XL";
            n -= 40;
            roman = roman + temp;
            return;
        }
        if (n >= 10) {
            temp = "X";
            n -= 10;
            roman = roman + temp;
            return;
        }
        if (n >= 9) {
            temp = "IX";
            n -= 9;
            roman = roman + temp;
            return;
        }
        if (n >= 5) {
            temp = "V";
            n -= 5;
            roman = roman + temp;
            return;
        }
        if (n >= 4) {
            temp = "IV";
            n -= 4;
            roman = roman + temp;
            return;
        }
        if (n >= 1) {
            temp = "I";
            n -= 1;
            roman = roman + temp;
        }
    }
}
