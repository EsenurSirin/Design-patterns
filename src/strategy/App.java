package strategy;

public class App {

    public static void main(String[] args) {

        System.out.println("----------------------");
        printInOrder(EnumEpisode.SWIMMER);

        System.out.println("----------------------");
        printInOrder(EnumEpisode.RUNNER);

        System.out.println("----------------------");
        printInOrder(EnumEpisode.FITNESSTRAINER);

        System.out.println("----------------------");
        printInOrder(EnumEpisode.PILATESINSTRUCTOR);
    }

    private static void printInOrder(EnumEpisode episode) {

        Student student = new Student(episode);
        String priorityOrder = student.getprintInOrder();
        System.out.println(priorityOrder);
    }
}
