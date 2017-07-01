package less11;

public class SeasonEnumDemo {
    public static void main(String[] args) {
        for (SeasonEnum s : SeasonEnum.values()) {
            System.out.println(s + " " + s.getT());
            printInfo(s);
        }

        System.out.print("\nЛюбимое время года: ");
        printInfo(SeasonEnum.valueOf("AUTUMN"));
    }

    public static void printInfo(SeasonEnum season) {
        season.getDescription();
    }
}
