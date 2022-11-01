public class RecursionSum {
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
    }
    public static int sum(int start, int end){
        if (end > start) {
            int add = /*end +*/ sum(start, end - 1); //sum = 10 + 1
            System.out.println("add - "+add);
            return add;
        } else {
            return 4;
        }
    }
}
