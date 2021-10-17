package Lab4.Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

class Text{
    String text;

    boolean Check(){
        Stack<String> paranteze= new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)=='(') paranteze.push("(");
            if (text.charAt(i)==')')
                if (!paranteze.empty()) paranteze.pop();
                else {
                    return false;
                }
        }
        return paranteze.empty();
    }
}

public class Task2 {
    public static void main(String[] args) {

        Text s=new Text();

        try{
            File f = new File("src/Lab4/Task2/three_expressions.txt");
            Scanner fReader = new Scanner(f);
            while(fReader.hasNextLine()){
                s.text = fReader.nextLine();

                if (s.Check()) System.out.println("Este o expresie matematica!");
                else System.out.println("Nu este o expersie matematica!");
            }
            fReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error ocurred.");
            e.printStackTrace();
        }

    }
}
