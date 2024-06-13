import java.util.ArrayList;
import java.util.List;

public class ListExample01 {
    public static void main(String[] args) {
        // Criando uma List
        List<String> cars = new ArrayList<>();

        // Adicionando elementos na lista
        cars.add("Ferrari"); // Primeiro elemento (0)
        cars.add("BMW"); // Segundo elemento (1)
        cars.add("Porshe"); // Terceiro elemento (2)
        cars.add("Lamborguini"); // Quarto elemento (3)

        // Recuperando os elementos
        System.out.println("Returning element: " + cars.get(0));

        // Alterando o elemento
        cars.set(1, "Honda");

        // Listando todos os elementos
        for(int i = 0; i < cars.size(); i++) {
            String car = cars.get(i);
            System.out.println(i + " car: " + car);
        }
    }
}