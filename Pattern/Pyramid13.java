class Pyramid13{
      public static void main(String args[])
	  {
	     for(int i=1;i<=6;i++)
		  { for(int k=6;k>=i;k--)
			  {System.out.print(" ");}
	       
		    for(int j=1;j<=i;j++)
		     { if(i!=6)
			   {if((j==1)||(j==i))
			      {System.out.print("* ");}
				 else
				 {System.out.print("  ");}
				}
				else
				{System.out.print("* ");}
			  }
			System.out.println();
		}
	}
}
			
		   