package RegnoAnimale;

class Delfino extends Animale implements Nuotante{
    @Override
    void verso(){
        System.out.println("Il verso del delfino è: Click click");//Il delfino emette suoni ad impulsi
    }
    @Override
    void mangia(){
        System.out.println("Il delfino mangia i pesci");//Il delfino è carnivoro
    }
    @Override
    public void nuota(){
        System.out.println("Sto nuotando....");
    }
}
