package Exercise1;

public class AverageCalculator {


//    private Double sum;

    // command line program

    /**
     *
     * @param arg
     */
    public static void main(String [] arg){

        Double sum= new Double(0);
        Double average= new Double(0);

        // check that something has been inputted into the command line
        if(arg.length == 0){
            System.out.println("You did not enter any numbers, goodbye");
            return;
        }


        // Does the command line ignore the empty spaces for args? i suppose we'll find out

        System.out.printf("The %d numbers are: ", arg.length);

        for(int i=0; i<arg.length; i++){
            try{
                // convert string to double
                sum+= Double.valueOf(arg[i]);
            } catch(NumberFormatException ne){
                System.out.println("One of the values entered was not a valid number, goodbye");
                return;
            }
        }
        average= sum/arg.length;

        System.out.printf("The %d numbers are: ", arg.length);

        for(int i=0; i<arg.length; i++){
            System.out.printf("%.3f ", Double.valueOf(arg[i]));
        }
        System.out.printf("\n \nAnd their average is: %.3f", average);


        // need to look up hwo to use printf before i properly complete this
//        System.out.println(sum);
//        System.out.println(average);

//        System.out.printf("The 4 numbers are: %.2f", );


    }


}
