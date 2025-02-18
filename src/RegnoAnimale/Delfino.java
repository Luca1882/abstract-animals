package RegnoAnimale;

class Delfino extends Animale{
    @Override
    void verso(){
        System.out.println("Il verso del delfino è: Click click");//Il delfino emette suoni ad impulsi
    }
    @Override
    void mangia(){
        System.out.println("Il delfino mangia i pesci");//Il delfino è carnivoro
    }
}
