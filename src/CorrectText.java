import java.io.IOException;
public class CorrectText {
    public void correctText(String text) throws IOException {

        ISpellingCorrector sc = new SpellingCorrector(100000);
        //Delete space
        text = text.trim();
        text = text.replaceAll("\\s+"," ");

        //Read data from file
        Input inp = new Input();
        inp.input("words.txt");

        //Put all words into list
        for (int i = 0; i < inp.listWord.size() - 1; i++){
            sc.putWord(inp.listWord.get(i));
        }
        //Split the text to array
        String[] listWord = text.split(" ");
        int count = 0;
        for (String l : listWord){
            if (count == 0){
                String firstWord = sc.correct(l);
                firstWord = firstWord.substring(0,1).toUpperCase() + firstWord.substring(1).toLowerCase();
                System.out.print(firstWord + " ");
            }
            else{
                System.out.print(sc.correct(l) + " ");
            }
            count++;

        }
    }
}
