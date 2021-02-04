import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Propercase {

    public void caseSensitive() {
        Scanner scan = new Scanner(System.in);

        String [] wordList = scan.nextLine().split(" ");
        for (String s : wordList) {
            s.equals(s.toUpperCase());
            if (s.equals(s.toUpperCase())) {
                System.out.println(s);

            } else if (s.length() > 3) {
                System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase());
            } else if (s.length() <= 3) {
                System.out.println(s.toLowerCase());
            }
            else
            {
                System.out.println(s);
            }

        }
    }

}



//Skriv en metode, der tager imod en sætning af ord med blanktegn imellem. Sætningen ændres efter følgende regler:
//
//· Ord, som udelukkende er skrevet med store bogstaver, skal ikke ændres.
//
//· Ord på mere end 3 bogstaver skal skrives med småt, dog med stort begyndelsesbogstav.
//
//· Ord på max. 3 bogstaver skal skrives med småt.
//
//Metoden skal returnere den ændrede sætning.
//
//· Inddrag fejlhåndtering (Hvordan vil du f.eks. håndtere en null-string som input?)