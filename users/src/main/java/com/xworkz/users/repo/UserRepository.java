package com.xworkz.users.repo;

import com.xworkz.users.dto.UserDTO;
import java.util.List;

public interface UserRepository {
    boolean insertUser(UserDTO user);
    UserDTO getUserById(int id);
    List<UserDTO> getAllUsers();
    boolean updateUserByEmail(String email, String newName);
    boolean deleteUserById(int id);
}
