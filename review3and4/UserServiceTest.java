import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UserServiceTest {

    private UserService userService;

    @Before
    public void setUp() {
        userService = new UserService(new UserDao());
    }

    @Test
    public void testUserRegistration() {
        User user = new User("johnDoe", "password", "john@example.com");
        boolean isRegistered = userService.registerUser(user);
        assertTrue("User should be registered successfully", isRegistered);
    }
}
