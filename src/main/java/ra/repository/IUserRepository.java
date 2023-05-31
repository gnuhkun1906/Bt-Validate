package ra.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ra.model.User;

@Repository
public interface IUserRepository extends CrudRepository<User,Long> {
}
