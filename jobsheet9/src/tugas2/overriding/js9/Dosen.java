package tugas2.overriding.js9;
public class Dosen extends Manusia{
    public void makan(){
        super.makan();
        System.out.println("Makan teratur karena ada uang dan sudah bekerja");
    }
    public void lembur(){
        System.out.println("Lembur menilai pekerjaan mahasiswa");
    }
}