/**
 * File Name: FrequesntCustomerEmail.java
 * Description: The FrequentCustomerEmail class is a EmailTemplate subclass designed
 * for frequent customers. It provides a custom subject and body, using the
 * customer’s name to personalize a message of appreciation and offer exclusive deals.
 */

package edu.bu.met.cs665.email_generation;

public class FrequentCustomerEmail extends EmailTemplate {
    public FrequentCustomerEmail(String customerName) {
        super(customerName);
    }

    @Override
    public String createSubject() {
        return "Thank You for Being a Loyal Customer!";
    }

    @Override
    public String createBody() {
        return "Hi " + getCustomerName() + ",\n\nWe appreciate your loyalty! Here are some exclusive offers...";
    }
}
