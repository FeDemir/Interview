package Tests.SocialMedia;

import Tests.DateAndTime;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;

import java.util.Date;

public class Post {
    private String body;
    private final String dateTime;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Post() {
        this.dateTime = LocalDateTime.now().toString();
    }

    public String getDateTime() {
        return dateTime;
    }
}
