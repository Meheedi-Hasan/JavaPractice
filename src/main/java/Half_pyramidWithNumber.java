public class Half_pyramidWithNumber {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++) {
            //First pyramid
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
