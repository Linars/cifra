import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    static void solveTask1(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int num = 1;
        ArrayList<Integer> newArray = new ArrayList<>();
        newArray.add(num);
        while (true){
            num = (num + m - 1) % n;
            if (newArray.contains(num)){
                break;
            } else {
                if (num == 0)
                    newArray.add(n);
                else
                    newArray.add(num);
            }
        }
        for (int item: newArray){
            System.out.print(item);
        }
        System.out.println();
    }
}
