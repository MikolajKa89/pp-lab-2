public class PracaDomowa {
    private String imie = "Mikolaj";
    private int numerAlbumu = 123456;
    private Miasto miasto;

    public PracaDomowa(String imie, int numerAlbumu, Miasto miasto) {
        this.imie = imie;
        this.numerAlbumu = numerAlbumu;
        this.miasto = miasto;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getNumerAlbumu() {
        return numerAlbumu;
    }

    public void setNumerAlbumu(int numerAlbumu) {
        this.numerAlbumu = numerAlbumu;
    }

    public Miasto getMiasto() {
        return miasto;
    }

    public static void main(String[] args) {
        Miasto warszawa = new Miasto("Warszawa");
        PracaDomowa pracaDomowa = new PracaDomowa("Mikolaj", 123456, warszawa);
        System.out.println("Twoje imie: " + pracaDomowa.getImie());
        System.out.println("Numer albumu: " + pracaDomowa.getNumerAlbumu());
        System.out.println("Miasto: " + pracaDomowa.getMiasto().getNazwa());
    }
}
