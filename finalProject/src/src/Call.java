package src;

public class Call extends Mane{

    private String from;
    private String to;
    private String id;
    private String duration;
    private String Mane_key;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMane_key() {
        return Mane_key;
    }

    public void setMane_key(String mane_key) {
        Mane_key = mane_key;
    }
}
