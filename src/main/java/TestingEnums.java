import java.util.Optional;

public class TestingEnums {

    public static void main(String[] args) {

        System.out.println(DaysOfWeek.SUNDAY);
        System.out.println(getMeDay().get());

    }

    public static Optional<Enum.EnumDesc<DaysOfWeek>> getMeDay() {
        // DaysOfWeek.
        return DaysOfWeek.SUNDAY.describeConstable();
    }
}

enum DaysOfWeek {
    SUNDAY(1, "Movies"), MONDAY(2, "Read"), TUESDAY(3, "Play");

    int number;
    String work;

    DaysOfWeek(int number, String work) {
        this.number = number;
        this.work = work;
    }

}


