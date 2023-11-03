package Tugas;

import java.util.Scanner;

public class konversiBilangan {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Pilih bilangan : \n1. Desimal\n2. Biner\n3. Heksadesimal");
        System.out.print("Pilih menu tersebut (1/2/3): ");
        int pilihan = in.nextInt();
        System.out.println(" ");
        System.out.println("Menu yang dipilih : " + pilihan);

        switch (pilihan) {
            case 1:
                System.out.println("Pilih : \n1. Desimal ke biner\n2. Desimal ke heksadesimal");
                System.out.print("Pilih menu tersebut (1/2): ");
                int pilihand = in.nextInt();
                System.out.println(" ");
                System.out.println("Menu yang dipilih : " + pilihand);

                if (pilihand == 1) {
                    System.out.print("Masukan bilangan desimal : ");
                    int angkad = in.nextInt();
                    String binerd;
                    binerd = Integer.toBinaryString(angkad);
                    System.out.println("Bilangan binernya adalah = " + binerd + " ");
                }
                if (pilihand == 2) {
                    System.out.print("Masukan bilangan desimal : ");
                    int angkad2 = in.nextInt();
                    String heksad;
                    heksad = Integer.toHexString(angkad2);
                    System.out.println("Bilangan heksadesimalnya adalah : " + heksad);
                }
                break;

            case 2:
                System.out.println("Pilih : \n1. Biner ke desimal\n2. Biner ke heksadesimal");
                System.out.print("Pilih menu tersebut (1/2): ");
                int pilihanb = in.nextInt();
                System.out.println(" ");
                System.out.println("Menu yang dipilih : " + pilihanb);

                if (pilihanb == 1) {
                    System.out.print("Masukan bilangan biner : ");
                    String angkab = in.next();
                    int desimal = Integer.parseInt(angkab, 2);
                    System.out.println("Bilangan desimalnya adalah = " + desimal);
                }
                if (pilihanb == 2) {
                    System.out.print("Masukan bilangan biner : ");
                    String angkab2 = in.next();
                    int des = Integer.parseInt(angkab2, 2);
                    String heksab = Integer.toHexString(des).toUpperCase();
                    System.out.println("Bilangan heksadesimalnya adalah = " + heksab);
                }
                break;

            case 3:
                System.out.println("Pilih : \n1. Heksadesimal ke desimal\n2. Heksadesimal ke biner");
                System.out.print("Pilih menu tersebut (1/2): ");
                int pilihanh = in.nextInt();
                System.out.println(" ");
                System.out.println("Menu yang dipilih : " + pilihanh);

                if (pilihanh == 1) {
                    System.out.print("Masukan bilangan heksadesimal : ");
                    String angkah = in.next();
                    int desimalh = Integer.parseInt(angkah, 16);
                    System.out.println("Bilangan desimal adalah = " + desimalh + " ");
                }
                if (pilihanh == 2) {
                    System.out.print("Masukan bilangan heksadesimal : ");
                    String angkah = in.next();
                    int heksa2 = Integer.parseInt(angkah, 16);
                    String binerh = Integer.toBinaryString(heksa2);
                    System.out.println("Bilangan binernya adalah = " + binerh);
                }
                break;
        }
    }
}

