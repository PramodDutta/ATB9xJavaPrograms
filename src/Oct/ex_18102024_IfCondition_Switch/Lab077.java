package Oct.ex_18102024_IfCondition_Switch;

import java.util.Scanner;

public class Lab077 {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> execute chrome
        // firefox -> execute of firefox
        // edge -> edge browser cases.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        browser = browser.toLowerCase();
        switch (browser){
            default:
                System.out.println("I have not idea which browser is this");
                break;
            case "chrome" :
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firfox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;





        }






    }
}
