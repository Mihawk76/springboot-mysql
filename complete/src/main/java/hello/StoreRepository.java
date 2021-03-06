package hello;

import org.springframework.data.repository.CrudRepository;

import hello.Store;
import hello.User;
import hello.UserRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface StoreRepository extends CrudRepository<Store, Integer> {

}
