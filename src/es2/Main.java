package es2;
import es2.exceptions.InvalidNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(Main.class);
        try (Scanner scanner = new Scanner(System.in)) {
            int litres;
            int kilometers;
            System.out.println("Inserisci il numero di litri di gasolio:");
            litres = scanner.nextInt();
            if (litres <= 0) {
                throw new InvalidNumber(litres);
            }
            System.out.println("Inserisci il numero di KM percorsi:");
            kilometers = scanner.nextInt();
            int cal = kilometers / litres;
            log.info("Il consumo medio è di " + cal + " l/km.");


        } catch (InvalidNumber e) {
            throw new RuntimeException(e);

        }
    }
}
