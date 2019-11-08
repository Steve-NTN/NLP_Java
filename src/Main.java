import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{


    public static void main(String[] args) throws IOException {
        ISpellingCorrector sc = new SpellingCorrector(100000);

        //Read data from file
        Input inp = new Input();
        inp.input("words.txt");

        //Put all words into list
        for (int i = 0; i < inp.listWord.size() - 1; i++){
            sc.putWord(inp.listWord.get(i));
        }

        //Press a word to test
        Scanner s = new Scanner(System.in);
        System.out.println("Press a word to test:");
        String word = s.nextLine();

        System.out.println(sc.correct(word));

    }
}
