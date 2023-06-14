package com.Florean_Desvita_Cindirahayu.pbo.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static int bagiBilangan2132(int bilangan1, int bilangan2) {
        return bilangan1 / bilangan2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Kalkulator Pembagian Bilangan Bulat");
            System.out.println("Florean Desvita Cindirahayu - 21102132");
            System.out.print("Masukkan bilangan pertama: ");
            int bilangan1 = input.nextInt();

            if (bilangan1 == 0) {
                throw new ArithmeticException("Terjadi kesalahan: Pembagian dengan nol tidak diperbolehkan.");
            }

            System.out.print("Masukkan bilangan kedua: ");
            int bilangan2 = input.nextInt();

            if (bilangan2 == 0) {
                throw new ArithmeticException("Terjadi kesalahan: Pembagian dengan nol tidak diperbolehkan.");
            }

            int hasil = bagiBilangan2132(bilangan1, bilangan2);
            System.out.println("Hasil pembagian: " + hasil);
        } catch (InputMismatchException e) {
            System.out.println("Terjadi kesalahan: Masukan tidak valid. Harap masukkan bilangan bulat.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        input.close();
    }
}


