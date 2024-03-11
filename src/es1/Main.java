package es1;

import es1.exceptions.InvalidIndex;
import es1.exceptions.InvalidNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        int[] randomNumbers = new int[5];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(10) + 1;
            System.out.println((i + 1) + " randomNumber: " + randomNumbers[i]);
        }
        log.info("Numeri generati correttamente");

        int index;
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Inserisci l'indice dell' array su cui vuoi modificare il numero:");
                index = scanner.nextInt();
                if (index < 0 || index >= randomNumbers.length) {
                    throw new InvalidIndex(index);
                }

                System.out.println("Inserisci il nuovo numero:");
                number = scanner.nextInt();
                if (number < 1 || number > 10) {
                    throw new InvalidNumber(number);
                }

                System.out.println("Il numero " + randomNumbers[index] + " è stato modificato in " + number);
                randomNumbers[index] = number;
                for (int i = 0; i < randomNumbers.length; i++) {
                    System.out.println((i + 1) + " randomNumber: " + randomNumbers[i]);
                }
            } catch (InvalidIndex | InvalidNumber e) {
                throw new RuntimeException(e);
            }
        } while (true);
    }
}