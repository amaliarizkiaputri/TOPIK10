package amalia;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Driver> x = new ArrayList<>();
    static ArrayList<Customer> y = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int opsi;
        do {
            System.out.println("1.Input Driver");
            System.out.println("2.Input Customer");
            System.out.println("3.Info Driver");
            System.out.println("4.Info Customer");
            System.out.println("5.Topup/isi saldo");
            System.out.println("6.Transaksi pengantaran");
            System.out.println("7.Close");
            System.out.println("Masukkan Pilihan");
            opsi = in.nextInt();

            switch (opsi) {
                case 1:
                    masukkanDriver();
                    break;
                case 2:
                    masukkanCustomer();
                    break;
                case 3:
                    infoDriver();
                    break;
                case 4:
                    infoCustomer();
                    break;
                case 5:
                    topupSaldo();
                    break;
                case 6:
                    bayarDriver();
                    break;
                case 7:
                    System.out.println("Program Telah Selesai");
                    break;
                default:
                    System.out.println("!! Tidak Ada Opsi, Silahkan Diulang Kembali!!\n");
                    break;
            }
        } while (opsi != 7);
    }

    static void masukkanDriver() {
        String nik, name, nomerTelepon, platKendaraan, jenisKendaraan;
        double saldo;

        System.out.println("NIK :");
        nik = in.next();
        System.out.println("Nama :");
        name = in.next();
        System.out.println("Nomor Telepon :");
        nomerTelepon = in.next();
        System.out.println("Saldo :");
        saldo = in.nextDouble();
        System.out.println("Plat Kendaraan");
        platKendaraan = in.next();
        System.out.println("Jenis Kendaraan");
        jenisKendaraan = in.next();

        x.add(new Driver(nik, name, nomerTelepon, saldo, platKendaraan, jenisKendaraan));
        System.out.println();
    }

    static void masukkanCustomer() {
        String nik, name, nomerTelepon;
        double saldo;

        System.out.println("NIK :");
        nik = in.next();
        System.out.println("Nama :");
        name = in.next();
        System.out.println("Nomor Telepon :");
        nomerTelepon = in.next();
        System.out.println("Saldo :");
        saldo = in.nextDouble();
        y.add(new Customer(nik, name, nomerTelepon, saldo));
        System.out.println();
    }

    static void infoDriver() {
        for (Driver driver : x) {
            System.out.println("NIK :" + driver.getNik()
                    + "\nNama : " + driver.getNama()
                    + "\nNomer Telepon :" + driver.getNomorTelepon()
                    + "\nSaldo :" + driver.getSaldo()
                    + "\nNomor Plat Kendaraan:" + driver.getPlatKendaraan()
                    + "\nJenis Kendaraan :" + driver.getJenisKendaraan());
        }
        System.out.println();
    }

    static void infoCustomer() {
        for (Customer customer : y) {
            System.out.println("NIK :" + customer.getNik()
                    + "\nNama :" + customer.getNama()
                    + "\nNomer Telepon :" + customer.getNomorTelepon()
                    + "\nSaldo :" + customer.getSaldo() + "\n");
        }
        System.out.println();
    }

    static void topupSaldo() {
        int indesxCustomer, indexDriver;
        double topUp;

        System.out.println("Masukkan index customer :");
        indesxCustomer = in.nextInt();
        System.out.println("Masukkan index driver :");
        indexDriver = in.nextInt();
        System.out.println("Total saldo yang akan ditop up :");
        topUp = in.nextDouble();

        x.get(indexDriver).saldo -= topUp;
        y.get(indesxCustomer).saldo += topUp;

        System.out.println("Transaksi berhasil Gaesss :) \n");
    }

    static void bayarDriver() {
        int indexCustomer, indexDriver;
        double bayar;

        System.out.println("Input index driver :");
        indexDriver = in.nextInt();
        System.out.println("Input index customer :");
        indexCustomer = in.nextInt();
        System.out.println("Total saldo yang akan diTopUp :");
        bayar = in.nextDouble();

        x.get(indexDriver).saldo += bayar;
        y.get(indexCustomer).saldo -= bayar;

        System.out.println("Transaksi berhasil Gaesss :) \n");
    }
}