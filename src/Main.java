public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(AreaCalculator.area(5.0));
        MinutesToYearsAndDays.printYearsAndDays(525600);
        MinutesToYearsAndDays.printYearsAndDays(1051200);
        MinutesToYearsAndDays.printYearsAndDays(561600);

        EqualityPrinter.printEqual(0, 1, 2);
        System.out.println(PlayingCat.isCatPlaying(true, 10));
        System.out.println(PlayingCat.isCatPlaying(false, 35));
    }
}