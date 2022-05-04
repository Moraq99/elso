package homework;

public class Play {

    private String author;
    private String Title;
    private int Performances;
    private int actors;

    public Play() {
    }

    public Play(String author, String title, int performances, int actors) {
        this.author = author;
        Title = title;
        Performances = performances;
        this.actors = actors;
    }

    Play RJ = new Play("William Shakespeare","Rómeó és Júlia", 5,5);


    @Override
    public String toString() {
        return "Play{" +
                "author='" + author + '\'' +
        ", Title='" + Title + '\'' +
        ", Performances=" + Performances +
                ", actors=" + actors +
                '}';
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getPerformances() {
        return Performances;
    }

    public void setPerformances(int performances) {
        Performances = performances;
    }

    public int getActors() {
        return actors;
    }

    public void setActors(int actors) {
        this.actors = actors;
    }

}
