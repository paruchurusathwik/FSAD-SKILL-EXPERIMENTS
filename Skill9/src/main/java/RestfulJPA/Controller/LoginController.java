package RestfulJPA.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import RestfulJPA.Model.LoginRequest;

@RestController
@CrossOrigin
@RequestMapping("/auth")
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        String username = request.getUsername();
        String password = request.getPassword();

        if(username.equals("admin") && password.equals("1234")) {
            return "Login Successful";
        } else {
            return "Invalid Username or Password";
        }
    }
}