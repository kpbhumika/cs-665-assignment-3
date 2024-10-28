/**
 * File Name: ReturningCustomerEmail.java
 * Description: The ReturningCustomerEmail class is a subclass of EmailTemplate designed for
 * returning customers. It provides a subject and body that express appreciation for their return,
 * using the customer's name to personalize the message and highlight new updates or offerings.
 */
package edu.bu.met.cs665.email_generation;

public class ReturningCustomerEmail extends EmailTemplate {
    public ReturningCustomerEmail(String customerName) {
        super(customerName);
    }

    @Override
    public String createSubject() {
        return "Welcome Back! Check Out What's New";
    }

    @Override
    public String createBody() {
        return "Dear " + getCustomerName() + ",\n\nThank you for coming back! We have some great updates...";
    }
}
