package ma.emsi.jpaemsi.service;


import ma.emsi.jpaemsi.entities.Role;
import ma.emsi.jpaemsi.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findUserByRoleName(String roleName);
   //index unique par @column unique
    void addRoleToUser(String username, String roleName);
    User authenticate(String userName, String password);

}
