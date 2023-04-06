import java.util.Scanner;
class BodyMassIndex{
    private double height;
    private double weight;

BodyMassIndex(){
   this.height = 0;
   this.weight = 0;
}
public double getHeight(){
    return this.height;
}
public void setHeight(int height){
    this.height = height;
}
public double getWeight(){
    return this.weight;
}
public void setWeight(int weight){
    this.weight = weight;
}
void calculateBMI(){
    Scanner sc = new Scanner(System.in);
    BodyMassIndex bmi = new BodyMassIndex();
    System.out.print("Enter height in meters : ");
    bmi.setHeight(sc.nextInt());
    System.out.print("Enter weight in kgs : ");
    bmi.setWeight(sc.nextInt());
    double BMI =  (bmi.getWeight()/( bmi.getHeight()*bmi.getHeight()));
    System.out.print("BodyMassIndex : " + BMI );
    }
}
class Program2{
    public static void main(String[]args){
        BodyMassIndex bmi1 = new BodyMassIndex();
        bmi1.calculateBMI();
    }
}