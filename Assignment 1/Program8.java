class Program8{
    public static void main(String args[])
    {
        //short value into String
        short s = 45;
        String str=Short.toString(s);
        System.out.println("String = "+str);
        //short value into Short instance.
        short s1=Short.valueOf(s);
        System.out.println("Short instance = "+s1);
        //String instance into Short instance.
        String str1 = new String(str);
        System.out.println("String instance = "+str1);
        short s2 = Short.valueOf(str1);
        short s3 = Short.valueOf(s2);
        System.out.println("Short instance = "+s3);

        //String instance into Short instance.
        String value1 = "123";
        String aab = new String(value1);     
        Short ab = new Short(aab); 
        System.out.println(ab); 



    }
}