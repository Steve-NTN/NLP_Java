import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Input {
    public void input(String namefile) throws IOException {
        File file = new File(namefile);
        if (!file.exists()) {
            file.createNewFile();
        }

        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            String str = sc.nextLine();
            System.out.println(str);
        }



    }

}
