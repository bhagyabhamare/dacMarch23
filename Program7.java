import java.util.Scanner;
class Vehicle {
	String vehicleType;
	int numAxles;
	double distanceTraveled;
	private double tollFee;
	private double totalAmountDue;
    public String getVehicleType() {
		return this.vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getNumAxles() {
		return this.numAxles;
	}
	public void setNumAxles(int numAxles) {
		this.numAxles = numAxles;
	}
	public double getDistanceTraveled() {
		return this.distanceTraveled;
	}
	public void setDistanceTraveled(double distanceTraveled) {
		this.distanceTraveled = distanceTraveled;
	}
	public double getTollFee() {
		return this.tollFee;
	}
	public void setTollFee(double tollFee) {
		this.tollFee = tollFee;
	}
	public double getTotalAmountDue() {
		return this.totalAmountDue;
	}
	public void setTotalAmountDue(double totalAmountDue) {
		this.totalAmountDue = totalAmountDue;
	}
	
}
class VehicleTest{
    Scanner sc=new Scanner(System.in);
	Vehicle v=new Vehicle();
    void calculateTollFee() 
	{	String veh=v.getVehicleType();
		//System.out.print(veh);
		System.out.print(v.getVehicleType());
		if(veh==null)
		{
			System.out.println("Enter the details first.");
		}
		else
		{if(veh.equals("car")||veh.equals("van")||veh.equals("bus"))
		{
			double t=0.25*v.getDistanceTraveled()*v.getNumAxles();
			v.setTollFee(t);
			System.out.println("Total toll fee is $"+v.getTollFee());
		}
		else if(v.getVehicleType().equals("truck"))
		{
			double t=0.50*v.getDistanceTraveled()*v.getNumAxles();
			v.setTollFee(t);
			System.out.println("Total toll fee is $-"+v.getTollFee());
		}
		}
	}
     void generateBill(){       
		    double t1=v.getTollFee();
		    double t=t1+2; 
		    v.setTotalAmountDue(t);
			System.out.println("Vehicle type="+v.getVehicleType());
			System.out.println("Number of axles="+v.getNumAxles());
			System.out.println("Distance travelled="+v.getDistanceTraveled()+" miles");
			System.out.println("toll fee="+v.getTollFee()+"$");
			System.out.println("processing fee=2$");
			System.err.println("Total due amount is $"+v.getTotalAmountDue()+"$");
		}
    public int showMenu()
	{       System.out.println("1.Enter vehicle type (car, van, bus, or truck)");
			System.out.println("2.Enter number of axles");
            System.out.println("3.Enter distance travelled");
            System.out.println("4.Calculate toll fee");
            System.out.println("5.Generate bill");
            System.out.println("6.Exit");
			System.out.print("Enter choice : ");
			return sc.nextInt();
		}
}
public class Program7{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vehicle v = new Vehicle();
		VehicleTest test = v;
		//VehicleTest test = new VehicleTest();
		int i;
		while(( i = test.showMenu())<6) {
		switch(i){
			case 1:test.v.setVehicleType(sc.nextLine());
			       System.out.println(test.v.getVehicleType()); break;
		    case 2:test.v.setNumAxles(sc.nextInt());
			       System.out.println(test.v.getNumAxles());break;
		    case 3:test.v.setDistanceTraveled(sc.nextDouble());
			       System.out.println(test.v.getDistanceTraveled());break;
		    case 4:test.calculateTollFee();break;
		    case 5:test.generateBill();break;
		   } 		
		}
	}		
}