package com.pb.Trach.hw6;

import java.util.Objects;

public class Cat extends Animal {

    private String name_cat;
    private String individual;

    public Cat(String food, String location, String name_cat, String individual) {
        super(food, location);
        this.name_cat = name_cat;
        this.individual = individual;
    }

    public String getName_cat() {
        return name_cat;
    }

    public void setName_cat(String name_cat) {
        this.name_cat = name_cat;
    }

    public String getIndividual() {
        return individual;
    }

    public void setIndividual(String individual) {
        this.individual = individual;
    }

    @Override
    public void makeNoise() {
        System.out.print(name_cat);
        super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.print(name_cat);
        super.eat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return getName_cat().equals(cat.getName_cat()) && getIndividual().equals(cat.getIndividual());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName_cat(), getIndividual());
    }

    @Override
    public String toString() {
        return "Имя животного: " + name_cat +"\nЕда животного: " + super.getFood() +
                "\nСреда обитания: " + super.getLocation() + "\nИндивидуальная черта:" + individual + "\n";
    }
}
