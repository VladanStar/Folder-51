package nasumicninizbrojeva;

import java.util.Arrays;

public class NasumicniNizBrojeva {

    public static void main(String[] args) {
        int[] nizA = new int[20];
        for (int i = 0; i < nizA.length; i++) {
            nizA[i] = (int) (Math.random() * 20) + 1;
            System.out.print(nizA[i] + " | ");
        }
        System.out.println(" ");
        Arrays.sort(nizA);

        System.out.println(" ");
        for (int i = 0; i < nizA.length; i++) {
            System.out.print(nizA[i] + " | ");
        }
        System.out.println(" ");
        int brojac = 0;
        // izbacujemo clanove koji se ponavljaju
        for (int i = 0; i < nizA.length; i++) {
            while (i < nizA.length - 1 && nizA[i] == nizA[i + 1]) {
                i++;
            }
            System.out.print(nizA[i] + " | ");
            brojac++;

        }
        System.out.println("Broj istih clanova niza: " + brojac);

    }
}
