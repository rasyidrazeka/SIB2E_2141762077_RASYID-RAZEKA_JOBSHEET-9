package tugas1.overloading.js9;
public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA){
        return sudut = 180 - sudutA;
    }
    public int totalSudut(int sudutA, int sudutB){
        return sudut = 180 - (sudutA+sudutB);
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB + sisiC;
    }
    public double keliling(int sisiA, int sisiB){
        double sisiC = Math.sqrt(Math.pow(sisiA, 2)) + Math.sqrt(Math.pow(sisiB, 2));
        return sisiA + sisiB + sisiC;
    }
    public static void main(String[] args) {
        Segitiga sgt = new Segitiga();
        System.out.println("Total sudut 1 = " + sgt.totalSudut(75));
        System.out.println("Total sudut 2 = " + sgt.totalSudut(30, 45));
        System.out.println("Keliling 1 = " + sgt.keliling(5, 10, 15));
        System.out.println("Keliling 2 = " + sgt.keliling(5, 10));
    }
}