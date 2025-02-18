package RegnoAnimale;

class Aquila extends Animale{
    @Override
    void verso(){
        System.out.println("Il verso dell'aquila è: Screeeeh");//L'aquila grida
    }
    @Override
    void mangia(){
        System.out.println("L'aquila mangia la carne");//L'aquila è carnivora
    }

}
