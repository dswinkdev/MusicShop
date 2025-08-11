import java.text.DecimalFormat;

public class RecordLabel extends Artist {

    DecimalFormat df = new DecimalFormat("#,###,###");


    String artistLabel;
    int recordSpot;

    public RecordLabel(String artistName, String artistAlbum, String artistGenre, String artistHometown, String artistLabel, String artistTour, int currentAlbumSales, int totalAlbumSales, boolean onTour, int recordSpot) {
        super(artistName, artistGenre, artistHometown, artistTour, artistAlbum, currentAlbumSales, totalAlbumSales, onTour);
        this.artistLabel = artistLabel;
        this.recordSpot = recordSpot;
    }

    @Override
    public void artistProfile() {
        System.out.println("🎤 Artist: " + getName());
        System.out.println("💿 Album: " + getAlbum());
        System.out.println("🎶 Genre: " + getGenre());
        System.out.println("🏙️ Hometown: " + getHometown());

        if (isOnTour()) {
            System.out.println("🚌 Tour: Active 🚀");
        } else {
            System.out.println("🛋️ Tour: Not Active");
        }

        if (getCurrentAlbumSales() >= 100000 && recordSpot <= 100) {
            System.out.println("📈 Chart: #" + recordSpot);
            System.out.println("🔥 Hot Billboard 100 List");
            System.out.println("🌍 Records sold Worldwide: " + df.format(getTotalAlbumSales()) + " million");
        } else {
            System.out.println("📉 Chart: #" + recordSpot);
            if (getAlbum().isBlank()) {
                System.out.println("🚫 No album info");
            } else {
                System.out.println("🌍 Records Sold WorldWide: " + df.format(getTotalAlbumSales()) + " million");
            }
        }
        System.out.println("🏢 Record Label: " + this.artistLabel);
        System.out.println("-----------------------------");
    }
}
