import java.util.*;

public class gajiPegawai {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // diketahui besaran gaji perbulan
        double gaji = 5000000;
        System.out.print("Alpa : ");
        int alpa = scan.nextInt();
        if (alpa > 3) {
            gaji -= 25000 * alpa;
            double gajiBersih = 5 / 100 * gaji;
            System.out.print("Gaji Perbulan : " + gaji);
            System.out.print("Gaji Bersih : " + gajiBersih);
        } else {
            double gajiBersih = 5 / 100 * gaji;
            System.out.print("Gaji Perbulan : " + gaji);
            System.out.print("Gaji Bersih : " + gajiBersih);
        }
        scan.close();
    }
}
