class PatternF{
    public static void main(String args[])
	{ for(int i=1;i<=5;i++)
	   { 
	     for(int k=1;k<i;k++)
		 {
		   System.out.print(" ");
		 }
		 
	     for(int j=5;j>=i;j--)
		 {
		   System.out.print("*");
		 }
		 for(int j1=5;j1>i;j1--)
		 {
		   System.out.print("*");
		 }
		System.out.println();
	  }
	}
}