package com.pb.Trach.hw6;


public class VetClinic {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Кашу и косточки говяжие", "будке на улице");
        animals[1] = new Cat("Молоко и рыбку, мясо, мыши", "квартире");
        animals[2] = new Horse("Траву, овес, тыкву, сено", "в хлеве сарая");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}