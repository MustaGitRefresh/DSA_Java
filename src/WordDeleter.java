import java.util.Scanner;
import java.util.StringTokenizer;

public class WordDeleter {
    String text;
    public static void main(String[] args) {
        WordDeleter wordD = new WordDeleter();
        wordD.takeInput();
        System.out.println("Enter the word and its position to be deleted");
        Scanner sc = new Scanner(System.in);
        String deleter =  sc.nextLine();
        int position = sc.nextInt();
        wordD.remover(position-1);
        System.out.println("The sentence after deletion of " + "'" + deleter +  "'");
        System.out.println(wordD.text);
    }

    void takeInput(){
        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();
    }
    void remover(int pos){
        StringTokenizer st = new StringTokenizer(text);
        int words_count = st.countTokens();
        String[] words = new String[words_count];
        for(int i=0;i<words_count;i++){
            words[i] = st.nextToken();
        }
        // removing the stuffs
        if(pos > words_count){
            System.out.println("The position of word is out of range");
        }
        else {
            words[pos] = "";
        }
        text = "";
        for(int j=0;j<words.length;j++){
            text += words[j] + " ";
        }
    }
}

