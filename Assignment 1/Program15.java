class Program15{
    public static void main(String args[])
    {
        //long value into String
        long s = 4500023l;
        String str=Long.toString(s);
        System.out.println("String = "+str);
        //long value into Long instance.
        long s1=Long.valueOf(s);
        System.out.println("Long instance = "+s1);
        //String instance into Long instance.
        String str1 = new String(str);
        System.out.println("String instance = "+str1);
        long s2 = Long.valueOf(str1);
        long s3 = Long.valueOf(s2);
        System.out.println("Long instance = "+s3);
        //long value into binary, octal and hexadecimal string
        String bi = Long.toBinaryString(450);
        System.out.println("Binary string = "+bi);
        String oc = Long.toOctalString(s3);
        System.out.println("OctalString = "+oc);
        String hx = Long.toHexString(s3);
        System.out.println("Hexadecimal String = "+hx);


    }
}