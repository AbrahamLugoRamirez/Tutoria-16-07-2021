import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);

        int cant = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cant; i++) {            
            System.out.println("Ingrese datos");
            String datos = sc.nextLine();
            String vector[] = datos.split(" ");
            
            for (int j = 0; j < vector.length; j++) {
                System.out.println(vector[j]);
                
            }

        }




    }
}
