public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Create an EmailNotifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorate the EmailNotifier with SMSNotifierDecorator
        Notifier emailAndSMSNotifier = new SMSNotifierDecorator(emailNotifier);

        // Decorate the EmailAndSMSNotifier with SlackNotifierDecorator
        Notifier emailSMSAndSlackNotifier = new SlackNotifierDecorator(emailAndSMSNotifier);

        // Send notification via Email, SMS, and Slack
        emailSMSAndSlackNotifier.send("Hello, this is a test notification!");
    }
}
