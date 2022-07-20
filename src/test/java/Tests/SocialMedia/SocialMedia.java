package Tests.SocialMedia;

public abstract class SocialMedia {
    String url, username, password, fullName;
    int accountLength;
    static String platform;
    public abstract void directMessaging(String username, String message);
    public abstract void post(Object media);
    public abstract void notifications();
}
