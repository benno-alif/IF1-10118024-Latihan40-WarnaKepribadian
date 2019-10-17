package com.benno;
import java.util.Scanner;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Menentukan kepribadian sesuai dengan warna yang dipilih
     */

public class Main {

    private static final String RESET = "\u001B[0m";

    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String PURPLE = "\u001B[35m";
    private static final String CYAN = "\u001B[36m";
    private static final String BGRED = "\u001B[41m";
    private static final String BGGREEN = "\u001B[42m";
    private static final String BGYELLOW = "\u001B[43m";
    private static final String BGBLUE = "\u001B[44m";
    private static final String BGMAGENTA = "\u001B[45m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Warna warna = new Warna();

        System.out.println(RED + "YUK " + GREEN + "CEK " + YELLOW + "KEPRIBADIANMU " + CYAN + "DARI " + PURPLE + "WARNA " + BLUE + "FAVORITMU" + RESET);
        System.out.println();
        System.out.println(BGRED + "\t\tMERAH\t\t\t" + RESET);
        System.out.println(BGGREEN + "\t\tHIJAU\t\t\t" + RESET);
        System.out.println(BGYELLOW + "\t\tKUNING\t\t\t" + RESET);
        System.out.println(BGBLUE + "\t\tBIRU\t\t\t" + RESET);
        System.out.println(BGMAGENTA + "\t\tUNGU\t\t\t" + RESET);
        System.out.println();

        System.out.print("PILIH WARNA FAVORITMU : ");
        warna.setColor(scanner.nextLine().toUpperCase());
        System.out.print("NAMA KAMU : ");
        warna.setNama(scanner.nextLine().toUpperCase());

        System.out.println();
        System.out.println("====HASIL TEST KEPRIBADIAN " + warna.getNama() + "====");

        warna.hasilWarna();
    }
}
