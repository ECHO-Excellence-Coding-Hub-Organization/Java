package materi.dasar.java;

public class ember {
    public static void main(String[] args) {
        String BotolA = "biru";
        String BotolB = " merah";
        /*untuk menukar nya membutuhkan 1 wadah
        atau bisa di sebut variabel baru */
        String BotolC;// string c wadah di pakai untuk menukar
        System.out.println("====sebelum di tukar===");
        System.out.println("A : " + BotolA);
        System.out.println("B : " + BotolB);


        System.out.println("====setelah di tukar===");
        BotolC = BotolB; //menampung  air warna merah
        BotolB = BotolA; // nilai dari B akan menampung nilai A 
        BotolA = BotolC; // nilai yang c di masukan ke ember A


        // System.out.println(C);
        System.out.println("ember A " +BotolA);
        System.out.println("ember B " + BotolB);


    }
    
}
