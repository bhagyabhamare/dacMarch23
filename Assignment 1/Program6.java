class Program6{
    public static void main(String args[]){
        String str =args[0];
        char ch = str.charAt(0);
        System.out.println(ch);
        boolean b = true;
       if(b = Character.isletter(ch)){
           System.out.println(ch + "character is a letter");
           
           if(b = Character.isLowerCase(ch)){
              char s = Character.toUpperCase(ch);
              int codePoint = (int)s;
              System.out.println("Upper case" + s);
              System.out.println("Codepoint" +codePoint);}
            else {
              char s = Character.toLowerCase(ch);
              int codePoint = (int)s;
              System.out.println("Lower case" + s);
              System.out.println("Codepoint" +codePoint);
            }
           }
         else if(b = Character.isDigit(ch))
             {
                System.out.println(ch + "character is a digit");
                int codePoint = (int)ch;
                System.out.println("Codepoint" +codePoint);
            }
        
    }
}