import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(new Worker("James", "Brown", "000001", "Mr.", 1982, 22.0));
        workers.add(new Worker("Penelope", "Doe", "000002", "Mrs.", 1988, 26.0));
        workers.add(new Worker("Alex", "Johnson", "000003", "Mr.", 1995, 31.0));
        workers.add(new SalaryWorker("Makayla", "Lee", "000004", "Ms.", 1993, 16.0, 40000));
        workers.add(new SalaryWorker("Quentin", "Williams", "000005", "Mr.", 1987, 20.0, 60000));
        workers.add(new SalaryWorker("Karen", "James", "000006", "Dr.", 1994, 35.0, 100000));

        int[] weeklyHours = {40, 50, 40};

        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Pay:");
            for (Worker worker : workers) {
                double hoursWorked = weeklyHours[week - 1];
                System.out.println(worker.formalName() + ": " + worker.displayWeeklyPay(hoursWorked));
            }
            System.out.println();
        }
    }
}