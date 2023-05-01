import java.util.*;

/**
 * Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
 * и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - бренд
 * 2 -цвет
 * Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 * СПОЙЛЕР:
 * 1) создаете класс ноутбук (equals, hashCode)
 * 2) создаете сет ноутбука
 * 3) создаете и заполняете Map<Integer, Laptop>
 * 4) запрашиваете через сканнер у пользователя критерий фильтрации
 * 5) циклом проходите по Map.Entry<Integer, Laptop> entry: entries
 * 6) В результирующий Set<Laptop> складываете ноутбуки entry.getValue() у которых
 * равны критерию пользователя
 */

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("ASUS", "X415EA", "black", 46000, true);
        Laptop laptop2 = new Laptop("SAMSUNG", "A416EA", "white", 40000, true);
        Laptop laptop3 = new Laptop("ACER", "A515", "black", 52000, false);
        Laptop laptop4 = new Laptop("LENOVO", "IdeaPad 3", "grey", 35000, true);
        Laptop laptop5 = new Laptop("MACBOOK", "PRO A2338", "grey", 160000, true);

        Map<Integer, Laptop> laptopMap = new HashMap<>();
        laptopMap.put(1, laptop1);
        laptopMap.put(2, laptop2);
        laptopMap.put(3, laptop3);
        laptopMap.put(4, laptop4);
        laptopMap.put(5, laptop5);

        Set<Laptop> sortList1 = new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите критерий фильтации для выбора ноутбука (производитель): ");
        String filter1 = scanner.next();
        if(filter1.equalsIgnoreCase("acer")) {
            for(Map.Entry<Integer, Laptop> entry : laptopMap.entrySet()) {
                sortList1.add(entry.getValue());
            }
        }
        System.out.println(sortList1);

        Set<Laptop> sortList2 = new HashSet<>();

        System.out.println("Введите критерий фильтации для выбора ноутбука (цвет): ");
        String filter2 = scanner.next();
        if(filter2.equalsIgnoreCase("grey")) {
            for(Map.Entry<Integer, Laptop> entry : laptopMap.entrySet()) {
                sortList2.add(entry.getValue());
            }
        }
        System.out.println(sortList2);

        Set<Laptop> sortList3 = new HashSet<>();

        System.out.println("Введите критерий фильтации для выбора ноутбука (наличие): ");
        String filter3 = scanner.next();
        if(Objects.equals(filter3, "true")) {
            for(Map.Entry<Integer, Laptop> entry : laptopMap.entrySet()) {
                sortList3.add(entry.getValue());
            }
        }
        System.out.println(sortList3);

    }

}