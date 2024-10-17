public class Bok {
    private String title;
    private String author;
    private String description;
    private Boolean isAvailable;

    public Bok(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.isAvailable = true;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
