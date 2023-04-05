class Program21{
    public static void main(String args[]){
        float i = 2090.56f;
        float j = 3026.78f;
        float max_value = Float.max( i , j );
        System.out.println("Greater no :" + max_value );
        float min_value = Float.min( i , j );
        System.out.println("Smaller no :" + min_value);
        float sum = Float.sum( i , j);
        System.out.println("Sum :" + sum);


    }
}