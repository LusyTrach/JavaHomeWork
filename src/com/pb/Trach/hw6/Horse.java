package com.pb.Trach.hw6;

import java.util.Objects;

public class Horse extends Animal{

    private String name_horse;
    private String individual;

    public Horse(String food, String location, String name_horse, String individual) {
        super(food, location);
        this.name_horse = name_horse;
        this.individual = individual;
    }

    public String getName_horse() {
        return name_horse;
    }

    public void setName_horse(String name_horse) {
        this.name_horse = name_horse;
    }

    public String getIndividual() {
        return individual;
    }

    public void setIndividual(String individual) {
        this.individual = individual;
    }

    @Override
    public void makeNoise() {
        System.out.print(name_horse);
        super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.print(name_horse);
        super.eat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return getName_horse().equals(horse.getName_horse()) && getIndividual().equals(horse.getIndividual());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName_horse(), getIndividual());
    }


    @Override
    public String toString() {
        return "Имя животного: " + name_horse +"\nЕда животного: " + super.getFood() +
                "\nСреда обитания: " + super.getLocation() + "\nИндивидуальная черта:" + individual + "\n";
    }
}
