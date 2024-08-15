package com.masprogtech.services.user;

import com.masprogtech.entities.User;
import com.masprogtech.request.CreateUserRequest;
import com.masprogtech.request.UserUpdateRequest;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);
}
