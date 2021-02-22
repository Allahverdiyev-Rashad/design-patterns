package behaviouralpatterns.strategy;

public class App {

    public static void main(String[] args) {

        System.out.println("----------------");
        printPriority(EnumSection.NUMERAL);
        System.out.println("----------------");
        printPriority(EnumSection.VERBAL);
        System.out.println("----------------");
        printPriority(EnumSection.AVERAGE);

    }

    private static void printPriority(EnumSection section) {
        Student numeralStudent = new Student(section);
        String priority = numeralStudent.getPriority();
        System.out.println(priority);
    }
}
