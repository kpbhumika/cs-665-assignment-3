/**
 * File Name: BusinessEmail.java
 * Description: The BusinessEmail class is a specialized EmailTemplate for business customers.
 * It customizes the subject and body with business-focused content,
 * using the customer’s name for personalization.
 */

package edu.bu.met.cs665.email_generation;

public class BusinessEmail extends EmailTemplate {
    public BusinessEmail(String customerName) {
        super(customerName);
    }

    @Override
    public String createSubject() {
        return "Exclusive Business Solutions Just for You";
    }

    @Override
    public String createBody() {
        return "Hello " + getCustomerName() + ",\n\nWe have new solutions tailored for your business needs...";
    }
}

