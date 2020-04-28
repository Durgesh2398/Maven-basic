package techBlog.Service;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public boolean login(User user) {
        if(user.getUsername().equals("validate")) {
            return true;
        }
        else {
            return false;
        }
    }
}
