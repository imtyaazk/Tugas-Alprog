package com.company;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String aa = JOptionPane.showInputDialog("Masukkan nama (Kapital)");
        String ab = JOptionPane.showInputDialog("Masukkan umur anda 2 tahun yang lalu");
      
        String awal = String.format("Suatu hari %s berulang tahun ke %s.",aa ,ab);
        JOptionPane.showMessageDialog(null, awal);
        System.out.println(awal);

        String ac = JOptionPane.showInputDialog("Kado ulang tahun anda");
        String kado = String.format("%s terkejut karena mendapati %s yang diingkannya di dalam kamarnya.", aa,ac);
        JOptionPane.showMessageDialog(null, kado);
        System.out.println(kado);

        String ad = JOptionPane.showInputDialog("Pilih salah satu : Ayah / Ibu");
        String kaget = String.format("Tidak lama setelah melihat %s itu, %s membawa kado yang sama kepadanya.", ac, ad);
        JOptionPane.showMessageDialog(null, kaget);
        String tanya1 = String.format("%s bertanya 'Dari mana kamu mendapatkan ini?'", ad);
        JOptionPane.showMessageDialog(null, tanya1);
        String jawab = String.format("%s menjawab bahwa dia juga tidak mengetahuinya.", aa);
        JOptionPane.showMessageDialog(null, jawab);
        String besok = String.format("Esok harinya %s melihat keadaan kamarnya mirip dengan keadaan hari sebelumnya atau hari ulang tahunnya", aa);
        JOptionPane.showMessageDialog(null, besok);
        System.out.println(kaget);
        System.out.println(tanya1);
        System.out.println(jawab);
        System.out.println(besok);

        String af = JOptionPane.showInputDialog("Masukkan angka favorit anda");
        int n = Integer.parseInt(af);
        n+=1;
        String ulang = String.format("Ternyata dia mengulang dan terjebak pada hari ulang tahunnya sebanyak %s kali.", n);
        JOptionPane.showMessageDialog(null, ulang);
        System.out.println(ulang);

        String ag = JOptionPane.showInputDialog("Masukkan nama teman anda (Kapital)");
        String berubah = String.format("Hingga pada akhirnya ada %s yang datang sehingga jalan cerita hari itu berubah dari aslinya.", ag);
        JOptionPane.showMessageDialog(null, berubah);
        String ending = String.format("%s menjadikan %s menjalankan hari esoknya setelah mengulang berkali-kali.", ag, aa);
        String ending2 = String.format("Hingga 2 tahun setelahnya, %s masih bertanya-tanya tentang apa yang terjadi pada hari itu.", aa);
        JOptionPane.showMessageDialog(null, ending);
        JOptionPane.showMessageDialog(null, ending2);
        System.out.println(berubah);
        System.out.println(ending);
        System.out.println(ending2);

        String tanya2 = JOptionPane.showInputDialog("Apakah anda suka dengan cerita ini?");
        System.out.println(tanya2);

        JOptionPane.showMessageDialog(null, "Terima Kasih^.^");
        System.out.println("Terima Kasih^.^");
    }

}
