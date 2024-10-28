/**
 * File Name: VIPCustomerEmail.java
 * Description: The VIPCustomerEmail class is a subclass of EmailTemplate tailored for VIP customers.
 * It generates a subject and body that convey exclusive benefits and personalized messages,
 * addressing the customer by name and emphasizing their VIP status.
 */

package edu.bu.met.cs665.email_generation;

public class VIPCustomerEmail extends EmailTemplate {
    public VIPCustomerEmail(String customerName) {
        super(customerName);
    }

    @Override
    public String createSubject() {
        return "VIP Treatment Just for You!";
    }

    @Override
    public String createBody() {
        return "Hello " + getCustomerName() + ",\n\nAs one of our VIP customers, you are entitled to...";
    }
}
