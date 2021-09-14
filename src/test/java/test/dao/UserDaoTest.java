package test.dao;

import dev.backend.daos.UserDao;
import dev.backend.models.User;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.*;

import java.util.List;

public class UserDaoTest {
    private UserDao userDao;

    @BeforeClass
    public void setup(){
        User testUser1 = userDao.createUser("Tester1", "Tester1", "Tester1@test.com", "Tester1", "Tester1", "Tester");
        User testUser2 = userDao.createUser("Tester2", "Tester2", "Tester2@test.com", "Tester2", "Tester2", "AlphaTester");
        User testUser3 = userDao.createUser("Tester3", "Tester3", "Tester3@test.com", "Tester3", "Tester3", "BetaTester");
    }

    @Test
    public void testUserGetter(){
        Assertions.assertEquals(userDao.getUser(1).getFirstName(),"Tester1");
        Assertions.assertEquals(userDao.getUser(2).getFirstName(), "Tester2");
    }

    @Test
    public void testUsersGetter(){
        Assertions.assertTrue(userDao.getUsers().size() >= 3);
    }

    @Test
    public void testUserUpdater(){
        userDao.updateUser(1, "a","a","a","a","a","a");
        Assertions.assertEquals(userDao.getUser(1).getFirstName(), "a");
    }

    @Test
    public void testUserDeleter(){
        Assertions.assertTrue(userDao.deleteUser(1));
        Assertions.assertFalse(userDao.deleteUser(1));
    }

    @AfterClass
    public void deconstruction(){
        List<User> userList = userDao.getUsers();
        for(User user : userList){
            userDao.deleteUser(user.getUserId());
        }
    }
}
