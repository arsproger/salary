import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HourSalary employee1 = new HourSalary("Bob", "Alishev", 18, "Backend dev", "Apple", 10);
        HourSalary employee2 = new HourSalary("John", "None", 28, "Frontend dev", "Google", 30);
        try {
            FileWriter fileWriter = new FileWriter("file", true);
            fileWriter.write(employee1.getName() + ": " + employee1.getSalary() + "\n");
            fileWriter.write(employee2.getName() + ": " + employee2.getSalary());
            System.out.println("Успешная запись!");
            fileWriter.close();
        } catch (IOException exception) {
            System.out.println("Error");
        }

        try {
            FileReader fileReader = new FileReader("file");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException exception) {
            System.out.println("Error");
        }
    }
}