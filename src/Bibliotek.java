import java.util.ArrayList;
import java.util.Collections;

public class Bibliotek {
    ArrayList<Bog> myArr = new ArrayList<Bog>();


    public Bibliotek() {
        myArr.add(new Bog("flyverne", "7163-7812", 2015));
        myArr.add(new Bog("hopperne", "7163-7812-87123", 2015));
        myArr.add(new Bog("spiserne", "7163-7812-3", 2015));
    }

    public boolean insertBook(Bog newBook) {
        for (Bog b : myArr) {
            if (b.equals(newBook.getIsbnNr())) {
                return true;
            }

        }
        return false;
    }
}


//Skriv en klasse kaldet Bibliotek, der indeholder en liste af Bog objekter.
//Skriv en metode i Bibliotek klassen, som tager et Bog objekt som parameter,
// og returnerer true, hvis listen indeholder et Bog objekt med samme ISBN.