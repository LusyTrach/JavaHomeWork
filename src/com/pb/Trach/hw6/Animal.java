package com.pb.Trach.hw6;

import java.util.Objects;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {return food;}

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise(){
        System.out.println( " животное шумит");
    }

    public void eat(){
        System.out.println(" животное ест");
    }

    public void sleep(String name){
        System.out.println(name + " животное спит");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getFood().equals(animal.getFood()) && getLocation().equals(animal.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFood(), getLocation());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

}