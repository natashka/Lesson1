
/**
 * Напишите функцию printHello(), печатающую на стандартный поток вывода приветствие,
 * и возвращающую void. Присвойте локальной переменной ссылку на эту функцию.
 */
public class Task2 {
    @FunctionalInterface
    public interface Hello {
        abstract void printHello();

    }
    //Hello h = ()-> System.out.println("Hello")
}
