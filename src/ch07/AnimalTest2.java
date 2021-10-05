package ch07;

public class AnimalTest2 {
    public static void main(String[] args) {
        BigCat bc = new BigCat();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();
//        animalCrying((new BigCat()));
//        bc.crying();
//        animalCrying(dog);
//        animalCrying(cat);
//        animalCrying(cow);
        AnimalTest2 ant = new AnimalTest2();
        ant.animalCrying(bc);
        ant.animalCrying(dog);
        ant.animalCrying(cat);
        ant.animalCrying(cow);
    }
    public void animalCrying(Animal ani){
        ani.crying();
    }
    void sadsd(Animal ani){
        animalCrying(ani);
    }
}
