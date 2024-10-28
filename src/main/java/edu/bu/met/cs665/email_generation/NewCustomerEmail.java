/**
 * File Name: NewCustomerEmail.java
 * Description: The NewCustomerEmail class is a subclass of EmailTemplate tailored for new customers.
 * It generates a welcoming subject and body that include the customer's name,
 * expressing gratitude for joining and presenting a special welcome gift.
 */

package edu.bu.met.cs665.email_generation;

    public class NewCustomerEmail extends EmailTemplate {
    public NewCustomerEmail(String customerName) {
        super(customerName);
    }

    @Override
    public String createSubject() {
        return "Welcome to Our Community!";
    }

    @Override
    public String createBody() {
        return "Dear " + getCustomerName() + ",\n\nThank you for joining us! As a welcome gift, we have...";
    }
}
