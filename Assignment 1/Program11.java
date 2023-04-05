class Program11{
    public static void main(String args[])
    {
        //int value into String
        int s = 450;
        String str=Integer.toString(s);
        System.out.println("String = "+str);
        //int value into Integer instance.
        int s1=Integer.valueOf(s);
        System.out.println("Integer instance = "+s1);
        //String instance into Integer instance.
        String str1 = new String(str);
        System.out.println("String instance = "+str1);
        int s2 = Integer.valueOf(str1);
        int s3 = Integer.valueOf(s2);
        System.out.println("Integer instance = "+s3);
        //int value into binary, octal and hexadecimal string
         String bi = Integer.toBinaryString(450);
          System.out.println("Binary string = "+bi);
         String oc = Integer.toOctalString(s3);
          System.out.println("OctalString = "+oc);
         String hx = Integer.toHexString(s3);
          System.out.println("Hexadecimal String = "+hx);




    }
}