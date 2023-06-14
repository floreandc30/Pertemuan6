package com.Florean_Desvita_Cindirahayu.pbo.pertemuan6;

catch (ArithmeticException e){
    System.out.println("Error: Tidak dapat memproses!");
}
catch (InputMismatchException e) {
    System.out .println("Error: Masukkan angka aja!");
}
public class MultipleCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan Bilangan : ");
            int bil1 = input.nextInt();

            System.out.print("Masukkan Pembagi : ");
            int bil2 = input.nextInt();

            int hasil = bil1 / bil2;
            System.out.println(bil1 + " / " + bil2 + " = " + hasil);
            }

        catch (ArithmeticException e){
                System.out.println(*Error: Program tidak dapat diproses :(");
        catch (InputMismatchException e){
                System.out.println(*Error: Program hanya dapat memproses angka saja :(");

            }
            System.out.println("Program selesai!");
        }
    }


