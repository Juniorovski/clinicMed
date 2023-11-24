package com.juniormelodeveloper.ClinicMedic.repository;

import com.juniormelodeveloper.ClinicMedic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
