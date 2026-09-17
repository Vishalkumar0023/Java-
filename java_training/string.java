class String1{
    public static void main(String aargs[]){
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        System.out.println(str1 == str2); 
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));

    }
}