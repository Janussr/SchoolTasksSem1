import java.util.ArrayList;

public class ArraylistExample {

    public static void myArray(ArrayList<String> list, String s) throws RuntimeException {
        list.add("dgftgyh");

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).equals(s)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        for (String t : list) {
            if (t.equals(s)) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
                throw new RuntimeException("De er ikke ens");
            }
        }
    }
}
//ArrayList
//
//Skriv en metode, der modtager 2 parametre: en arrayliste og en streng.
//
//Metoden skal gøre følgende:
//
//· Indsætte strengen i arraylisten, hvis den ikke findes i listen i forvejen. Ellers gøres ingenting med streng og arrayliste.
//
//· returnere værdien true, hvis strengen er blevet indsat i arraylisten. Ellers false.
//
//· Inddrag fejlhåndtering i din løsning, således at null værdier undgås i arraylisten
//
//· Hold listen sorteret.