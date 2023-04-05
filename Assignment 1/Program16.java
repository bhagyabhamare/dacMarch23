class Program16{
    public static void main(String args[]){ 
       
        long b = 257000;
        Long i = new  Long(b);//instance of b
        System.out.println("Long Instance : "+ i);
        //long instance into byte
        Long s1 = new Long("257000");
        byte e = s1.byteValue();
        System.out.println("Byte : " + e);

        //long instance into short
        Long s2 = new Long(b);
        short s3 = s2.shortValue();
        System.out.println("short : " + s3);

        //long instance into int
        Long j1 = new Long("257000");
        int j = s1.intValue();
        System.out.println("int : " + j);

        //long instance into long
        long l = (long) i;
        System.out.println("long : " + l);

        //long instance into float
        float f =  i;
        System.out.println("float : " + f);

        //long instance into double
        double d =  i;
        System.out.println("double : " + d);
   
}
}