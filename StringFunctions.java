public class StringFunctions {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello   World";
        String str4 = new String("Welcome");

        System.out.println("str1 is : "+str1);
        System.out.println("str2 is : "+str2);
        System.out.println("str3 is : "+str3);
        System.out.println("str4 is : "+str4);

        System.out.println("str1 in lowercase is : "+str1.toLowerCase());
        System.out.println("str3 in uppercase is : "+str3.toUpperCase());
        System.out.println("str1 after replacing values is : "+str1.replace("l", "p"));
        System.out.println("str1 length is : "+str1.length());



    }
}