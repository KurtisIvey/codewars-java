public class TransportationOnVacation {
    public static int rentalCarCost(int d) {
        // set initial cost var to days * 40;
        int cost = d * 40;
        if(d >= 7) {
            // if greater or equal to 7, subtract 50 dol discount
            cost -=50;
        }else if (d >= 3 ) {
            // if less than 7 but greater than or eq to 3, subtract 20 dol discount
            cost -= 20;
        }
        return cost;
    }
}
