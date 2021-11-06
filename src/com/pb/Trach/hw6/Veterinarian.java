package com.pb.Trach.hw6;

public class Veterinarian{

    static void treatAnimal(Animal animal){
        if (animal instanceof Cat){
            System.out.println("Имя животного: " + ((Cat) animal).getName_cat() +"\nЕда животного: "
                    + animal.getFood()+ "\nСреда обитания:" + animal.getLocation()+"\n");
        }

        else if (animal instanceof Dog){
            System.out.println("Имя животного: " + ((Dog) animal).getName_dog() +"\nЕда животного: "
                    + animal.getFood()+ "\nСреда обитания:" + animal.getLocation()+"\n");
        }

        else if (animal instanceof Horse){
            System.out.println("Имя животного: " + ((Horse) animal).getName_horse() +"\nЕда животного: "
                    + animal.getFood()+ "\nСреда обитания:" + animal.getLocation()+"\n");
        }
    }

}