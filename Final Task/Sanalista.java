import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class wordlist {
    private List<String> wordlist;

    public wordlist() {
        this.wordlist = new ArrayList<String>();
    }

    public wordlist(List<String> wordlist) {
        this.wordlist = wordlist;
    }

    public wordlist(String pathName) throws Exception {
        String wordIn;
        this.wordlist = new ArrayList<String>();
        try {
            File file = new File(pathName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                wordIn = reader.nextLine();
                this.wordlist.add(wordIn.toLowerCase());
            }
            reader.close();
        } catch (Exception e) {
            if (e != null) {
                throw new Exception("Tiedostoa ei ole olemassa!");
            }
        }
    }

    public List<String> annaSanat() {
        return wordlist;
    }

    public wordlist wordswithlength(int length) {
        wordlist newwordlistObj;
        List<String> newwordlist = new ArrayList<String>();
        for (String word : this.wordlist) {
            if (word.length() == length) {
                newwordlist.add(word);
            }
        }
        newwordlistObj = new wordlist(newwordlist);
        return newwordlistObj;
    }

    public wordlist wordswithsymbols(String mask) {
        wordlist newwordlistObj;
        List<String> newwordlist = new ArrayList<String>();
        for (String word : this.wordlist) {
            boolean ok = true;
            if (word.length() == mask.length()) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) != mask.charAt(i)) {
                        if (mask.charAt(i) != '_') {
                            ok = false;
                        }
                    }
                }
            }
            if (ok) {
                newwordlist.add(word);
            }
        }
        newwordlistObj = new wordlist(newwordlist);
        return newwordlistObj;
    }

}
