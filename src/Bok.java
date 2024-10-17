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

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }


    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    //public void moreInfo(Bok book){
      //  System.out.println("Title: " + title + "\nAuthor: " + author + "\nDescription: " + description);
    //}
}
