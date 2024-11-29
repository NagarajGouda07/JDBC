package com.xworkz.user.service;

import com.xworkz.user.dto.UserDTO;
import com.xworkz.user.repo.UserRepository;
import com.xworkz.user.repo.UserRepositoryImpl;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public boolean addUser(UserDTO user) {
        return userRepository.insertUser(user);
    }

    @Override
    public UserDTO getUserById(int id) {
        return userRepository.getUserById(id);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public boolean updateUser(String email, String newName) {
        return userRepository.updateUserByEmail(email, newName);
    }

    @Override
    public boolean deleteUserById(int id) {
        return userRepository.deleteUserById(id);
    }
}
