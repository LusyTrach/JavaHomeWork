package com.pb.Trach.рhw5;
public class Book {
    private String namebook;
    private String authorbook;
    private String year;

    public Book(String namebook, String authorbook, String year) {
        this.namebook = namebook;
        this.authorbook = authorbook;
        this.year = year;
    }

    public String getNamebook() {
        return namebook;
    }

    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }

    public String getAuthorbook() {
        return authorbook;
    }

    public void setAuthorbook(String authorbook) {
        this.authorbook = authorbook;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public void takeBook (String name) {
        System.out.println(name +" взял книги");
    }
    public void takeBook (String name, String... namebooks) {
        System.out.println(name + "взял несколько книг" + namebook);
        for (String namebook : namebooks) {

            System.out.println(namebook);
        }
        System.out.println("взял книги с названием");

    }
    public void takeBook (String...Books) {
        System.out.println("название книг");
        for (String Book : Books) {
            System.out.println(Book);
        }
        System.out.println("взял книги");
    }

    public void returnBook (String name) {
        System.out.println(name + " вернул книги");
    }
    public void returnBook (String name, String... namebooks) {
        System.out.println(name + "вернул несколько книг" + namebook);
        for (String namebook : namebooks) {
            System.out.println(namebook);
        }
        System.out.println("вернул книги с названием");

    }
    public void returnBook (String...Books) {
        System.out.println("название книг");
        for (String Book : Books) {
            System.out.println(Book);
        }
        System.out.println("вернул книги");
    }

    String getInfo() {
        return "[название книги:" + namebook + ", автор: " + authorbook + ", год издания: " + year + "]";
    }
}






