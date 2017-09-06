package cashmachine.testDatabase;

/**
 *
 * @author Vladimir Mandač
 */
public class User {
    
    private User() {
        
    }
    
    private static User instance;
    
    public static User getInstance() {
        if(instance == null)  
            instance = new User();
        return instance;
    }
}
