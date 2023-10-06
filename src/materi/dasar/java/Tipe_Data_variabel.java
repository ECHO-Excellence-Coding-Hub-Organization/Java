package materi.dasar.java;

public class Tipe_Data_variabel {
    public static void main(String[] args) {
        /** tipe data
         * string
         * int
         * float
         * double
         * char
         * boolean
         *  */ 

         String Nama = "Sabardi";
         int Umur = 10;

         System.out.println("Nama Saya adalah : " +Nama + "dan Umur saya : "+ Umur);

         /**soal
          * ada 2 buah ember yaitu ember a dan b ember a berisi air warna biru dan ember b berwarna merah
          * bagaimana cara menukar ember a berisi air warna merha dan b berisi air warna biru  
          */

          /* algortima nya
           * buatlah variabel a dan b
           * kemuadian buat variabel c untuk menampung air
           * air di ember b di pindah ke ember c
           * air ember a di masukan ke ember b
           * air ember c masukan ke dalam ember a 
           */

           String a = "biru";
           String b = "merah";
           String c;
        System.out.println("==== sebelum di tukar =====");
        System.out.println("ember a  "+ a);
        System.out.println("ember b  " + b);
           c = b;
           b = a;
           a = c;
        System.out.println("==== setelah di tukar =====");

           System.out.println("ember a : "+ a);
            System.out.println("ember b :" + b);
    }
}
