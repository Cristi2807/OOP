package Lab3.Task2;

class Editor{
    String text;

    int getSentences(){
        int a=0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)=='.' || text.charAt(i)=='?' || text.charAt(i)=='!') a++;
        }
        return a;
    }

    int getWords(){
        String[] split= text.trim().split("\\s+");
        if (!split[0].equals(""))
            return split.length;
        else
            return 0;
    }

    int getLetters(){
        int a=0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) a++;
        }
        return a;
    }

    int getVowels(){
        int a=0;
        text=text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)=='a'||text.charAt(i)=='e'||text.charAt(i)=='i'||
                    text.charAt(i)=='o'|| text.charAt(i)=='u') a++;
        }
        return a;
    }

    int getCons(){
        return getLetters()-getVowels();
    }

}
public class Task2 {
    public static void main(String[] args) {


            Editor e=new Editor();

            e.text="Aaa";

            System.out.println(e.getSentences()+" sentence/s");


            System.out.println(e.getWords()+" word/s");


            System.out.println(e.getLetters()+" letter/s");

            System.out.println(e.getVowels()+" vowels");

            System.out.println(e.getCons()+" consonants");
    }
}
