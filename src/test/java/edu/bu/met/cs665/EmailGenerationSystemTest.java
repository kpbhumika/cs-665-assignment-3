package edu.bu.met.cs665;

/*
 * File Name: EmailGenerationSystemTest.java
 * Description: This class contains unit tests for the email generation system,
 * specifically testing the functionality of creating personalized emails for
 * different customer segments.
 */


import edu.bu.met.cs665.email_generation.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmailGenerationSystemTest {

    @Test
    public void testBusinessEmailGeneration() {
        // Arrange
        String customerType = "Business";
        String customerName = "Alice Corp";

        // Act
        EmailTemplate email = EmailFactory.createEmail(customerType, customerName);

        // Assert
        assertTrue("Expected a BusinessEmail instance.", email instanceof BusinessEmail);
        assertEquals("Incorrect email subject.", "Exclusive Business Solutions Just for You", email.createSubject());
        assertEquals("Incorrect email body.", "Hello Alice Corp,\n\nWe have new solutions tailored for your business needs...", email.createBody());
    }

    @Test
    public void testReturningCustomerEmailGeneration() {
        // Arrange
        String customerType = "Returning";
        String customerName = "John Doe";

        // Act
        EmailTemplate email = EmailFactory.createEmail(customerType, customerName);

        // Assert
        assertTrue("Expected a ReturningCustomerEmail instance.", email instanceof ReturningCustomerEmail);
        assertEquals("Incorrect email subject.", "Welcome Back! Check Out What's New", email.createSubject());
        assertEquals("Incorrect email body.", "Dear John Doe,\n\nThank you for coming back! We have some great updates...", email.createBody());
    }

    @Test
    public void testVIPCustomerEmailGeneration() {
        // Arrange
        String customerType = "VIP";
        String customerName = "Mike Johnson";

        // Act
        EmailTemplate email = EmailFactory.createEmail(customerType, customerName);

        // Assert
        assertTrue("Expected a VIPCustomerEmail instance.", email instanceof VIPCustomerEmail);
        assertEquals("Incorrect email subject.", "VIP Treatment Just for You!", email.createSubject());
        assertEquals("Incorrect email body.", "Hello Mike Johnson,\n\nAs one of our VIP customers, you are entitled to...", email.createBody());
    }

    @Test
    public void testInvalidCustomerType() {
        // Arrange
        String customerType = "InvalidType";
        String customerName = "Unknown User";

        // Act & Assert
        try {
            EmailFactory.createEmail(customerType, customerName);
            fail("Expected IllegalArgumentException for invalid customer type.");
        } catch (IllegalArgumentException e) {
            assertEquals("Expected exception message for invalid customer type.", "Unknown customer type: InvalidType", e.getMessage());
        }
    }
}
