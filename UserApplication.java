package bprat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@ComponentScan
@EnableAutoConfiguration
public class UserApplication {
    public static void main(String[] args) throws Throwable {

        SpringApplication.run(UserApplication.class, args);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello!!!World!!";
    }

    @GetMapping("/error")
    @ResponseBody
    public String displayError(){
        return "User not present!!";
    }


}
