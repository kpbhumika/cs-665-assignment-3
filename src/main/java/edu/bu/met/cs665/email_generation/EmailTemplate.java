/**
 * File Name: EmailTemplate.java
 * Description: The EmailTemplate abstract class defines a template for customer emails.
 * It includes a customerName field, a method to retrieve it,
 * and abstract methods createSubject() and createBody() for custom content.
 * The getEmailContent() method combines the subject and body for a complete email. Subclasses implement the specifics for each customer type.
 */

package edu.bu.met.cs665.email_generation;

public abstract class EmailTemplate {
    private final String customerName;

    public EmailTemplate(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return customerName;
    }


    public abstract String createSubject();
    public abstract String createBody();

    public String getEmailContent() {
        return "Subject: " + createSubject() + "\n\n" + createBody();
    }
}

