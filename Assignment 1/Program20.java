class Program20{
    public static void main(String args[]){ 
       
        float b = 2570.35f;
        Float i = new  Float(b);//instance of b
        System.out.println("Float Instance : "+ i);
        //float instance into byte
        Float s1 = new Float("2570.35");
        byte e = s1.byteValue();
        System.out.println("Byte : " + e);

        //float instance into short
        Float s2 = new Float("2570.35");
        short s3 = s2.shortValue();
        System.out.println("short : " + s3);

        //float instance into int
        Float j1 = new Float("2570.35");
        int j = j1.intValue();
        System.out.println("int : " + j);

        //float instance into long
        Float l1 = new Float("2570.35");
        long l = l1.longValue();
        System.out.println("long : " + l);

        //float instance into float
        float f =  i;
        System.out.println("float : " + f);

        //float instance into double
        double d =  i;
        System.out.println("double : " + d);
   
}
}