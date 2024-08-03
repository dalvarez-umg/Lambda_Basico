import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("David", "Juan", "José");

        // Usando lambda para imprimir cada nombre
        names.forEach(name -> System.out.println(name));
    }
}