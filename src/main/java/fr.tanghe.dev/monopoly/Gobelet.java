package fr.tanghe.dev.monopoly;

public class Gobelet {
    private final De de1;
    private final De de2;

    public Gobelet(De de1, De de2) {
        this.de1 = de1;
        this.de2 = de2;
    }

    public boolean estUnDouble() {     // test si c'est un double
        return (de1.getValeur() == de2.getValeur());
    }

    public int lancer() {
        de1.lancer();
        de2.lancer();
        return (de1.getValeur() + de2.getValeur());
    }


}



