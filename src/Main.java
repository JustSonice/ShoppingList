import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> shoppingCart = new ArrayList<>();
        while (true) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("""
                    Выберите операцию:
                    1. Добавить
                    2. Показать
                    3. Удалить""");
            int choose1 = scanner1.nextInt();
            if (choose1 == 1) {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Какую покупку хотите добавить?");
                String choose2 = scanner2.nextLine();
                shoppingCart.add(choose2);
                System.out.println("Итого в списке покупок:" + shoppingCart.size());
            } else if (choose1 == 2) {
                System.out.println("Список покупок:\n " + shoppingCart);
            } else {
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Список покупок:\n " + shoppingCart + "\n Какую хотите удалить? Введите номер или название");
                int choose3 = scanner3.nextInt();
                shoppingCart.remove(choose3);
                System.out.println("Покупка " + shoppingCart.get(choose3) + "удалена, список покупок:" + shoppingCart);
            }
        }
    }
}