import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    public void testContactCreated() {
        Contact contact = new Contact("12345", "Britt", "Smith", "1234567890", "123 Main Street");

        assertEquals("12345", contact.getContactID());
        assertEquals("Britt", contact.getFirstName());
        assertEquals("Smith", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main Street", contact.getAddress());
    }

    @Test
    public void testInvalidContactID() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "Britt", "Smith", "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testInvalidFirstName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "BrittanyLong", "Smith", "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testInvalidLastName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Britt", "SmithLonger", "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testInvalidPhone() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Britt", "Smith", "12345", "123 Main Street");
        });
    }

    @Test
    public void testInvalidAddress() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Britt", "Smith", "1234567890", "123 Main Street That Is Too Long");
        });
    }

    @Test
    public void testSetFirstName() {
        Contact contact = new Contact("12345", "Britt", "Smith", "1234567890", "123 Main Street");

        contact.setFirstName("Ashley");

        assertEquals("Ashley", contact.getFirstName());
    }

    @Test
    public void testSetLastName() {
        Contact contact = new Contact("12345", "Britt", "Smith", "1234567890", "123 Main Street");

        contact.setLastName("Johnson");

        assertEquals("Johnson", contact.getLastName());
    }

    @Test
    public void testSetPhone() {
        Contact contact = new Contact("12345", "Britt", "Smith", "1234567890", "123 Main Street");

        contact.setPhone("0987654321");

        assertEquals("0987654321", contact.getPhone());
    }

    @Test
    public void testSetAddress() {
        Contact contact = new Contact("12345", "Britt", "Smith", "1234567890", "123 Main Street");

        contact.setAddress("456 Oak Street");

        assertEquals("456 Oak Street", contact.getAddress());
    }
}
