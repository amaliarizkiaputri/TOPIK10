package amalia;

public class Member {
    String nik,nama, nomorTelepon;
    double saldo=0;

    public Member ( String nik, String nama, String nomorTelepon, double saldo ) {
        this.nik = nik;
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        this.saldo = saldo;
    }

    public Member () {

    }

    public String getNik () {
        return nik;
    }

    public void setNik ( String nik ) {
        this.nik = nik;
    }

    public String getNama () {
        return nama;
    }

    public void setNama ( String nama ) {
        this.nama = nama;
    }

    public String getNomorTelepon () {
        return nomorTelepon;
    }

    public void setNomorTelepon ( String nomorTelepon ) {
        this.nomorTelepon = nomorTelepon;
    }

    public double getSaldo () {
        return saldo;
    }

    public void setSaldo ( double saldo ) {
        this.saldo = saldo;
    }
}
