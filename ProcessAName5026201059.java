import java.util.Scanner;

public class ProcessAName5026201059 {
    public static void main(String[] args){
        String nama, namaBelakang, namaJadi;
        char inisial;
        System.out.println("Masukkan nama lengkap (2 kata) : ");
        Scanner sc = new Scanner(System.in);
        nama = sc.nextLine();
        inisial = nama.charAt(0);
        int spasi = nama.indexOf(' ');
        namaBelakang = nama.substring(spasi+1);
        namaJadi = namaBelakang + ", " + inisial;

        System.out.println(spasi);
        System.out.println("Namamu adalah : " + namaJadi + ".");
    }
}
