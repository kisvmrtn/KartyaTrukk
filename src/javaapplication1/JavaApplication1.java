
package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {

static String[] pakli = new String[21];

    public static void main(String[] args) {
        osszeallit();
        kiir();

        beker();
    }
    
    public static void osszeallit() {
        String[] szinek = {"P", "T", "Z", "M"};
        
        String[] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "VII"};
        
        int pakliIndex = 0;
        
        for (int i = 0; i < szinek.length; i++) {
            for (int j = 0; j < ertekek.length; j++) {
                pakli[pakliIndex++] = szinek[i] + "_" + ertekek[j];
                    if(pakliIndex >= 21) {
                        break;
                    }
            }

        }
    }
    
    public static void kiir() {
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-7s".formatted(pakli[i]));
            if(i % 3 == 0) {
                System.out.println("\n");
            }
        }
    }
    
    public static int beker() {
                Scanner sc = new Scanner(System.in);
        boolean jo;
        int oszlop;
        do {
            System.out.println("Melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }
    
}
