package Exercise2;

public class Marathon {

    // implement method here

    /**
     * @param times a non-empty array of integers
     * @return The lowest number in the array
     */
    public int fastestTime(int [] times){

        int fastestTime= times[0];
        int fastestIndex= 0;

        for(int i=1; i<times.length; i++){
            if(times[i] < fastestTime){
                fastestTime= times[i];
                fastestIndex= i;
            }
        }
        return fastestIndex;
    }

    public static void main(String [] args){

        String [] names= {"Elena", "Thomas", "Hamilton", "Suzie",
        "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel",
                "Neda", "Aaron", "Jane"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

        // call method here and, then print the name and time of the fastest runner
        Marathon m = new Marathon();
        int i= m.fastestTime(times);
        System.out.printf("The fastest marathon time was %d and the person who achieved this time was %s", times[i], names[i]);
    }
}
