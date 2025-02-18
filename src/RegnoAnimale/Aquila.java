package RegnoAnimale;

class Aquila extends Animale implements Volante {
    @Override
    void verso(){
        System.out.println("Il verso dell'aquila è: Screeeeh");//L'aquila grida
    }
    @Override
    void mangia(){
        System.out.println("L'aquila mangia la carne");//L'aquila è carnivora
    }
    @Override
    public void vola(){
        System.out.println("Sto volando....");
    }

}
