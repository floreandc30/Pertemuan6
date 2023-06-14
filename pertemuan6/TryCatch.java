package com.Florean_Desvita_Cindirahayu.pbo.pertemuan6;

public class TryCatch {
    public static void main(String[] args) {
    //Membuat array
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println(numbers[6]);
        System.out.println( "Proses selesai!");
        }
    }

public class TryCatch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            System.out.println(numbers[7]);

        } catch (ArrayIndexOut0fBoundsException e) {
            System.out.println("Array tidak segede itu!");
            System.out.println("Proses selesai!");
        }
    }
}