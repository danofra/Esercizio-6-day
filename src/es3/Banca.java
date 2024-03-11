package es3;
import excepitions.BancaException;
import java.util.Scanner;
public class Banca {
    public static void main(String[] args) {
        double saldo = 0;
        double prelievo;
        System.out.println("Benvenuto in banca");
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il prelievo: ");
        prelievo = in.nextDouble();
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", saldo, prelievo);
        conto1.stampaSaldo();
        System.out.println("Saldo conto: " + conto1.restituisciSaldo());
        try {
            conto1.preleva(prelievo);
            System.out.println("Hai prelevato: " + prelievo);
            System.out.println("Saldo conto corrente: " + conto1.restituisciSaldo());
        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo: " + e);
            e.printStackTrace();
        }
        System.out.println("Benvenuto in banca Online");
        System.out.println("Inserisci il prelievo: ");
        prelievo = in.nextDouble();
        ContoOnLine conto2 = new ContoOnLine("Grossi Mario", saldo,1500);
        conto2.stampaSaldo();
        try {
            conto2.preleva(prelievo);
            System.out.println("Hai prelevato: " + prelievo);
            System.out.println("Saldo conto corrente: " + conto2.restituisciSaldo());

        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo: " + e);
            e.printStackTrace();
        }
    }
}
