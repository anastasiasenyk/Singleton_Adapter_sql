package adapter.task2;

import java.time.LocalDate;

public class Login {
    public Client Login(String loginMethod) {
        if (loginMethod.equals("twitter")) {
            return new TwitterClient(new TwitterUser("coolemail", "coolcountry", "2022"));
        } else if (loginMethod.equals("facebook")) {
            return new FacebookClient(new FacebookUser("coolemail", Country.Ukraine, LocalDate.of(2020, 5, 6)));
        }
        return null;
    }
}
