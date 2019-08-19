package rentalstore;

public abstract class AbstractStatement {
    public abstract String getHeader(String name);

    public abstract String getBody(Rental rental);

    public abstract String getFooter(double totalAmount, int frequentRenterPoints);

    public String getStatement(Customer customer) {
        StringBuilder result = new StringBuilder(getHeader(customer.getName()));
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        for (Rental rental : customer.getRentals()) {
            frequentRenterPoints = rental.getFrequentRenterPoints(frequentRenterPoints);
            result.append(getBody(rental));
            totalAmount += rental.getThisAmount();
        }
        result.append(getFooter(totalAmount, frequentRenterPoints));
        return result.toString();
    }

}
