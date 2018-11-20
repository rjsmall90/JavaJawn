package com.schedule.JavaJawn.Repository

import com.schedule.JavaJawn.Model.User
import com.sun.org.apache.bcel.internal.util.Repository
import org.springframework.data.jpa.repository.JpaRepository

@Repository
trait UserRepository extends JpaRepository[User, Long] {
  def findUserByUsername(username: String): User


}
