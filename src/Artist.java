public abstract class Artist {
    private String name;
    private String album;
    private String genre;
    private String hometown;
    private String tour;
    private int currentAlbumSales;
    private int totalAlbumSales;
    private boolean onTour;

    public Artist(String artistName, String artistAlbum, String artistGenre, String artistHometown, String artistTour, int currentAlbumSales, int totalAlbumSales, boolean onTour){
        this.name = artistName;
        this.album = artistAlbum;
        this.genre = artistGenre;
        this.hometown = artistHometown;
        this.tour = artistTour;
        this.currentAlbumSales = currentAlbumSales;
        this.totalAlbumSales = totalAlbumSales;
        this.onTour = onTour;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getTour() {
        return tour;
    }

    public void setTour(String tour) {
        this.tour = tour;
    }

    public double getCurrentAlbumSales() {
        return currentAlbumSales;
    }

    public void setCurrentAlbumSales(int currentAlbumSales) {
        this.currentAlbumSales = currentAlbumSales;
    }

    public double getTotalAlbumSales() {
        return totalAlbumSales;
    }

    public void setTotalAlbumSales(int totalAlbumSales) {
        this.totalAlbumSales = totalAlbumSales;
    }

    public boolean isOnTour() {
        return onTour;
    }

    public void setOnTour(boolean onTour) {
        this.onTour = onTour;
    }

    // abstract method
    public abstract void artistProfile();
}
