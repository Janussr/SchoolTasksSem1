public class Bog {
    private String title;
    private String isbnNr;
    private int releaseYear;


    public Bog(String title, String isbnNr, int releaseYear) {
        this.title = title;
        this.isbnNr = isbnNr;
        this.releaseYear = releaseYear;
    }


    public boolean equals(String isbnNr) {
         return this.isbnNr.equals(isbnNr);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbnNr() {
        return isbnNr;
    }

    public void setIsbnNr(String isbnNr) {
        this.isbnNr = isbnNr;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "title='" + title + '\'' +
                ", isbnNr=" + isbnNr +
                ", releaseYear=" + releaseYear +
                '}';
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;

    }
}


/*Bog

Skriv en klasse kaldet Bog, der indeholder ISBN-nummer, titel og udgivelsesår.
Skriv flg. metoder:
· Konstruktør metode
· Get og set metoder
· toString metode
· Skriv en equals metode baseret på ISBN
Skriv en klasse kaldet Bibliotek, der indeholder en liste af Bog objekter.
· Skriv en metode i Bibliotek klassen, som tager et Bog objekt som parameter, og returnerer true, hvis listen indeholder et Bog objekt med samme ISBN.

 */