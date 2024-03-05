import java.util.ArrayList;
import java.util.List;

public class Exercise2 {

    public static void main(String[] args) {


        int input = 35;

        List<Integer> list = fibonacci(input);

        if (list.contains(input)) {
            System.out.println("O número " + input + " pertence a cadeia de fibonacci");
        }else{
            System.out.println("O número " + input + " não pertence a cadeia de fibonacci");
        }

    }

    public static List<Integer> fibonacci(int num) {
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(0);
        numbersList.add(1);
        numbersList.add(1);

        if (num == 1 || num == 0) {
            return numbersList;
        }


        for (int i = 3; i <= num; i++) {
            numbersList.add(numbersList.get(i - 1) + numbersList.get(i - 2));
        }

        return numbersList;
    }

}
