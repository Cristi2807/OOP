package Lab3.Task1;

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

}

public class Task1 {
    public static void main(String[] args) {

        Editor e=new Editor();

        e.text=" Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.";
        System.out.println(e.getSentences()+" sentence/s");


        System.out.println(e.getWords()+" word/s");


    }
}
