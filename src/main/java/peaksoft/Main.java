package peaksoft;

import peaksoft.dao.UserDao;
import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.User;
import peaksoft.service.UserServiceImpl;
import peaksoft.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.getConnection();

        UserServiceImpl userService=new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Adel", "Sam", (byte) 24);
        userService.saveUser("Michelle", "Obama", (byte) 20);

        userService.removeUserById(1L);

        System.out.println(userService.getAllUsers());

        userService.dropUsersTable();
        userService.cleanUsersTable();


    }
}
