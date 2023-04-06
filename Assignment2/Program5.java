import java.util.Scanner;
class TelephoneBill{
    String customer_name ;
    int phone_number;
    int no_of_calls_made;
    int duration_of_calls;
    double bill;

TelephoneBill(){
    this("bhagyashree" , 915862 , 150 , 150);
}
TelephoneBill( String customer_name,int phone_number,int no_of_calls_made,int duration_of_calls){
    this.customer_name = customer_name;
    this.phone_number = phone_number;
    this.no_of_calls_made = no_of_calls_made;
    this.duration_of_calls = duration_of_calls;
}
public void setCustomerName(String customer_name){
    this.customer_name = customer_name;
}
public String getCustomerName(){
    return customer_name;
}
public void setPhoneNumber(int phone_number){
    this.phone_number = phone_number;
}
public int getPhoneNumber(){
    return phone_number;
}
public void setNoOfCallsMade(int no_of_calls_made){
    this.no_of_calls_made = no_of_calls_made;
}
public int getNoOfCallsMade(){
    return no_of_calls_made;
}
public void setDurationOfCalls(int duration_of_calls){
    this.duration_of_calls = duration_of_calls;
}
public int getDurationOfCalls(){
    return duration_of_calls;
}
public double calculateBill(int no_of_calls_made){
    if(no_of_calls_made>0)
    {
        if(no_of_calls_made<100){
             bill = (no_of_calls_made * 50) - 10;
        }
        else
           {
             bill = (no_of_calls_made * 25) - 10;
           }       
    }
    else
      {System.out.println("Enter postive no of calls");} 
    return bill;
  }
public void acceptRecord(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        setCustomerName(sc.nextLine());
        System.out.println("Enter phone no : ");
        setPhoneNumber(sc.nextInt());
        System.out.println("Enter no of calls made : ");
        setNoOfCallsMade(sc.nextInt());
        System.out.println("Enter duration of call : ");
        setDurationOfCalls(sc.nextInt());
}
public void printRecord(){
        System.out.print("Telephone bill is : " + bill);
}
}
class Program5{
    public static void main(String[]args){
        TelephoneBill tp = new TelephoneBill();
        tp.acceptRecord();
        tp.calculateBill(tp.no_of_calls_made);
        tp.printRecord();
    }
}