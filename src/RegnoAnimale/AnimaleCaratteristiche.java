package RegnoAnimale;

public class AnimaleCaratteristiche {
    public static void main(String[] args){
        Animale aquila = new Aquila();
        Animale cane = new Cane();
        Animale delfino = new Delfino();
        Animale passerotto = new Passerotto();

        //Testiamo i metodi
        System.out.println("Cane:");
        cane.dormi();
        cane.verso();
        cane.mangia();

        System.out.println("\nPasserotto:");
        passerotto.dormi();
        passerotto.verso();
        passerotto.mangia();

        System.out.println("\nAquila:");
        aquila.dormi();
        aquila.verso();
        aquila.mangia();

        System.out.println("\nDelfino:");
        delfino.dormi();
        delfino.verso();
        delfino.mangia();
    }
}
