package sept.ex_20092024.Task_20Sept;

public class Lab056_LeapYear {
    public static void main(String[] args) {
        int year = 2000;
        if (year % 400 == 0) {
            System.out.println(year + " is leap year");
        } else if(year%100==0) {
            System.out.println(year + " is  not a leap year");
        }
        else if(year%4==0) {
            System.out.println(year + " is  a leap year");
        }
        else {
            System.out.println(year + " is  not a leap year");
        }
    }
}
