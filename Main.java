import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){

            l.add(sc.nextInt());

        }
        for(int i :l){
            System.out.println(i);
        }

    }
}
