import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.io.*;
import java.util.Scanner;

public class Wordlee {
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
        String word = "";

        int attempt = 1;

        while(attempt < 7) {
            System.out.println("Try"+attempt+"("+KeyWord+"): ");
            word = scan.nextLine().toUpperCase();
            String[] words = word.split(" ");

            /*if (words.length >= 6) {
                words = Arrays.copyOfRange(words, 0, 5);

            }*/
            if(words.length != 6){
                continue;
            } else if (words[0].length() != 5) {
                System.out.println("The length of word must be five!");
                continue;
            }

            boolean correct = true;
            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == KeyWord.charAt(i)){
                    System.out.println("Letter exists and located in right position.");
                } else if (KeyWord.indexOf(word.charAt(i)) >= 0 ) {
                    System.out.println("Letter exists but located in wrong position.");
                    correct = false;
                    
                } else {
                    System.out.println("Letter does not exists.");
                    correct = false;
                    
                }
            }
            if(correct){
                System.out.println("Congratulations! You guess right in kth shot!");
                break;
            }




        }
        if(attempt >= 7){
            System.out.println("You failed! The key word is" +KeyWord+".");
        }
        boolean True = false;
        for(String e : array){
            if(e.contains(word)){
                True = true;
                break;
            }
        }
        if(!True){
            System.out.println("Word does not exist in dictionary!");
        }

    }
}
