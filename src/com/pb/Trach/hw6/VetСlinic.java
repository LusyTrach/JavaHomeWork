package com.pb.Trach.hw6;

import java.lang.reflect.Constructor;


public class VetClinic {

    public static void main(String[] args) throws Exception {
        Animal cat = new Cat("Кошачий корм", "Дом", "Маркиз", "Пушистый");
        Animal dog = new Dog("Собачий корм", "Вольер", "Барсик", "Машет хвостом");
        Animal horse = new Horse("Сено", "Ферма", "Буцефал", "Скачет");

        Class<?> vetClazz = Class.forName("com.pb.Trach.hw6.Veterinarian");
        Constructor<?> constr = vetClazz.getConstructor();
        Object obj = constr.newInstance();
        Animal[] animals = {cat, dog,horse};
        for (Animal animal : animals){
            if (obj instanceof Veterinarian) {
                Veterinarian.treatAnimal(animal);
            }
        }
    }
}
