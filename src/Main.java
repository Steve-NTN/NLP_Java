import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException {
        ISpellingCorrector sc = new SpellingCorrector(10000);

        //Read data from file
        //Input i = new Input();
        //i.input("words.txt");

        //Test with word "wrong"
        sc.putWord("wrong");
        System.out.println(sc.correct("worng")); // Will return wrong
        System.out.println(sc.correct("wroing")); // Will return wrong

    }
}
