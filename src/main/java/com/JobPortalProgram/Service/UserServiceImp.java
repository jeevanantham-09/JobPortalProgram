package com.JobPortalProgram.Service;

import com.JobPortalProgram.Dto.userdto;
import com.JobPortalProgram.Repository.UserRepo;
import com.JobPortalProgram.UserModel.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserRepo userRepo;
    @Override
    public User save(userdto userdto) {
        User user = new User(userdto.getUsername(), userdto.getDob(), userdto.getEmail(), userdto.getPhone(),  userdto.getAddress(), userdto.getQualification(), userdto.getPassedOutYear(), userdto.getPreferred_role(), userdto.getPreferred_salary(), userdto.getJob_type(), userdto.getSkills(), userdto.getProfile_summary(), userdto.getProjects(), userdto.getLanguages());
        return userRepo.save(user);
    }
public List<User> getUsers(){
    return userRepo.findAll();
}
}
