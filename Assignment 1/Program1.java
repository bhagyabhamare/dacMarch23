class Program1{
    public static void main(String[] args)
    {   //boolean to string
        boolean b = true;
        String str = Boolean.toString(b);
        System.out.println("String : " +str);

        //Boolean to boolean instance(Creating an instance)
        boolean b1 = true;
        boolean a = Boolean.valueOf(b1);//valueOf is a inbuilt method for creating instance
        Boolean i = new Boolean(b1);//we can also create instance by new classname();
        System.out.println("boolean i : "+ i);
       
        //string to boolean
        String str1 = "true";
        boolean d = Boolean.parseBoolean(str1);
        System.out.println("Boolean :" + d);

    }
}