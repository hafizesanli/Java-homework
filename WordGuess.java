import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) throws IOException {
        FileReader dict = new FileReader("dict.txt");
        BufferedReader bReader = new BufferedReader(dict);
        ArrayList<String> lines = new ArrayList<String>();
        String line = bReader.readLine();
        while (line != null) {
            lines.add(line);
            line = bReader.readLine();
        }
        String[] array = lines.toArray(new String[0]);

        Random random = new Random();
        int index = random.nextInt(array.length);
        String KeyWord = array[index];

        Scanner scan = new Scanner(System.in);
        String word = "";

        int attempt = 1;
        while (attempt <= 6) {
            /*System.out.print("Try" + attempt + " (" + word + "): ");*/
            word = scan.nextLine();
            String[] words = word.split(" ");
            for(int a = 0; a < words.length; a++){
                System.out.print("Try" + attempt + " (" + words[a] + "):\n");

            }


            if (words.length > 6) {
                break;
            } else if (words[0].length() != 5) {
                System.out.println("The length of word must be five!");
                continue;

            }

            if (words[0].equals(KeyWord)) {
                System.out.println("Congratulations! You guessed right in " + attempt + "th shot!");
                return;
            } else {
                for (int i = 0; i < 5; i++) {
                    char ch = words[0].charAt(i);
                    boolean True = false;
                    for(String e : array){
                        if(e.contains(word)){
                            True = true;
                            break;
                        }
                    }
                    if(!True) {
                        System.out.println("Word does not exist in dictionary!");
                        break;
                    }
                    if (KeyWord.indexOf(ch) == i) {
                        System.out.println((i + 1) + ". letter exists and located in right position.");
                    } else if (KeyWord.indexOf(ch) >= 0) {
                        System.out.println((i + 1) + ". letter exists but located in wrong position.");
                    } else {
                        System.out.println((i + 1) + ". letter does not exist.");
                    }
                }
                attempt++;


            }

        }
        System.out.println("You exceeded maximum try shot!");
        System.out.println("You failed! The key word is " + KeyWord+".");
    }
}
