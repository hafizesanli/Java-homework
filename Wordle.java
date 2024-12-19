import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Wordle {
    public static void main(String[] args) throws IOException {
        FileReader dict = new FileReader("dict.txt");
        BufferedReader bReader = new BufferedReader(dict);
        ArrayList<String> lines = new ArrayList<String>();
        String line = bReader.readLine();
        while(line != null){
            lines.add(line);
            line= bReader.readLine();

        }
        String[] array = lines.toArray(new String[0]);

        Random random = new Random();
        int index = random.nextInt(array.length);
        String KeyWord = array[index];

        Scanner scan = new Scanner(System.in);
        String word = ""; //
        /*System.out.println(KeyWord);*/
        System.out.println("Please enter a word! You have 6 attempts!");
        int attempt = 1;
        while(attempt <= 6) {

            word = scan.nextLine().toUpperCase();
            String[] words = word.split(" ");

            for (int a = 0; a < words.length; a++) {
                    System.out.println("Try" + attempt + " (" + words[a] + "):\n");

            }

            if (words.length > 6) {
                break;

            }if (words[0].length() != 5) {
                System.out.println("The length of word must be five!");


            }

            if (words[0].equals(KeyWord) && attempt >= 4) {
                System.out.println("Congratulations! You guess right in " + attempt + "th shot!");
                return;

            }
            if (words[0].equals(KeyWord) && attempt == 1) {
                System.out.println("Congratulations! You guess right in 1st shot!");
                return;

            }
            if (words[0].equals(KeyWord) && attempt == 2) {
                System.out.println("Congratulations! You guess right in 2nd shot!");
                return;

            }
            if (words[0].equals(KeyWord) && attempt == 3) {
                System.out.println("Congratulations! You guess right in 3rd shot!");
                return;

            } else {
                for (int i = 0; i < 5; i++) {
                    char c = words[0].charAt(i);

                    boolean True = false;
                    for (String e : array) {
                        if (e.contains(word)) {
                            True = true;
                            break;

                        }
                    }
                    if (!True) {
                        System.out.println("Word does not exist in dictionary!");
                        break;

                    }

                    if (KeyWord.indexOf(c) == i) {
                        System.out.println((i + 1) + ". letter exists and located in right position.");

                    } else if (KeyWord.indexOf(c) >= 0) {
                        System.out.println((i + 1) + ". letter exists but but located in wrong position.");

                    } else {
                        System.out.println((i + 1) + ". letter does not exist.");

                    }

                }
                attempt++;
            }


        }
        System.out.println("You exceeded maximum try shot!");
        System.out.println("You failed! The key word is " +KeyWord+ ".");

    }

}
