class Program3{
    public static void main(String args[])
    {   // byte value into String
        byte a = 10;
        String strbyte = Byte.toString(a);
        System.out.println("String : "+ strbyte);

       // byte value into Byte instance
       //valueOf is method to create instance
       byte b = 40;
       byte c = Byte.valueOf(b);
       System.out.println("Byte : "+ c);

       //String instance into Byte instance
       String str = "34";
       String str1 = new String(str);
       System.out.println("String : "+ str1);
       //byte d = Byte.valueOf(str);
       //System.out.println("Byte : "+ d); give no format exception
       byte e = Byte.valueOf(str1);
       System.out.println("Byte : "+ e);
       byte i = Byte.valueOf(e);
       System.out.println("Byte : "+ i);
    }
}