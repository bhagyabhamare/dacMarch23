class Pyramid4{
    public static void main(String args[])
	{
	   for(int i=1;i<=9;i++)
	    { 
		  for(int k=8;k>=i;k--)
		    {
			  System.out.print("  ");
			  }
			  
		  for(int j=1;j<=i;j++)
		    {
			  System.out.print(j + " ");
			  }
		 
		  for(int j1=i-1;j1>=1;j1--)
		    {
			  System.out.print(j1 + " ");
			  }
		  
		  
		  System.out.println();
		 }
	}
}