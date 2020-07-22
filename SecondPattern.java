class SecondPattern {
    public static void main(String args[]) {
        int x, y, z;
        for(x=1;x<7;x++) {
            for(y=7;y>x;y--){
                System.out.print(" ");
            }
            for(z=1;z<=x;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}