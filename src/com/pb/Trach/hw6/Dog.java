package com.pb.Trach.hw6;

import java.util.Objects;

public class Dog extends Animal{

    private String name_dog;
    private String individual;

    public Dog(String food, String location, String name_dog, String individual) {
        super(food, location);
        this.name_dog = name_dog;
        this.individual = individual;
    }

    public String getName_dog() {
        return name_dog;
    }

    public void setName_dog(String name_dog) {
        this.name_dog = name_dog;
    }

    public String getIndividual() {
        return individual;
    }

    public void setIndividual(String individual) {
        this.individual = individual;
    }


    @Override
    public void makeNoise() {
        System.out.print(name_dog);
        super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.print(name_dog);
        super.eat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return getName_dog().equals(dog.getName_dog()) && getIndividual().equals(dog.getIndividual());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName_dog(), getIndividual());
    }


    @Override
    public String toString() {
        return "Имя животного: " + name_dog +"\nЕда животного: " + super.getFood() +
                "\nСреда обитания: " + super.getLocation() + "\nИндивидуальная черта:" + individual + "\n";
    }
}

