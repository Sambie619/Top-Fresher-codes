package numbersnmathlogic;

public class Leapyr {
    public static void main(String[] args) {
        int year=2024;
        System.out.println((year%400==0||(year%4==0 && year%100!=0))?"leap year":"not leap year");
    }
}
