public class Message {
    private  User author;
    private int charCounter;
    private String message;
    private String creationDate;

    public Message(String message) {
        this.message = message;
    }

    public User getAuthor() {
        return author;
    }

    public Message setAuthor(User author) {
        this.author = author;
        return this;
    }

    public int getCharCounter() {
        return charCounter;
    }

    public Message setCharCounter(int charCounter) {
        this.charCounter = charCounter;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Message setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public Message setCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }
}