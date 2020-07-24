public class StringToChar {
    public static void main(String[] args) {
        String helloStr = "This is Original String Object";
        char[] StrArray;
        StrArray = helloStr.toCharArray();
        System.out.println("Result : ");
        for(int x=0; x<StrArray.length; x++) {
            System.out.print(StrArray[x]);
        }
        System.out.println();
    }
}