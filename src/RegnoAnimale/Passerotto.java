package RegnoAnimale;

class Passerotto extends Animale{
    @Override
    void verso(){
        System.out.println("Il verso del passerotto è: Cip Cip");//Il passerotto cinguetta
    }
    @Override
    void mangia(){
        System.out.println("Il passerotto mangia semi è insetti");//Il passerotto è onnivoro
    }
}
