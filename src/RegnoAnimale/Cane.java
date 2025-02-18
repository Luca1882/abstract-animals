package RegnoAnimale;

class Cane extends Animale{
    @Override
    void verso(){
        System.out.println("Il verso del cane è: Bau Bau"); //Il cane abbaia
    }
    @Override
    void mangia(){
        System.out.println("Il cane mangia la carne");//Il cane è carnivoro
    }
}
