import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    @Test
    public void testAddContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "12345",
                "Britt",
                "Smith",
                "1234567890",
                "123 Main Street");

        service.addContact(contact);

        assertEquals(contact, service.getContact("12345"));
    }

    @Test
    public void testDeleteContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "12345",
                "Britt",
                "Smith",
                "1234567890",
                "123 Main Street");

        service.addContact(contact);

        service.deleteContact("12345");

        assertNull(service.getContact("12345"));
    }

    @Test
    public void testUpdateFirstName() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "12345",
                "Britt",
                "Smith",
                "1234567890",
                "123 Main Street");

        service.addContact(contact);

        service.updateFirstName("12345", "Ashley");

        assertEquals("Ashley", service.getContact("12345").getFirstName());
    }

    @Test
    public void testUpdateLastName() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "12345",
                "Britt",
                "Smith",
                "1234567890",
                "123 Main Street");

        service.addContact(contact);

        service.updateLastName("12345", "Johnson");

        assertEquals("Johnson", service.getContact("12345").getLastName());
    }

    @Test
    public void testUpdatePhone() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "12345",
                "Britt",
                "Smith",
                "1234567890",
                "123 Main Street");

        service.addContact(contact);

        service.updatePhone("12345", "0987654321");

        assertEquals("0987654321", service.getContact("12345").getPhone());
    }

    @Test
    public void testUpdateAddress() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "12345",
                "Britt",
                "Smith",
                "1234567890",
                "123 Main Street");

        service.addContact(contact);

        service.updateAddress("12345", "456 Oak Street");

        assertEquals("456 Oak Street", service.getContact("12345").getAddress());
    }
}