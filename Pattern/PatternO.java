class PatternO{
     public static void main(String args[])
	 {
	   for(int i=1;i<=5;i++)
	     { 
		   for(int j=1;j<=i;j++)
		    {if(i!=5)
			   {if (j==1 || j==i)
			     {System.out.print("*");}
				else
				 {System.out.print(" ");}
				}
			 else
			  {System.out.print("*");}
			 }
			System.out.println();
		}
	}
}
			
			
			   