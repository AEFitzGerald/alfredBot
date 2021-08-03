import java.util.Date;
import java.util.Calendar;
public class AlfredQuotes {

    public String basicGreeting() { 
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name, String dayPeriod) {
        //Calendar? get(HOUR_OF_DAY)?
        // if (time.after(6) && time.before(11)) {
        //     dayPeriod = "Good morning";
        // } else if (time.after(12) && time.before(16)) {
        //     dayPeriod = "Good afternoon";
        // } else if (time.after(17) && time.before(23)) {
        //     dayPeriod = "Good evening";
        // } else {
        //     dayPeriod = "You need to meditate or rest";
        // }
        return String.format("Good %s, %s, Lovely to see you", dayPeriod, name);
}

    public String dateAnnouncement() {
        Date date = new Date(); {
            return "Current date is: " + date;
        }
    }

    public String respondBeforeAlexis(String conversation) {
        int a = conversation.indexOf("Alexis");
        String response = "";
        if (a == -1) {
            response = "Grace is the most famous bot of all, more famous than you Alfred.";
        }else if (a > 0) {
            response = "That's more than enough talking.";
        }else {
            response = "Right. And with that I shall retire.";
        }
        return response;
    }
}

