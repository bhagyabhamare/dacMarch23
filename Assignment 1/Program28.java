import java.util.Scanner;
class Program28{
    public static void main(String args[]){
        int i = Integer.parseInt(args[0]);
        float f = Float.parseFloat(args[1]);
        Double d = Double.parseDouble(args[2]);
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a int no from 1-4 : ");
    int j = sc.nextInt();
    switch(j)
    {
        case 1 : Double d1= i + f + d;
                System.out.println("Sum = "+d1);break;
        case 2 : Double d2= i - f - d;
                System.out.println("Minus = "+d2);break;
        case 3 : Double d3= i * f * d;
                System.out.println("Multiplication = "+d3);break;
        case 4 : Double d4= i / f / d;
                System.out.println("Division = "+d4);break;
    }


    }
}