package bprat;

/*
import java.util.*;

public class UserListRepository {
    private final List<User> listUser = new ArrayList<User>();

    public UserListRepository() {
        User user = new User();

        listUser.add(addUser("Bubai", "Pratihar", "146802", "02/10/2006","Houston","Manager"));
        listUser.add(addUser( "Gourav", "Pratihar", "146802",  "20-Feb-2009", "Houston", "Manager"));

    }

    private User addUser( final String firstName,
                        final String lastName,
                        final String sid,
                        final String joiningDate,
                        final String location,
                        final String designation
                        ){

        User usr = new User();
        usr.setFirstName(firstName);
        usr.setLastName(lastName);
        usr.setSid(sid);
        usr.setDesignation(designation);
        usr.setJoiningDate(joiningDate);
        usr.setLocation(location);

        return usr;
    }

    public Iterable<User> findAll(){
        return Collections.unmodifiableList(listUser);
    }

    public Optional<User> findById(final String sid){
        for (final User user : listUser){
            if(sid.equalsIgnoreCase(user.getSid())){
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

}
*/