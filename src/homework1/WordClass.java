package homework1;

import java.util.ArrayList;
import java.util.List;

public class WordClass {
    static int longestWordLength = 0;
    static int count = 0;
    public static List<String> word(String pharse)
    {
        String[] choppedUpWord = pharse.split(" ");
        ArrayList <String> longestWord= new ArrayList<String>();

        for(int i=0; i < choppedUpWord.length; i ++){
            String theWord = choppedUpWord[i];
            count = choppedUpWord.length;
            if(longestWordLength < theWord.length()){

                longestWord.clear();
                longestWord.add(theWord);
                longestWordLength = theWord.length();
                count = choppedUpWord.length;
            }else if(longestWordLength == theWord.length()){

                longestWord.add(theWord);
                count = choppedUpWord.length;
            }
        }

        return longestWord;

    }
    public static StringBuilder reversedWord(String pharse){
        String[] secondWord = pharse.split(" ");
        StringBuilder secondW = new StringBuilder(secondWord[1]);
        secondW.reverse();
        return secondW;
    }

}
