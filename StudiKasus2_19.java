import java.util.Scanner;

public class StudiKasus2_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, Peringkat;
        char statusPendanaan;

        System.out.print("\n");
        System.out.print("Nama Mahasiswa: ");
        namaMahasiswa = sc.nextLine();

        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Jumlah Dokumen: ");
            jumlahDokumen = sc.nextInt();

            System.out.print("Peringkat Juara: ");
            Peringkat = sc.nextInt();

            if (jumlahDokumen == 4) {

                if (Peringkat >= 1 && Peringkat <= 3) {
                    System.out.println("Dokumen Lengkap. Dana Penghargaan Diberikan");
                } else {
                    System.out.println("Tidak Juara 1,2, dan 3. Dana Penghargaan Tidak Diberikan");
                }

            } else {
                System.out.println(
                        "Dokumen Tidak Lengkap (kurang " + (4 - jumlahDokumen)
                                + " Dokumen). Dana Penghargaan Tidak Diberikan");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Status Pendanaan: ");
            statusPendanaan = sc.next().charAt(0);

            System.out.print("Jumlah Dokumen: ");
            jumlahDokumen = sc.nextInt();

            if (statusPendanaan == '1') {

                if (jumlahDokumen == 4) {
                    System.out.println("Dokumen Lengkap dan Lolos Pendanaan PKM. Dana Penghargaan diberikan");
                } else {
                    System.out.println(
                            "Dokumen Tidak Lengkap (kurang " + (4 - jumlahDokumen)
                                    + " Dokumen). Dana Penghargaan Tidak Diberikan");
                }
            } else if (statusPendanaan == '0') {
                System.out.println("Status: Tidak Lolos Pendanaan PKM. Dana Penghargaan Tidak Diberikan");
            } else {
                System.out.println("Status: Input Status Pendanaan Tidak Valid");
            }

        } else {
            System.out.println("Kegiatan Tidak Mendapat Dana Penghargaan");
        }
        System.out.print("\n");

        sc.close();

    }
}
