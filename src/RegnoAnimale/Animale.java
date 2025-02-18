package RegnoAnimale;

abstract class Animale {
    //Metodo comune a tutti gli animali
    void dormi(){
        System.out.println("Zzz...");
    }

    //Metodo che devono essere implementati negli altri animali
    abstract void verso();
    abstract void mangia();
}
