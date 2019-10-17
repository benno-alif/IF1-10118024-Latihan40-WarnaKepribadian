package com.benno;

public class Warna {

    private static final String RESET = "\u001B[0m";

    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String PURPLE = "\u001B[35m";

    private String nama, color;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private static void colRed() {
        System.out.println("1. Periang,");
        System.out.println("2. Pemberani,");
        System.out.println("3. Berani mengambil resiko dalam setiap langkah,");
        System.out.println("4. Menyukai tantangan");
        System.out.println("5. Kurang sabar,");
        System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahnnya akan sulit dikontrol,");
        System.out.println("7. Memiliki energi kehangatan dan cinta.");
    }

    private static void colGreen() {
        System.out.println("1. Romantis,");
        System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
        System.out.println("3. Teguh pada prinsip,");
        System.out.println("4. Menginginkan kesempurnaan,");
        System.out.println("5. Mudah cemburu,");
        System.out.println("6. Mudah merasa iri,");
        System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
    }

    private static void colYellow() {
        System.out.println("1. Optimis,");
        System.out.println("2. Suka bergaul,");
        System.out.println("3. Periang,");
        System.out.println("4. Senang menolong,");
        System.out.println("5. Lincah dan aktif,");
        System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
        System.out.println("7. Loyal,");
        System.out.println("8. Hangat,");
        System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
        System.out.println("10. Cenderung penakut.");
    }

    private static void colBlue() {
        System.out.println("1. Menyenangkan,");
        System.out.println("2. Bijaksana,");
        System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
        System.out.println("4. Dinamis,");
        System.out.println("5. Senang berbagi,");
        System.out.println("6. Bersahabat,");
        System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
        System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
    }

    private static void colPurple() {
        System.out.println("1. Optimis,");
        System.out.println("2. Tidak pernah ragu, ");
        System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
        System.out.println("4. Memiliki ambisi yang besar,");
        System.out.println("5. Memiliki empati yang besar,");
        System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
        System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
    }

    public void hasilWarna(){
        switch (color){
            case "MERAH" :
                System.out.println("Warna Faoritmu adalah " + RED + color + RESET);
                colRed();
                break;
            case "HIJAU" :
                System.out.println("Warna Faoritmu adalah " + GREEN + color + RESET);
                colGreen();
                break;
            case "KUNING" :
                System.out.println("Warna Faoritmu adalah " + YELLOW + color + RESET);
                colYellow();
                break;
            case "BIRU" :
                System.out.println("Warna Faoritmu adalah " + BLUE + color + RESET);
                colBlue();
                break;
            case "UNGU" :
                System.out.println("Warna Faoritmu adalah " + PURPLE + color + RESET);
                colPurple();
                break;
            default:
                System.out.println("Oops.. Belum teridentifikasi");
        }
    }

}
