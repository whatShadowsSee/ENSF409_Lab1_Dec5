package Exercise6;

public class Clock {

    private int day;
    private int hour;
    private int minute;
    private int second;

    public Clock(int day, int hour, int minute, int second){
        setDay(day);
        setHour(hour);
        setMinute(minute);
        setSecond(second);

    }

    public Clock(){
        this(0,0,0,0);
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setHour(int hour) {
        if(hour<0 || hour>23){
            System.out.println("Incorrect hour provided. The hour will remain unchanged");
            return;
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if(minute<0 || minute>59){
            System.out.println("Incorrect minute provided. The minute will remain unchanged");
            return;
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if(second<0 || second>59){
            System.out.println("Incorrect second provided. The second will remain unchanged");
            return;
        }
        this.second = second;
    }

    public void increment(int second){
        this.second+=second;

        if(this.second>=60){
            // if added 120, would need to add 2 minutes (for example)
            minute+= this.second/60; // integer divison
            this.second%=60;

            if(minute>=60){
                hour+= minute/60; // integer divison
                minute= minute%60;

                if(hour>=24){
                    day+= hour/24; // integer divison
                    hour= hour%24;
                }
            }
        }
    }

    public int calculateTotalSeconds(){
        int totalTime= second;
        totalTime+= minute*60;
        totalTime+= hour*60*60;
        totalTime+= day*24*60*60;
        return  totalTime;
    }

    public void displayClock(){
        System.out.println(getDay() + ":" + getHour() + ":" + getMinute() + ":" + getSecond());
    }

    public static void main(String [] args){
        // Create elapsed time with the default values of zeroes for day, hour, min, and second
        Clock t1 = new Clock(); // default const

        t1.setHour(23);
        t1.setDay(1);
        t1.setMinute(59);
        t1.setSecond(16);

        t1.displayClock();

        t1.increment(44);

        t1.displayClock();

        System.out.printf("The elapsed time in seconds is %d\n", t1.calculateTotalSeconds());

        Clock t2 = new Clock(3,1,4,5);
        t2.displayClock();


    }

}
