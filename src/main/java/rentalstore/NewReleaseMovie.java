package rentalstore;

public class NewReleaseMovie extends Movie{

    public NewReleaseMovie(String title) {
        super(title);
    }

    public double getThisAmount(double dayRented){
        return dayRented * 3;
    }
}
