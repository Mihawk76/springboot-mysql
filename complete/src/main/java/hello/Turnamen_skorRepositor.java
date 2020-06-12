package hello;

import org.springframework.data.repository.CrudRepository;

import hello.Turnamen_skor;
import hello.Store;
import hello.StoreRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface Turnamen_skorRepository extends CrudRepository<Turnamen_skor, Integer> {
//public interface ThRepository extends CrudRepository<Th, Integer> {

}
