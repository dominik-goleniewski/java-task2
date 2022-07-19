public class Display {

    public static void showDataAnimal(GenericContainer<? extends Animal> container) {
        System.out.println(container.getT());
        System.out.println(container.getAnimal());
        System.out.println(container.getMammal());
        System.out.println(container.getDog());
    }

    public static void showDataMammal(GenericContainer<? extends Mammal> container) {
        System.out.println(container.getT());
        System.out.println(container.getAnimal());
        System.out.println(container.getMammal());
        System.out.println(container.getDog());
    }

    public static void showDataDog(GenericContainer<? extends Dog> container) {
        System.out.println(container.getT());
        System.out.println(container.getAnimal());
        System.out.println(container.getMammal());
        System.out.println(container.getDog());
    }

    public static void main(String[] args) {

        GenericContainer<Animal> animalGenericContainer = new GenericContainer<>();
        GenericContainer<Mammal> mammalGenericContainer = new GenericContainer<>();
        GenericContainer<Dog> dogGenericContainer = new GenericContainer<>();

        Display.showDataAnimal(animalGenericContainer);
        Display.showDataAnimal(mammalGenericContainer);
        Display.showDataAnimal(dogGenericContainer);

        Display.showDataMammal(mammalGenericContainer);
        Display.showDataMammal(dogGenericContainer);
//        Display.showDataMammal(animalGenericContainer); NOT COMPILING

        Display.showDataDog(dogGenericContainer);
//        Display.showDataDog(mammalGenericContainer); NOT COMPILING
//        Display.showDataDog(animalGenericContainer); NOT COMPILING

    }
}
