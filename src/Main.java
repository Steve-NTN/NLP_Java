import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException {
        ISpellingCorrector sc = new SpellingCorrector(10000);



        Input i = new Input();

        i.input("words.txt");


        //System.out.print(sc.correct("hellou"));

    }
}
