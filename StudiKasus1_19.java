import java.util.Scanner;

public class StudiKasus1_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan Jumlah Cup: ");
        jumlahCup = sc.nextInt();

        System.out.print("Masukkan Uang Bayar: ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        } else {
            diskon = 0;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total Harga: Rp. " + totalHarga);
        System.out.println("Diskon: Rp. " + diskon);
        System.out.println("Total Bayar: Rp. " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian Rp. " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang Tidak Cukup Kurang Rp. " + kurang);
        }
    }
}
