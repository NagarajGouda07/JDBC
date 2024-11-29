package com.xworkz.user.repo;

import com.xworkz.user.dto.UserDTO;
import java.util.List;

public interface UserRepository {
    boolean insertUser(UserDTO user);
    UserDTO getUserById(int id);
    List<UserDTO> getAllUsers();
    boolean updateUserByEmail(String email, String newName);
    boolean deleteUserById(int id);
}
