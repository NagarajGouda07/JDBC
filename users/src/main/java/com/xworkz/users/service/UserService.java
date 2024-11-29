package com.xworkz.users.service;

import com.xworkz.users.dto.UserDTO;
import java.util.List;

public interface UserService {
    boolean addUser(UserDTO user);
    UserDTO getUserById(int id);
    List<UserDTO> getAllUsers();
    boolean updateUser(String email, String newName);
    boolean deleteUserById(int id);
}
