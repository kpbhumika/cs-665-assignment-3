/**
 * Name: BHUMIKA KUSUGOLLI PARAMESWARA
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: Main.java
 * Description: It contains a main method that initializes sample customer data representing
 * different customer types. The class uses the EmailFactory to create specific
 * EmailTemplate instances for each customer type and then prints the generated
 * email content to the console, showcasing tailored messages for each customer.
 */

package edu.bu.met.cs665;
import edu.bu.met.cs665.email_generation.*;

public class Main {

  public static void main(String[] args) {
    // Sample customer names for each type
    String[][] customerData = {
            {"Business", "Alice Corp"},
            {"Returning", "John Doe"},
            {"Frequent", "Sara Smith"},
            {"New", "Emily Lin"},
            {"VIP", "Mike Johnson"}
    };

    for (String[] data : customerData) {
      String customerType = data[0];
      String customerName = data[1];

      EmailTemplate email = EmailFactory.createEmail(customerType, customerName);

      System.out.println("\n*** " + customerType + " Customer Email ***");
      System.out.println(email.getEmailContent());
    }
  }

}
