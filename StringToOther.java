public class StringToOther {
    public static void main(String[] args) {
        String str1 = "True";

        boolean bol = Boolean.parseBoolean(str1);
        System.out.println("Boolean result is : "+bol);

        String str2 = "500";
        int num1 = 300;
        int num2 = Integer.parseInt(str2);
        int add = num1+num2;
        System.out.println("Integer result is : "+add);

        String str3 = "301.92";
        double dob  =45.78;
        double dob1 = Double.parseDouble(str3);
        double add2 = dob + dob1;
        System.out.println("Double result is : "+add2);
    }
}