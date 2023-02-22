package pl.practicalExercise.springTask2;

import java.time.LocalDateTime;

public class Note {
    private String id;
    private String text;
    private LocalDateTime localDateTime;

    public Note(String id, String text) {
        this.id = id;
        this.text = text;
        localDateTime = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
