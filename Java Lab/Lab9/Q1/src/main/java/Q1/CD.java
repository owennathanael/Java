package Q1;

public class CD extends LibraryItem implements LoanItem
{
    String band;
    String title;
    int numTracks;
    public CD(String band, String title, int numTracks,String type, String ID)
    {
        super(type,ID);
        this.band = band;
        this.numTracks = numTracks;
    }

    @Override
    public double calculatePrice()
    {
        return numTracks*1.5;
    }
}
