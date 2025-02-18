package RegnoAnimale;

class Passerotto extends Animale implements Volante{
    @Override
    void verso(){
        System.out.println("Il verso del passerotto è: Cip Cip");//Il passerotto cinguetta
    }
    @Override
    void mangia(){
        System.out.println("Il passerotto mangia semi è insetti");//Il passerotto è onnivoro
    }
    @Override
    public void vola(){
        System.out.println("Sto volando....");
    }
}
