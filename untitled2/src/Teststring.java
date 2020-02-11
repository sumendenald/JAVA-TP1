
import java.util.Scanner;

public class Teststring {

    public static void main (String[] args ){
        String machaine ;
        String machaine2;
        Scanner entree = new Scanner(System.in);
        Scanner entree2 = new Scanner(System.in);
        System.out.print("Saisir un mot : ");
        machaine = entree.next();
        System.out.println(machaine);
        int count = 0;

        //Counts each character except space
        for(int i = 0; i < machaine.length(); i++) {
            if(machaine.charAt(i) != ' ')
                count++;
        }

        //Displays the total number of characters present in the given string
        System.out.println("nombre total de charactere " + count);
        machaine = machaine.toUpperCase();
        System.out.println("la chaine en majuscule: " + machaine);
        System.out.print("Saisir un  deusieme mot : ");
        machaine2 = entree2.next();
        System.out.println("les deux chaine sont identique :" + machaine.equals(machaine2.toUpperCase()));
        System.out.println("la chaine est-elle en minuscule  ? :" + machaine.equals(machaine.toLowerCase()));








        String S = "radar";
        S.trim(); // blanc
        int left = 0 ;
        int right = S.length() -1 ;
        while (left< right) {
            if (S.charAt(left++) != S.charAt(right-- )){ // palindrome
                System.out.println("pas palindrome");
            }
            System.out.println(" palindrome");
        }

    }

}

