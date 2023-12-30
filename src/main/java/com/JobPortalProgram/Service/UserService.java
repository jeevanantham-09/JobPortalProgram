package com.JobPortalProgram.Service;

import com.JobPortalProgram.Dto.userdto;
import com.JobPortalProgram.Repository.UserRepo;
import com.JobPortalProgram.UserModel.User;

import java.util.List;

public interface UserService {
    User save(userdto userdto);
}
