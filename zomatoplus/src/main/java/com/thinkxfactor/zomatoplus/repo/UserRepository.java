package com.thinkxfactor.zomatoplus.repo;
import com.thinkxfactor.zomatoplus.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
	User findByNameAndPasssword(String name,String password);

}

