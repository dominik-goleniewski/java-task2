public class GenericContainer<T extends Animal> {
    private T t;
    private Animal animal = new Animal();
    private Mammal mammal = new Mammal();
    private Dog dog = new Dog();

    public T getT() {
        return t;
    }

    public int getAnimal() {
        return animal.getAnimalVariable();
    }

    public int getMammal() {
        return mammal.getMammalVariable();
    }

    public int getDog() {
        return dog.getDogVariable();
    }
}
