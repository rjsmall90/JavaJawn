package com.javajawn.JavaJawn.repo;

import com.javajawn.JavaJawn.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository <Admin, Long> {

}
