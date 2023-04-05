class Program4{
    public static void main(String args[]){ 
       //widening
        byte b = 30;
        Byte c = new Byte(b);//instance of b
        System.out.println("Byte Instance : "+ c);
        //byte instance into byte
        byte e = (byte)c;
        System.out.println("Byte : " + e);

        //byte instance into short
        short s1 = (short) c;
        System.out.println("short : " + s1);

        //byte instance into int
        int i = (int) c;
        System.out.println("int : " + i);

        //byte instance into long
        long l = (long) c;
        System.out.println("long : " + l);

        //byte instance into float
        float f =  c;//without explicit type casting
        System.out.println("float : " + f);

        //byte instance into double
        double d =  c;
        System.out.println("double : " + d);
   
}
}