import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int guesses;
        int length;
        wordlist origwordlist = new wordlist();
        wordlist playwordlist = new wordlist(); // -> Limited list only applies for a single round
        String fileName;
        Character chr;
        boolean flag;
        boolean newGame;
        hangman play;

        Scanner input = new Scanner(System.in);

        do {
            try {
                flag = true;
                System.out.print("Anna wordlist-tiedoston nimi: ");
                fileName = input.nextLine();
                origwordlist = new wordlist(fileName);
            } catch (Exception e) {
                System.out.println("Tiedostoa ei ole olemassa.");
                e.printStackTrace();
                flag = false;
            }
        } while (flag == false);

        do {
            System.out.print("Aloitetaanko uusi peli? y/n > ");
            switch (input.nextLine()) {
                case "y":
                    newGame = true;

                    System.out.print("Vain tietynpituisia sanoja? y/n > ");

                    switch (input.nextLine()) {
                        case "y":
                            System.out.print("Sanan pituus? > ");
                            length = input.nextInt();
                            input.nextLine();
                            playwordlist = origwordlist.sanatJoidenPituusOn(length);
                            break;
                        default:
                            playwordlist = new wordlist(origwordlist.annaSanat());
                    }

                    System.out.print("Montako arvausta? > ");
                    guesses = input.nextInt();
                    input.nextLine();

                    // Start Game
                    play = new hangman(playwordlist, guesses);
                    System.out.println(play.word());

                    do {
                        System.out.print("Anna kirjain:  ");

                        chr = input.next().charAt(0);
                        input.nextLine();

                        if (play.arvaa(chr)) {
                            System.out.println("\nArvauksia jäljellä: " + play.guessesleft());
                            System.out.println("\n" + play.updateHiddenWord(chr) + "\n");
                            continue;
                        }
                        if (play.guessesleft() > 0) {
                            System.out.println("Väärin!");
                            System.out.println("Arvauksia jäljellä: " + play.guessesleft());
                            System.out.println("\n" + play.word() + "\n");
                        }
                    } while (play.onLoppu() == false);

                    if (play.onRatkaistu() == true) {
                        System.out.println("Voitit Pelin!");
                    } else {
                        System.out.println("Haettu sana: " + play.getCurrentWord());
                        System.out.println("Hävisit Pelin!");
                    }

                    break;

                case "n":
                    newGame = false;
                    break;
                default:
                    newGame = true;
                    break;
            }
        } while (newGame);

        input.close();
    }
}
