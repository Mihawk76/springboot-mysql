package hello;

import org.springframework.data.repository.CrudRepository;

import hello.User;
import hello.Store;
import hello.StoreRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}
