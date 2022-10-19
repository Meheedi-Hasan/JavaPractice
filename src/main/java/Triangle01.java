public class Triangle01 {
    public static void main(String[] args) {
        int n = 5;
        int num1=1;
        int num2=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i%2==1 && j%2==1){
                    System.out.print(num1);
                }else if(i%2==1 && j%2==0){
                    System.out.print(num2);
                }
                if(i%2==0 && j%2==1){
                    System.out.print(num2);

                }else if(i%2==0 && j%2==0){
                    System.out.print(num1);
                }
            }
            System.out.println();
        }
        //TriangleWith01();
    }

    public static void TriangleWith01(){
        int n =5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++) {
                int sum = i + j;
                if (sum % 2 == 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}

