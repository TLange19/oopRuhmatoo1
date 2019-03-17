import java.util.Random;
import java.util.Scanner;
//Puuduvad asjad:
//1)Ideaalis võiks saada kasutaja käest alguses küsida mitu inimest mängib
//2)get ja set meetodid
//3)Vähemalt 1 klass on veel vaja teha - Ma arvan et täringuviske võib teha eraldi klassiks,


public class Lauamäng {
    public static void main(String[] args) throws InterruptedException {
        Scanner küs = new Scanner(System.in);
        System.out.print("Sisesta mängijate arv: ");
        int mängijaid = küs.nextInt();
        küs.nextLine();
        Mäng mäng = new Mäng(mängijaid, new Täring());
        System.out.println("Mängu algus");
        Thread.sleep(500);
        while (mäng.kasMängKäib()) {
            mäng.järgmineRound();
            Thread.sleep(500);
            System.out.println("\nVajuta enterit et järgmist roundi alustada.");
            String userChoice = küs.nextLine();
            Thread.sleep(500);


        }
    }
}
