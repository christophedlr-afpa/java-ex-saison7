import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int option;
        Main m = new Main();

        System.out.println("1. 7.4");
        System.out.println("2. 7.7");
        System.out.print("Choisissez votre option : ");
        option = Integer.parseInt(m.reader.readLine());

        if (option == 1) {
            m.algo74();
        } else if (option == 2) {
            m.algo77();
        }
    }

    public void algo74() throws IOException {
        int val;
        List<Integer> array = new ArrayList<Integer>();

        array.add(12);
        array.add(8);
        array.add(4);
        array.add(45);
        array.add(64);
        array.add(9);
        array.add(2); 

        System.out.println("Le tableau : "+array);
        System.out.print("Choisissez une position dans le tableau : ");
        val = Integer.parseInt(reader.readLine());

        array.remove(val);

        System.out.println("Le nouveau tableau : "+array);
    }

    public void algo77() {
        int pos = 0;
        int temp = 0;
        List<Integer> arrayFirst = new ArrayList<Integer>();
        List<Integer> arraySecond = new ArrayList<Integer>();
        List<Integer> newArray = new ArrayList<Integer>();

        arrayFirst.add(10);
        arrayFirst.add(42);
        arrayFirst.add(84);

        arraySecond.add(2);
        arraySecond.add(34);
        arraySecond.add(110);

        System.out.println("Le premier tableau est : "+arrayFirst);
        System.out.println("Le second tableau est : "+arraySecond);

        for (int i = 0; i < arrayFirst.size(); i++) {
            newArray.add(arrayFirst.get(i));
        }

        for (int j = 0; j < arraySecond.size(); j++) {
            newArray.add(arraySecond.get(j));
        }

        for (int i = 0; i < newArray.size(); i++) {
            for (int j = i; j < newArray.size(); j++) {
                if (newArray.get(j) < newArray.get(i)) {
                    pos = j;
                    temp = newArray.get(pos);
                    newArray.set(pos, newArray.get(i));
                    newArray.set(i, temp);
                }
            }
        }

        System.out.println("Le troisième tableau est : "+newArray);
    }
}
