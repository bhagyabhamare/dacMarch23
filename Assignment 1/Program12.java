class Program12{
    public static void main(String args[]){ 
       
        int b = 2570;
        Integer i = new  Integer(b);//instance of b
        System.out.println("Integer Instance : "+ i);
        //int instance into byte
        Integer s1 = new Integer("2570");
        byte e = s1.byteValue();
        System.out.println("Byte : " + e);

        //int instance into short
        Integer s2 = new Integer("2570");
        short s3 = s2.shortValue();
        System.out.println("short : " + s3);

        //int instance into int
        int j = (int) i;
        System.out.println("int : " + j);

        //int instance into long
        long l = (long) i;
        System.out.println("long : " + l);

        //int instance into float
        float f =  i;
        System.out.println("float : " + f);

        //int instance into double
        double d =  i;
        System.out.println("double : " + d);
   
}
}