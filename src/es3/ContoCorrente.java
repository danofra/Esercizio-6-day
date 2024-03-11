package es3;

import excepitions.BancaException;

public class ContoCorrente extends Banca {
    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;
    double prelievo;

    ContoCorrente(String titolare, double saldo, double prelievo) {
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
        this.prelievo = prelievo;

    }

void stampaSaldo() {
    System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
            + " - Massimo movimenti: " + maxMovimenti);
}

    void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti) {
            if (saldo <= 0) {
                throw new BancaException("Conto in rosso!");
            } else if ( prelievo > saldo) {
                 throw new BancaException("Saldo insufficiente!");
            } else {
                saldo = saldo - x;
            }
        }else{
        saldo = saldo - x - 0.50;
        nMovimenti++;}
    }





    double restituisciSaldo() {
        return saldo;
    }
}

