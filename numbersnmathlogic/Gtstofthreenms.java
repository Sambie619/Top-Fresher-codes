package numbersnmathlogic;

public class Gtstofthreenms {
    public static void main(String[] args) {
        int num1=2,num2=222,num3=222;
        if(num1==num2 && num1==num3)System.out.println("all are equal");
        else if(num1>=num2 && num1>=num3)System.out.println(num1+" is greatest");
        else if(num2>=num1 && num2>=num3)System.out.println(num2+" is greatest");
        else System.out.println(num3+" is greatest");
    }
}
