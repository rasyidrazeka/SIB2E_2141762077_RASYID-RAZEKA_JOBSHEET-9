package tugas2.overriding.js9;
public class Main {
    public static void main(String[] args) {
        Manusia mns = new Manusia();
        Mahasiswa mhs = new Mahasiswa();
        Dosen dsn = new Dosen();

        System.out.println("=====MANUSIA=====");
        mns.bernafas();
        mns.makan();
        System.out.println("=================");
        System.out.println("=====MAHASISWA=====");
        mhs.bernafas();
        mhs.makan();
        mhs.tidur();
        System.out.println("===================");
        System.out.println("=====DOSEN=====");
        dsn.bernafas();
        dsn.makan();
        dsn.lembur();
        System.out.println("===============");
    }
}