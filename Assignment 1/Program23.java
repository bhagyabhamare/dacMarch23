class Program23{
    public static void main(String args[])
    {
        //double value into String
        double s = 4500023.8907d;
        String str=Double .toString(s);
        System.out.println("String = "+str);
        //double value into Double  instance.
        double s1=Double.valueOf(s);
        System.out.println("Double  instance = "+s1);
        //double instance into Long instance.
        String str1 = new String(str);
        System.out.println("String instance = "+str1);
        double s2 = Double .valueOf(str1);
        double s3 = Double .valueOf(s2);
        System.out.println("Double  instance = "+s3);
        //double value into binary, octal and hexadecimal string
        String hx = Double.toHexString(s3);
        System.out.println("Hexadecimal String = "+hx);


    }
}