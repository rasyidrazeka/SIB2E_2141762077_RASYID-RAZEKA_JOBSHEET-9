package tugas2.overriding.js9;
public class Mahasiswa extends Manusia{
    public void makan(){
        super.makan();
        System.out.println("Kadang teratur kadang tidak, tergantung uang");
    }
    public void tidur(){
        System.out.println("Menutup mata");
    }
}