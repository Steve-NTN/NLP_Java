import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException {

        //Press a word to test
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\nPress a word to test:");
            String word = sc.nextLine();
            if (word.equals("0"))
                break;
            CorrectText correctText = new CorrectText();
            correctText.correctText(word);
        }

    }
}
