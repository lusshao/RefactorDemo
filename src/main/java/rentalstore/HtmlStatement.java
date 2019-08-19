package rentalstore;


public class HtmlStatement extends AbstractStatement {
    @Override
    public String getHeader(String name) {
        return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
    }

    @Override
    public String getBody(Rental rental) {
        return rental.getMovie().getTitle() + ": " + String.valueOf(rental.getThisAmount()) + "<BR>\n";
    }

    @Override
    public String getFooter(double totalAmount, int frequentRenterPoints) {
        String result = "<P>You owe<EM>" + String.valueOf(totalAmount) + "</EM><P>\n";
        result += "On this rental you earned <EM>" + String.valueOf(frequentRenterPoints) + "</EM> frequent renter points<P>";
        return result;
    }
}
