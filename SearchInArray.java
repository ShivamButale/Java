import java.util.Arrays;

class SearchInArray {
    public static void main(String[] args) {
        int x[] = {2, 6, 7, 9, 1, 8, 4};
        int index = Arrays.binarySearch(x, 7);
        System.out.println("Index = "+ index);       
    }
}