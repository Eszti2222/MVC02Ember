package nezet;

import java.util.Scanner;

public class CuiNezet {

    private static final Scanner sc = new Scanner(System.in);
    private String nev;
    private int kor;

    public int getKor() {
        return kor;
    }

    public void mutat(String uzenet) {
        System.out.print(uzenet);
    }

    /*set*/
    public String nevBeker() {
        mutat("név: ");
        return sc.nextLine();
    }

    /*set*/
    public int korBeker() {
        mutat("kor: ");
        return sc.nextInt();
    }
    

}
