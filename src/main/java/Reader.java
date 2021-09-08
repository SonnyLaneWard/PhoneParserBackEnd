import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Reader {
    public static ArrayList<String> read() {
        ArrayList<String> arr = new ArrayList<>();

        String username = System.getProperty("user.name");

        System.out.println(username);




        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/"+ username + "/Desktop/" + PhoneParser.name1 +".txt"))) {
            // C:\Users\810631\Desktop\exel.txt

            for(int i =0; i < 10000; i++)
            {
                String s = br.readLine();
                if (Objects.equals(s, ""))
                {
                    continue;
                }
                if ( s ==null)
                {
                    break;
                }
                arr.add(s);

            }

            System.out.println(arr);

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        return arr;
    }
}