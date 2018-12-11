package bprat;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

/**
 * Default controller that exists to return a proper rest response for unmapped requests.
 */

@Controller
public class DefaultController {
    public void unmappedReqeust(HttpServletRequest request){
        String url = request.getRequestURI();
        throw new UserException("There is no resource for path " + url);
    }
}
