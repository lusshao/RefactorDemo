package rentalstore;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void should_print_statement_when_invoke_statement_given_movie_type_is_NEW_RELEASE() {
        Movie movie2 = new NewReleaseMovie("速度与激情8");

        Rental rental2 = new Rental(movie2, 12);

        Customer customer = new Customer("Liam");

        customer.addRental(rental2);

        String statement = customer.statement();

        assertEquals("Rental Record for Liam\n" +
                "\t速度与激情8\t36.0\n" +
                "Amount owed is 36.0\n" +
                "You earned 2 frequent renter points", statement);
    }


    @Test
    public void should_print_statement_when_invoke_statement_given_movie_type_is_REGULAR_and_day_rented_lower_than_2() {
        Movie movie1 = new RegularMovie("午夜凶铃");

        Rental rental1 = new Rental(movie1, 1);

        Customer customer = new Customer("Liam");

        customer.addRental(rental1);

        String statement = customer.statement();

        assertEquals("Rental Record for Liam\n" +
                "\t午夜凶铃\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_print_statement_when_invoke_statement_given_movie_type_is_REGULAR_and_day_rented_higher_than_2() {
        Movie movie1 = new RegularMovie("午夜凶铃");

        Rental rental1 = new Rental(movie1, 5);

        Customer customer = new Customer("Liam");

        customer.addRental(rental1);

        String statement = customer.statement();

        assertEquals("Rental Record for Liam\n" +
                "\t午夜凶铃\t6.5\n" +
                "Amount owed is 6.5\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_print_statement_when_invoke_statement_given_movie_type_is_CHILDREDNS_and_day_rented_lower_than_3() {
        Movie movie3 = new ChildrenMovie("哪吒");

        Rental rental3 = new Rental(movie3, 1);

        Customer customer = new Customer("Liam");

        customer.addRental(rental3);

        String statement = customer.statement();

        assertEquals("Rental Record for Liam\n" +
                "\t哪吒\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_print_statement_when_invoke_statement_given_movie_type_is_CHILDREDNS_and_day_rented_higher_than_3() {
        Movie movie3 = new ChildrenMovie("哪吒");

        Rental rental3 = new Rental(movie3, 5);

        Customer customer = new Customer("Liam");

        customer.addRental(rental3);

        String statement = customer.statement();

        assertEquals("Rental Record for Liam\n" +
                "\t哪吒\t4.5\n" +
                "Amount owed is 4.5\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_print_statement_when_invoke_statement_given_movie_is_null() {
        Customer customer = new Customer("Liam");

        String statement = customer.statement();

        assertEquals("Rental Record for Liam\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points", statement);
    }

    @Test
    public void should_print_html_statement_when_invoke_html_statement_given_movie_type_is_NEW_RELEASE() {
        Movie movie2 = new NewReleaseMovie("速度与激情8");

        Rental rental2 = new Rental(movie2, 12);

        Customer customer = new Customer("Liam");

        customer.addRental(rental2);

        String statement = customer.htmlStatement();

        assertEquals("<H1>Rentals for <EM>Liam</EM></H1><P>\n" +
                "速度与激情8: 36.0<BR>\n" +
                "<P>You owe<EM>36.0</EM><P>\n" +
                "On this rental you earned <EM>2</EM> frequent renter points<P>", statement);
    }


    @Test
    public void should_print_html_statement_when_invoke_html_statement_given_movie_type_is_REGULAR_and_day_rented_lower_than_2() {
        Movie movie1 = new RegularMovie("午夜凶铃");

        Rental rental1 = new Rental(movie1, 1);

        Customer customer = new Customer("Liam");

        customer.addRental(rental1);

        String statement = customer.htmlStatement();

        assertEquals("<H1>Rentals for <EM>Liam</EM></H1><P>\n" +
                "午夜凶铃: 2.0<BR>\n" +
                "<P>You owe<EM>2.0</EM><P>\n" +
                "On this rental you earned <EM>1</EM> frequent renter points<P>",statement);

    }

    @Test
    public void should_print_html_statement_when_invoke_html_statement_given_movie_type_is_REGULAR_and_day_rented_higher_than_2() {
        Movie movie1 = new RegularMovie("午夜凶铃");

        Rental rental1 = new Rental(movie1, 5);

        Customer customer = new Customer("Liam");

        customer.addRental(rental1);

        String statement = customer.htmlStatement();

        assertEquals("<H1>Rentals for <EM>Liam</EM></H1><P>\n" +
                "午夜凶铃: 6.5<BR>\n" +
                "<P>You owe<EM>6.5</EM><P>\n" +
                "On this rental you earned <EM>1</EM> frequent renter points<P>", statement);
    }

    @Test
    public void should_print_html_statement_when_invoke_html_statement_given_movie_type_is_CHILDREDNS_and_day_rented_lower_than_3() {
        Movie movie3 = new ChildrenMovie("哪吒");

        Rental rental3 = new Rental(movie3, 1);

        Customer customer = new Customer("Liam");

        customer.addRental(rental3);

        String statement = customer.htmlStatement();

        assertEquals("<H1>Rentals for <EM>Liam</EM></H1><P>\n" +
                "哪吒: 1.5<BR>\n" +
                "<P>You owe<EM>1.5</EM><P>\n" +
                "On this rental you earned <EM>1</EM> frequent renter points<P>", statement);
    }

    @Test
    public void should_print_html_statement_when_invoke_html_statement_given_movie_type_is_CHILDREDNS_and_day_rented_higher_than_3() {
        Movie movie3 = new ChildrenMovie("哪吒");

        Rental rental3 = new Rental(movie3, 5);

        Customer customer = new Customer("Liam");

        customer.addRental(rental3);

        String statement = customer.htmlStatement();

        assertEquals("<H1>Rentals for <EM>Liam</EM></H1><P>\n" +
                "哪吒: 4.5<BR>\n" +
                "<P>You owe<EM>4.5</EM><P>\n" +
                "On this rental you earned <EM>1</EM> frequent renter points<P>", statement);
    }



    @Test
    public void should_print_statement_when_invoke_html_statement_given_movie_is_null() {
        Customer customer = new Customer("Liam");

        String statement = customer.htmlStatement();

        assertEquals("<H1>Rentals for <EM>Liam</EM></H1><P>\n" +
                "<P>You owe<EM>0.0</EM><P>\n" +
                "On this rental you earned <EM>0</EM> frequent renter points<P>", statement);
    }


}
