import java.util.ArrayList;
import java.util.List;
public class Demo019 {
    public static List<Integer> getFibonacciSeries(int n) {
        if (n <= 0) {
            List<Integer> result = new ArrayList<>();
            result.add(0);
            return result;
        }
        List<Integer> fibonacciList = new ArrayList<>();
        int a = 0, b = 1; 
        fibonacciList.add(a); 
        if (n > 1) {
            fibonacciList.add(b); 
        }
        for (int i = 2; i < n; i++) {
            int next = a + b; 
            fibonacciList.add(next);
            a = b; 
            b = next;
        }
        return fibonacciList;
    }
    public static void main(String[] args) {
        int input = 7;
        List<Integer> result = getFibonacciSeries(input);
        System.out.println(result.toString().replaceAll("[\\[\\]]", ""));
    }
}

