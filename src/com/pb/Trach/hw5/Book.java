package com.pb.Trach.hw5;

public class Book {



    private String namebook;
    private String authorbook;
    private int releasebook;

    public Book(String namebook, String authorbook, int releasebook) {
        this.namebook = namebook;
        this.authorbook = authorbook;
        this.releasebook = releasebook;
    }


    public void setNamebook(String namebook) {
        if(namebook == null || namebook.isEmpty()){
            return;}
        this.namebook = namebook;
    }

    public void setAuthorbook(String authorbook) {
        if(authorbook == null || authorbook.isEmpty()){
            return;}
        this.authorbook = authorbook;
    }

    public void setReleasebook(int releasebook) {
        this.releasebook = releasebook;
    }

    public String getNamebook() {
        return namebook;
    }

    public String getAuthorbook() {
        return authorbook;
    }

    public int getReleasebook() {
        return releasebook;
    }



    public String getBookinfo(){
        return String.format("Название: %s,( Автор книги: %s, Год издания: %s г. )", namebook, authorbook, releasebook);
    }
}
