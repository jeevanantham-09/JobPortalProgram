package com.JobPortalProgram.Repository;

import com.JobPortalProgram.UserModel.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
