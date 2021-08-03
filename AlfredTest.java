public class AlfredTest {
    public static void main(String[] args) {
        System.out.println("entry main");

        AlfredQuotes alfredBot = new AlfredQuotes();
        System.out.println(alfredBot.basicGreeting());

        AlfredQuotes alfredBot2 = new AlfredQuotes();
        System.out.println(alfredBot2.dateAnnouncement());

        AlfredQuotes alfredBot3 = new AlfredQuotes();
        System.out.println(alfredBot3.guestGreeting("morning", "Ashley"));

        AlfredQuotes alfredBot4 = new AlfredQuotes();
        System.out.println(alfredBot4.respondBeforeAlexis("Alexis whats the weather like today?"));
    }
}