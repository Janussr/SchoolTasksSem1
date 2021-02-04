import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Bibliotek bib = new Bibliotek();
        Bog book = new Bog("ligey","7163-7812",2312);
        bib.insertBook(book);
        System.out.println(bib.insertBook(book));

        //Propercase bogstaver = new Propercase();
       // bogstaver.caseSensitive();


      //  Bog book = new Bog("de",45,45);
       // ArrayList<String> cars = new ArrayList<String>();
      //  cars.add("Volvo");
       // System.out.println(cars);

        // Car myCar = new Car("red", 5, 4, true);
        // int result = myCar.getAge();
//
        // ArrayList<String> myArr = new ArrayList<String>();
        // myArr.add("hej");
//        ArraylistExample.myArray(myArr, "dgftgyh");

    }


}
