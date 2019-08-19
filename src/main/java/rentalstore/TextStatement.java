package rentalstore;

public class TextStatement extends AbstractStatement {
    @Override
    public String getHeader(String name) {
        return "Rental Record for " + name + "\n";
    }

    @Override
    public String getBody(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getThisAmount()) + "\n";
    }

    @Override
    public String getFooter(double totalAmount, int frequentRenterPoints) {
        String result = "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }
}
