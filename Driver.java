package amalia;

public class Driver extends Member{
    String platKendaraan, jenisKendaraan;

    public
    Driver ( String nik, String nama, String nomorTelepon, double saldo, String platKendaraan, String jenisKendaraan ) {
        super(nik, nama, nomorTelepon, saldo);
        this.platKendaraan = platKendaraan;
        this.jenisKendaraan = jenisKendaraan;

    }
    public String getPlatKendaraan () {
        return platKendaraan;
    }

    public void setPlatKendaraan ( String platKendaraan ) {
        this.platKendaraan = platKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan( String jenisKendaraan ) {
        this.jenisKendaraan = jenisKendaraan;
    }
}
