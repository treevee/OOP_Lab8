import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        //ListSort();
        //System.out.println(FrequencyCount("go go go may to be done with you", "go"));
        //UniqWords("go Go go may to be done with you");
        /*SortSentences("Not him old music think his found enjoy merry. " +
                "Listening acuteness dependent at or an. " +
                "Apartments thoroughly unsatiable terminated sex how themselves. " +
                "She are ten hours wrong walls stand early. " +
                "Domestic perceive on an ladyship extended received do. " +
                "Why jennings our whatever his learning gay perceive. ");

         */
    }

    public static void ListSort(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int randomNum;
        for (int i = 0; i<100; i++){
            randomNum=ThreadLocalRandom.current().nextInt(-1000, 1001);
            list.add(randomNum);
        }

        for (int i = 0; i<100; i++){
            System.out.println(list.get(i));
        }

        System.out.println("----------------------------------------------");
        int offset = 0;

        int j = 0;
        while(j < list.size() - offset)
        {
            if(list.get(j) < 0)
            {
                list.add(list.get(j));
                list.remove(list.get(j));
                offset++;
            }
            else
                j++;
        }

        for (int i = 0; i<100; i++){
            System.out.println(list.get(i));

        }
    }

    public static void UniqWords(String str){
        HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        String[] words = str.split(" ");
        for (String word : words) {
            word=word.toLowerCase();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }
            else{
                map.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) System.out.println(entry.getKey());
        }
    }

    public static float FrequencyCount(String str, String searchWord){
        HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        String[] words = str.split(" ");
        int wordsAmount=0;
        for (String word : words) {
            System.out.println(word);
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }
            else{
                map.put(word, 1);
            }
            wordsAmount++;
        }
        if (map.containsKey(searchWord)) {
            return map.get(searchWord)/(float)wordsAmount;
        }
        else{
            System.out.println("Can't find word: "+searchWord);
            return 0;
        }
    }

    public static void SortSentences(String str){
        ArrayList<String> list= new ArrayList<String>();
        String[] senteces = str.split("\\.");
        for(String sentece : senteces){
            list.add(sentece);
        }
        Collections.sort(list);
        for(String sentence : list) {
            System.out.println(sentence + ".");
        }
    }

}