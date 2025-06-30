package dev.andy.firstjavawebapp;
import org.springframework.stereotype.Component;;

@Component
public class WelcomeMessage {
    public String getWelcomeMessage() {
        return "Welcome this is my first java webapp";
    }
}
