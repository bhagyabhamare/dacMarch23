class Program19{
    public static void main(String args[])
    {
        //float value into String
        float s = 450.89f;
        String str= Float.toString(s);
        System.out.println("String = "+str);
        //float value into Float instance.
        float s1=Float.valueOf(s);
        System.out.println("Float instance = "+s1);
        //float instance into Float instance.
        String str1 = new String(str);
        System.out.println("String instance = "+str1);
        float s2 = Float.valueOf(str1);
        float s3 = Float.valueOf(s2);
        System.out.println("Float instance = "+s3);
        //float value into hexadecimal string
        String hx = Float.toHexString(s3);
        System.out.println("Hexadecimal String = "+hx);


    }
}