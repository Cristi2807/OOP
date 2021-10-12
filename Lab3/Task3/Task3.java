package Lab3.Task3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

class Editor {
    String text;

    void getLongestWord() {
        String[] split = text.trim().split("\\s+");
        int maxl = 0;
        for (int i = 0; i < split.length; i++) {
            if(split[i].length()>0)
            if (!Character.isLetter(split[i].charAt(0)))
                if (split[i].length() > 1) split[i] = split[i].substring(1);
                else split[i] = "";

            if (split[i].length() > 1)
                if (!Character.isLetter(split[i].charAt(split[i].length() - 1)))
                    split[i] = split[i].substring(0, split[i].length() - 1);
            if (split[i].length()>maxl) maxl = split[i].length();

        }
        System.out.print("Longest word/s ("+maxl+" letter/s) : ");
        for (String s : split) {
            if (s.length() == maxl) System.out.print(s + "   ");
        }
    }


    void getTop5Words(){
        text=text.toLowerCase();
        String[] split = text.trim().split("\\s+");

        for (int i = 0; i < split.length; i++) {
            if(split[i].length()>0)
            if (!Character.isLetter(split[i].charAt(0)))
                if (split[i].length() > 1) split[i] = split[i].substring(1);
                else split[i] = "";

            if (split[i].length() > 1)
                if (!Character.isLetter(split[i].charAt(split[i].length() - 1)))
                    split[i] = split[i].substring(0, split[i].length() - 1);
        }


        Map<String,Integer> hm = new HashMap<>();
        for (String s : split) {
            hm.putIfAbsent(s, 0);
            int count=hm.get(s);
            hm.put(s,++count);
        }

        Stream<Map.Entry<String, Integer>> sorted =
                hm.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("Top 5 words :");

        sorted.limit(5).forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()+"time/s"));

    }

}


public class Task3 {
    public static void main(String[] args) {

        Editor e=new Editor();

        e.text="It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.";

        e.getTop5Words();

        e.getLongestWord();


    }
}
