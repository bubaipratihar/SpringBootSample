package bprat;
/*
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/usrPOC")
public class UserListController {
    public static final Logger LOGGER = LoggerFactory.getLogger(UserListController.class);

    private final UserListRepository repository;

    public UserListController(UserListRepository repository) {
        this.repository = repository;
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


    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public UserServiceResponse users(){
        LOGGER.info("Request received for /users");
        final UserServiceResponse response = new UserServiceResponse();
        response.setStatus("Bingo!!! Success!!!");

        final List<User> users = StreamSupport.stream(repository.findAll().spliterator(), false).collect(Collectors .toList());
        response.setListUser(users);

        return response;
    }

    @RequestMapping(value="/users/{sid}", method = RequestMethod.GET)
    public UserServiceResponse user(@PathVariable("sid") final String sid){
        if(!StringUtils.hasText(sid)){
            throw new IllegalArgumentException("User SID is required.");
        }
        LOGGER.info("Request received for /user");
        final UserServiceResponse response = new UserServiceResponse();
        response.setStatus("Failure....404 User is missing!!!");
        final List<User> users = new ArrayList<User>();

        repository.findById(sid).ifPresent(users::add);

        if(users.size() > 0){
            response.setStatus("Bingo!!! Success!!!");

        }
        response.setListUser(users);

        return response;
    }

    public static class UserServiceResponse{
        private String status;
        private List<User> listUser;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<User> getListUser() {
            return listUser;
        }

        public void setListUser(final List<User> listUser) {
            this.listUser = listUser;
        }
    }
}
*/