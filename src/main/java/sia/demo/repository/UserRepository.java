package sia.demo.repository;

import org.springframework.data.repository.CrudRepository;
import sia.demo.domain.User;

public interface UserRepository extends CrudRepository<User,Long> {
        User findByUsername(String username);
}
