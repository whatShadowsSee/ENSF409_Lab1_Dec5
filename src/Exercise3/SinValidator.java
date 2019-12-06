package Exercise3;

public class SinValidator {


    /**
     *
     * @param Sin: The SIN must be a 9 digit integer
     * @return Whether or not the number provided is a valid SIN
     */
    public boolean validateSin(int sin){

        String stringSin= String.valueOf(sin);

        if(stringSin.length() < 9){
            return false;
        }

        // add 1st, 5th, and 7th digits
        int stepOne= Character.getNumericValue(stringSin.charAt(0)) + Character.getNumericValue(stringSin.charAt(2)) +
                Character.getNumericValue(stringSin.charAt(4)) + Character.getNumericValue(stringSin.charAt(6));

        // multiply 2nd digit by 2 and ad the digits of the resultant product together
        // repeat step 2 for 4th, 6th, and 8th digits

        int [] stepTwo= new int[4]; // 2nd, 4th, 6th, 8th digits

        String stepTwoString= "";

        for(int i=1, j=0; i<8; i+=2, j++){
            stepTwoString = String.valueOf(2*Character.getNumericValue(stringSin.charAt(i)));
            for(int k=0; k< stepTwoString.length(); k++){
                stepTwo[j] +=  Character.getNumericValue(stepTwoString.charAt(k));
            }
        }


        // Add the four terms found in steps 2 and 3
        int stepFour= 0;
        for(int i=0; i<stepTwo.length; i++){
            stepFour+= stepTwo[i];
        }

        // Add the totals from steps 1 and 4 together
        int stepFive= stepOne+stepFour;


        // 10 minus the least significant digit of step 5 should be the ninth digit of the SIN
        String stepSix= String.valueOf(stepFive);

        char stepSixChar= stepSix.charAt(stepSix.length()-1);   // least significant digit
        String stepSixFinal= String.valueOf(10- Character.getNumericValue(stepSixChar));    // should work

//        System.out.println(stepSixFinal);

        if(stepSixFinal.charAt(0) == stringSin.charAt(stringSin.length()-1)){
            System.out.println("Correct SIN");
            return true;
        }




        return false;
    }

    public static void main(String [] args){
        SinValidator validator= new SinValidator();

        validator.validateSin(366497626);

    }
}
