import static org.junit.jupiter.api.Assertions.*;
import java.sql.Connection;
import org.junit.jupiter.api.Test;
import org.sushant.DBConnection;

class DBConnectionTest {

    @Test
    void testDatabaseConnection() {
        try (Connection connection = DBConnection.getConnection()) {
            // Check connection is not null
            assertNotNull(connection);
            // Check connection is valid
            assertTrue(connection.isValid(2));

            System.out.println("Database Connected Successfully");

        } catch (Exception e) {
            fail("Connection failed: " + e.getMessage());
        }
    }
}