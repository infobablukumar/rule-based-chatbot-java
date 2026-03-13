import java.util.Scanner;
import java.time.LocalTime;

public class ChatBot {

    public static String getResponse(String input) {

        input = input.toLowerCase();

        // Greetings
        if (input.contains("hello") || input.contains("hi") || input.contains("hey")) {
            return "Hello! 👋 How can I help you today?";
        }

        // Asking name
        else if (input.contains("your name")) {
            return "I am a Rule-Based Chatbot written in Java.";
        }

        // How are you
        else if (input.contains("how are you")) {
            return "I am just a program, but I am running perfectly! 😊";
        }

        // Time
        else if (input.contains("time")) {
            LocalTime currentTime = LocalTime.now();
            return "Current time is: " + currentTime;
        }

        // Help
        else if (input.contains("help")) {
            return "You can ask me about greetings, time, or my name.";
        }

        // Exit
        else if (input.equals("bye") || input.equals("exit")) {
            return "Goodbye! Have a great day! 👋";
        }

        // Default response
        else {
            return "Sorry, I don't understand that.";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("🤖 Rule-Based Chatbot (Java Version)");
        System.out.println("Type 'bye' to exit.\n");

        while (true) {

            System.out.print("You: ");
            String userInput = scanner.nextLine();

            String response = getResponse(userInput);
            System.out.println("Bot: " + response);

            if (userInput.equalsIgnoreCase("bye") || 
                userInput.equalsIgnoreCase("exit")) {
                break;
            }
        }

        scanner.close();
    }
}
