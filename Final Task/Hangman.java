import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Hirsipuu {
    private int guessesleft;
    private int guessesInit;
    private int wordIndex;
    private wordlist wordlist;
    private String randomWord;
    private String hiddenWordString;
    private List<String> hiddenWord;
    private Set<Character> wordChars;
    private List<Character> wordCharsList;
    private List<Character> guessesList;
    private Random random;

    public Hirsipuu(wordlist wordlist, int guessesInit) {
        this.wordlist = wordlist;
        this.guessesleft = guessesInit;
        this.guessesInit = guessesleft;
        this.random = new Random();
        this.hiddenWord = new ArrayList<>();
        this.wordChars = new HashSet<>();
        this.wordCharsList = new ArrayList<>();
        this.guessesList = new ArrayList<>();

        this.wordIndex = random.nextInt(wordlist.givewords().size());
        this.randomWord = this.wordlist.givewords().get(wordIndex);

        for (Character character : randomWord.toCharArray()) {
            this.wordChars.add(character);
            this.wordCharsList.add(character);
        }

        for (Character character : randomWord.toCharArray()) {
            this.hiddenWord.add("_");
        }
        this.hiddenWordString = String.join("", hiddenWord);
    }

    public boolean guess(Character chr) {
        if (wordChars.contains(chr)) {
            this.guessesList.add(chr);
            return true;
        } else {
            if (!guessesList.contains(chr)) {
                this.guessesleft--;
                this.guessesList.add(chr);
            }
            return false;
        }
    }

    public List<Character> arvaukset() {
        return this.guessesList;
    }

    public int guessesleft() {
        return this.guessesleft;
    }

    public String word() {
        return this.hiddenWordString;
    }

    public boolean hasEnded() {
        if (this.guessesleft == 0) {
            return true;
        }
        if (this.hasSolved()) {
            return true;
        }
        return false;
    }

    public boolean hasSolved() {
        if (guessesList.containsAll(wordChars)) {
            return true;
        } else {
            return false;
        }
    }

    public String updateHiddenWord(Character chr) {

        int index = randomWord.indexOf(chr);

        while (index >= 0) {
            hiddenWord.set(index, Character.toString(chr));
            index = randomWord.indexOf(chr, index + 1);
        }
        hiddenWordString = String.join("", hiddenWord);
        return hiddenWordString;

    }

    public void setguessesleft(int guessesleft) {
        this.guessesleft = guessesleft;
    }

    public void setGuessesList(ArrayList<Character> guessesList) {
        this.guessesList = guessesList;
    }

    public void setRandomWord(String randomWord) {
        this.randomWord = randomWord;
    }

    public void setwordlist(wordlist wordlist) {
        this.wordlist = wordlist;
    }

    public void setWordIndex(int wordIndex) {
        this.wordIndex = wordIndex;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setWordChars(Set<Character> wordChars) {
        this.wordChars = wordChars;
    }

    public void setWordCharsList(List<Character> wordCharsList) {
        this.wordCharsList = wordCharsList;
    }

    public Set<Character> getWordChars() {
        return wordChars;
    }

    public List<Character> getWordCharsList() {
        return wordCharsList;
    }

    public int getWordIndex() {
        return wordIndex;
    }

    public String getCurrentWord() {
        return randomWord;
    }
}
