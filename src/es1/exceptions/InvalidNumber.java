package es1.exceptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class InvalidNumber extends Exception {
    private static final Logger log = LoggerFactory.getLogger(InvalidNumber.class);
    public InvalidNumber(int number) {
        log.error("Il numero " + number + " inserito non è valido. Riprova.");
    }
}
