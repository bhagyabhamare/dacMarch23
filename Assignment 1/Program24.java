class Program24{
    public static void main(String args[]){ 
       
        double b = 257044.35;
        Double i = new  Double(b);//instance of b
        System.out.println("Double Instance : "+ i);
        //double instance into byte
        Double s1 = new Double("257044.35");
        byte e = s1.byteValue();
        System.out.println("Byte : " + e);

        //double instance into short
        Double s2 = new Double("257044.35");
        short s3 = s2.shortValue();
        System.out.println("short : " + s3);

        //double instance into int
        Double j1 = new Double("257044.35");
        int j = j1.intValue();
        System.out.println("int : " + j);

        //double instance into long
        Double l1 = new Double("257044.35");
        long l = l1.longValue();
        System.out.println("long : " + l);

        //double instance into float
        Double f1 = new Double("257044.35");
        float f =  f1.floatValue();
        System.out.println("float : " + f);

        //double instance into double
        double d =  i;
        System.out.println("double : " + d);
   
}
}