import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    List<String> listWord = new ArrayList<String>();
    public void input(String namefile) throws IOException {
        File file = new File(namefile);
        if (!file.exists()) {
            file.createNewFile();
        }

        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            String str = sc.nextLine();
            listWord.add(str);
        }

    }

}
