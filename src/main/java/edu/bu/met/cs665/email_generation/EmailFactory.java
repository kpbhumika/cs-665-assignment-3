/**
 * File Name: EmailFactoru.java
 * Description:The EmailFactory class creates specific EmailTemplate instances based on customer type.
 * It returns tailored emails for types like Business, Returning, Frequent, New, and VIP,
 * throwing an error if the type is unknown. This simplifies and centralizes email object creation.
 */

package edu.bu.met.cs665.email_generation;

public class EmailFactory {
    public static EmailTemplate createEmail(String customerType, String customerName) {
        switch (customerType) {
            case "Business":
                return new BusinessEmail(customerName);
            case "Returning":
                return new ReturningCustomerEmail(customerName);
            case "Frequent":
                return new FrequentCustomerEmail(customerName);
            case "New":
                return new NewCustomerEmail(customerName);
            case "VIP":
                return new VIPCustomerEmail(customerName);
            default:
                throw new IllegalArgumentException("Unknown customer type: " + customerType);
        }
    }
}