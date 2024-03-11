package es1.exceptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class InvalidIndex extends Exception {
    private static final Logger log = LoggerFactory.getLogger(InvalidIndex.class);
    public InvalidIndex(int number) {
        log.error("L'indice " + number + " inserito non è valido. Riprova.");
    }
}
