package com.pb.Trach.hw5;

public class Reader {
    private String namestudent;
    private int numberticket;
    private String faculty;
    private String bornedate;
    private String phonenumber;

    public Reader(String namestudent, int numberticket, String faculty, String bornedate, String phonenumber) {
        this.namestudent = namestudent;
        this.numberticket = numberticket;
        this.faculty = faculty;
        this.bornedate = bornedate;
        this.phonenumber = phonenumber;
    }

    public void setNamestudent(String namestudent) {
        if(namestudent== null || namestudent.isEmpty()){
            return;}
        this.namestudent = namestudent;
    }

    public void setNumberticket(int numberticket) {

        this.numberticket = numberticket;
    }

    public void setFaculty(String faculty) {
        if(faculty== null || faculty.isEmpty()){
            return;}
        this.faculty = faculty;
    }

    public void setBornedate(String bornedate) {
        if(bornedate== null || bornedate.isEmpty()){
            return;}
        this.bornedate = bornedate;
    }

    public void setPhonenumber(String phonenumber) {
        if(phonenumber== null || phonenumber.isEmpty()){
            return;}
        this.phonenumber = phonenumber;
    }

    public String getNamestudent() {
        return namestudent;
    }

    public int getNumberticket() {
        return numberticket;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getBornedate() {
        return bornedate;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getReaderinfo(){
        return String.format("Имя студента: %s, Номер читательского билета: %s, Факультет: %s, Дата народження: %s, Номер телефону: %s",
                namestudent, numberticket, faculty, bornedate, phonenumber);
    }

    public void takeBook(int i){

        System.out.print(namestudent + " взял " + i + " книги\n");
    }


    public void takeBook(String...arrey){
        System.out.print(namestudent + " взял книги: ");
        for (int i = 0; i < arrey.length; i++){
            System.out.print(arrey[i] + " ");
        }
        System.out.print("\n");
    }

    public void takeBook(Book...arrey){
        System.out.print(namestudent + " взял книги: ");
        for (int i = 0; i < arrey.length; i++){
            System.out.print(arrey[i].getBookinfo()+ " ");
        }
        System.out.print("\n");
    }


    public void returnBook(int i){

        System.out.print(namestudent + " вернул " + i + " книги\n");
    }


    public void returnBook(String...arrey){
        System.out.print(namestudent + " вернул книги: ");
        for (int i = 0; i < arrey.length; i++){
            System.out.print(arrey[i] + " ");
        }
        System.out.print("\n");
    }

    public void returnBook(Book...arrey){
        System.out.print(namestudent + " вернул книги: ");
        for (int i = 0; i < arrey.length; i++){
            System.out.print(arrey[i].getBookinfo()+ " ");
        }
        System.out.print("\n");
    }


}
