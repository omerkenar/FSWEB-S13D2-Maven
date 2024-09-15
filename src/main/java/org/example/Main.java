package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(numberToWords(123));
    }


    public static boolean isPalindrome(int sayi) {
        int num = sayi;
        int sayiPalindrome = 0;
        while (sayi != 0) {

            int lastDigit = sayi % 10;
            sayiPalindrome = sayiPalindrome * 10 + lastDigit;
            sayi /= 10;
        }
        return num == sayiPalindrome;
    }

    public static boolean isPerfectNumber(int sayi) {

        if (sayi == 1 && sayi < 0) return false;

        int perfectNumberToplam = 1;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0 && sayi != i) {
                perfectNumberToplam += i;
            }
        }
        ;

        if (perfectNumberToplam == sayi) return true;


        return false;
    }

    public static String numberToWords(int sayi) {
        if (sayi < 0) return "Invalid Value";

        char[] sayiStrings = String.valueOf(sayi).toCharArray();

        String sayiText = "";

        for (char sayiString : sayiStrings) {
            switch (sayiString) {
                case '0':
                    sayiText += "Zero ";
                    break;
                case '1':
                    sayiText += "One ";
                    break;
                case '2':
                    sayiText += "Two ";
                    break;
                case '3':
                    sayiText += "Three ";
                    break;
                case '4':
                    sayiText += "Four ";
                    break;
                case '5':
                    sayiText += "Five ";
                    break;
                case '6':
                    sayiText += "Six ";
                    break;
                case '7':
                    sayiText += "Seven ";
                    break;
                case '8':
                    sayiText += "Eight ";
                    break;
                case '9':
                    sayiText += "Nine ";
                    break;

            }
        }

        return sayiText.trim();

    }


}




