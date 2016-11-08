import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        String inputString = main.readString();
        inputString = main.reverse(inputString);
        System.out.println("Анаграма: "+inputString);
    }

    private String readString(){
        System.out.println("Введите фразу: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }

    private String reverse(String str){
        int k=0;
        String strReverse ="";
        for (int i =1;i< str.length();i++) {
            if (str.charAt(i)== ' ') {
                StringBuilder strRevWord = new StringBuilder(str.substring(k,i));
                strRevWord.reverse();
                k=i+1;
                strReverse +=strRevWord.toString()+" ";
            }
        }

        return strReverse;
    }
}
