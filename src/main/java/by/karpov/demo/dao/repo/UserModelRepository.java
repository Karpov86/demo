package by.karpov.demo.dao.repo;

import by.karpov.demo.dao.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserModelRepository extends JpaRepository<UserModel, Long>
{
	@Query("select u from UserModel u where u.name like ?1")
	UserModel findUserByNameLike(String line);
}