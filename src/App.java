import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        // I
        // a
        Scanner scan = new Scanner(System.in);
        System.out.print("Panjang Sisi Kubus : ");
        int sisi = scan.nextInt();
        System.out.println("Luas Kubus : " + 6 * sisi * sisi);
        System.out.println("Volume Kubus : " + sisi * sisi * sisi);

        // b
        // panggil function yang bernama luasVolumeKubus
        luasVolumeKubus(sisi);
        scan.close();
    }

    // bagian dari b
    static void luasVolumeKubus(int sisi) {
        System.out.println("Menghitung LuasVolumeKubus Dengan Function");
        System.out.println("Luas Kubus : " + 6 * sisi * sisi);
        System.out.println("Volume Kubus : " + sisi * sisi * sisi);
    }

}
