public class GrowthOfAPopulation {
    public static int nbYear(int p0, double percent, int aug, int p) {
        // your code
        int years = 0;
        int population = p0;
        while (population < p) {
            population = population + (int)(population * (percent / 100));
            population += aug;
            years++;
        }
        return years;

    }
}
