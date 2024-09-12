package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public static boolean isPalindrome(int sayi) {
        int num = sayi;
        int sayiPalindrome=0;
        while (sayi != 0) {

            int lastDigit = sayi % 10;
            sayiPalindrome = sayiPalindrome * 10 + lastDigit;
            sayi /= 10;
        }
        return num==sayiPalindrome;
    }

    public static boolean isPerfectNumber(int sayi) {

        if(sayi==1 && sayi<0)return false;

        int perfectNumberToplam = 1;

        for (int i =2; i<sayi; i++){
            if (sayi%i==0 && sayi!=i){
                perfectNumberToplam+=i;
            }
        };

        if (perfectNumberToplam==sayi) return true;



        return false;
    }

    public static String numberToWords(int rakam) {
        return "true";
    }


}




