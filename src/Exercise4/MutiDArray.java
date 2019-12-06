package Exercise4;

import java.util.Scanner;

public class MutiDArray {


    public void reverseSentence(String sentence, Character[] arr){
        for(int i=sentence.length()-1, j=0; i>=0; i--, j++){
            arr[j]= sentence.charAt(i);
        }

    }

    public void reverseWords(String sentence, Character [] arr){
        String [] words= sentence.split(" ");

        for(int i=words.length-1, letter=0 ; i>=0; i--){

            for(int j=0; j<words[i].length(); j++, letter++){
                arr[letter] = words[i].charAt(j);
            }
            arr[letter++]= ' ';
        }

    }

    public void upperCaseTheFives(String sentence, Character [] arr){
        for(int i=0; i<sentence.length(); i++){
            if(i%5 == 0){
                arr[i]= Character.toUpperCase(sentence.charAt(i));
            }
            else{
                arr[i]= sentence.charAt(i);
            }
        }
    }

    public void printCharArray(Character [] arr){
        for(int i=0; i<arr.length && arr[i]!= null; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String [] arg){

        MutiDArray m = new MutiDArray();

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        String sentence= "";

        Character [][] arr= new Character[3][60];

        for(int i=0; i<3; i++){
            System.out.println("Please enter a sentence: ");
            sentence= scanner.nextLine();

            if(i ==0){
                m.reverseSentence(sentence, arr[i]);
            }
            else if(i==1){
                m.reverseWords(sentence, arr[i]);
            }
            else{
                m.upperCaseTheFives(sentence, arr[i]);
            }

            m.printCharArray(arr[i]);

        }

        scanner.close();




    }
}
