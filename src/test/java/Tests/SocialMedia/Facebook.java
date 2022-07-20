package Tests.SocialMedia;

import java.util.List;

public class Facebook extends SocialMedia{
       private int age,numberOfFriends;
       private List<Post> posts;
       static {
           platform="Facebook";
       }

    public Facebook(String username, String password) {
            this.username = username;
            if(password.contains(username))
            this.password = password;
    }

    @Override
    public void directMessaging(String username, String message) {

    }

    @Override
    public void post(Object media) {

    }

    @Override
    public void notifications() {

    }
}
