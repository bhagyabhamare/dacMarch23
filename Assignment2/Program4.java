import java.util.Scanner;
 class ElectricityBill{
    private String customerName;
    private double unitsConsumed;
    double billAmount;

ElectricityBill(){
    this.customerName = "  ";
    this.unitsConsumed = 0.0;
} 
 public void setCustomerName(String customerName){
    this.customerName = customerName;
 }
 public String getCustomerName(){
    return this.customerName ;
 }
 public void setUnitsConsumed(double unitsConsumed){
    this.unitsConsumed = unitsConsumed;
 }
 public double getUnitsConsumed(){
    return this.unitsConsumed ;
 }
 public double calculateBillAmount(double unitsConsumed)
    {
        if (unitsConsumed <= 100)
        {
            billAmount = unitsConsumed * 5;
        }
        else if (unitsConsumed <= 300)
        {
            billAmount = 100 * 5 + (unitsConsumed-100) * 7;
        }
        else
        {
            billAmount = 100 * 5 + (unitsConsumed-100) * 7 + (unitsConsumed-300) * 10;
        }
        return billAmount;
    }
}
 class Program4{
    public static void main(String args[]){
        ElectricityBill bill = new ElectricityBill();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        bill.setCustomerName(sc.nextLine());
        System.out.print("Enter units : ");
        bill.setUnitsConsumed(sc.nextDouble());
        bill.calculateBillAmount(bill.getUnitsConsumed());    
        System.out.println("Customer Name = " + bill.getCustomerName() + 
        ", Units Consumed " + bill.getUnitsConsumed() + " , Total Bill Amount" + bill.billAmount);
    }
}
