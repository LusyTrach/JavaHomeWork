package com.pb.Trach.hw5;



public class Library {
    public static void main(String[] args){
        Book book1 = new Book("Приключения","Иванов И. И.", 2000);
        Book book2 = new Book("Словарь","Сидоров А. В", 1980);
        Book book3 = new Book("Энциклопедия","Гусев К. В.", 2010);

        Reader reader1 = new Reader("Петров В. В.", 123, "Филология", "01.01.2000", "+380123456789");


        reader1.takeBook(3);
        reader1.takeBook(book1.getNamebook(),book2.getNamebook(),book3.getNamebook());
        reader1.takeBook(book1, book2, book3);

        reader1.returnBook(3);
        reader1.returnBook(book1.getNamebook(),book2.getNamebook(),book3.getNamebook());
        reader1.returnBook(book1, book2, book3);

    }
}
