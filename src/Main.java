import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String name = "Gustavo";
        char[] nameArray = name.toCharArray();
        int count = 0;
        for (char c : nameArray) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("String has the letter a and it appears " + count + " times");
        } else {
            System.out.println("String does not have the letter a");
        }
    }

}
