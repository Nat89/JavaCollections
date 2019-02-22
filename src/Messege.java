import java.time.LocalDateTime;

public class Messege {
    String content;
    String author;
    LocalDateTime dateTime;

    public Message (String content, String author) {
        this.content = content;
        this.author = author;
        this.dateTime = LocalDateTime.now();

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Messege{" +
                "content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;

    }
}

