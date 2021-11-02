package com.pb.Trach.рhw5;

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book("Приключения", "Иванов", "2000 год");
        Book book2 = new Book("Словарь", "Сидоров", "1980год");
        Book book3 = new Book("энциклопедия", "Гусев", "2010 г");

        book1.setNamebook("Приключения");
        book2.setNamebook("Словарь");
        book3.setNamebook("энциклопедия");

        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());

        Reader reader1 = new Reader("ПЕТРОВ  ", 5631, "1-Ю", "20,01", "096123");
        Reader reader2 = new Reader(" Мазур ", 2325, "2-Ю", "01,20", "096565");
        Reader reader3 = new Reader("Шнуров  ", 4578, "5-Ю", "02,11", "0964563");
        System.out.println(reader1.student());
        System.out.println(reader2.student());
        System.out.println(reader3.student());

        book1.takeBook(reader1.getName());
        book2.takeBook(reader3.getName()  + book1.getNamebook()   +    book2.getNamebook()   +   book3.getNamebook());
        book3.takeBook(reader2.getName()  +   book1.getNamebook()  +
                book1.getAuthorbook()   +   book1.getYear());
        System.out.println();

        book1.returnBook(reader1.getName());
        book2.returnBook(reader1.getName() + book1.getNamebook()   +    book2.getNamebook()   +   book3.getNamebook());
        book3.returnBook(reader3.getName() +   book1.getNamebook()  +
                book1.getAuthorbook()   +   book1.getYear() + book2.getNamebook() + book2.getAuthorbook()   +   book2.getYear()
                + book3.getNamebook() +  book3.getAuthorbook()   +   book3.getYear());
        System.out.println();
    }


 }

