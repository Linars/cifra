import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    static void solveTask2() throws IOException {
        ArrayList<Integer> array = new ArrayList<>();
        String text;
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        BufferedReader in = new BufferedReader(new FileReader(file));
        while ((text = in.readLine()) != null) {
                array.add(Integer.parseInt(text));
        }
        double average = 0;
        for (int item: array){
            average += item;
        }
        average /= array.size();
        int intAver = (int) average;
        if (average - (int) average > 0.5){
            intAver += 1;
        }
        int count = 0;
        for (int item: array){
            if (item > intAver){
                count += item - intAver;
            } else {
                count += intAver - item;
            }
        }
        System.out.println(count);
    }
}
