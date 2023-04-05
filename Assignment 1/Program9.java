class Program9{
    public static void main(String args[]){ 
       
        short b = 257;
        Short c = new Short(b);//instance of b
        System.out.println("Short Instance : "+ c);
        //short instance into byte
        Short s1 = new Short("257");
        byte e = s1.byteValue();
        System.out.println("Byte : " + e);

        //short instance into short
        short s2 = (short) c;
        System.out.println("short : " + s2);

        //short instance into int
        int i = (int) c;
        System.out.println("int : " + i);

        //short instance into long
        long l = (long) c;
        System.out.println("long : " + l);

        //short instance into float
        float f =  c;
        System.out.println("float : " + f);

        //short instance into double
        double d =  c;
        System.out.println("double : " + d);
   
}
}