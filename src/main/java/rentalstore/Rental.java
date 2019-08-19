package rentalstore;

public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }

    public boolean isNewReleaseRentalAndDayBiggerOne() {
        return (movie instanceof NewReleaseMovie) && getDayRented() > 1;
    }

    public double getThisAmount() {
        return movie.getThisAmount(getDayRented());
    }

    public int getFrequentRenterPoints(int frequentRenterPoints) {
        frequentRenterPoints++;
        if (isNewReleaseRentalAndDayBiggerOne()) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }
}
