class LongestSubstring {
    public static void main(String[] args) {
        System.out.println("Longest Substring of Hello World is "+LongestStr("Hello World"));        
    }

    private static String LongestStr(String str) {
        String str1 = "";
        String str2="";
        for(int x=0; x<str.length(); x++) {
            char ch = str.charAt(x);
            if(str1.indexOf(ch) == -1) {
                str1 += ch;
                continue;
            }
            else 
            {
                if(str1.length() > str2.length()) {
                    str2 = str1;
                    
                }
                str1 = str1.substring(str1.indexOf(ch) +1)+ch;
            }
        }
        if(str1.length() > str2.length()) {
            str2 = str1;
        }
        
        return str2;
    }
}