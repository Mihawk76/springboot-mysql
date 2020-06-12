package hello;

import org.springframework.data.repository.CrudRepository;

import hello.Peserta;
import hello.Store;
import hello.StoreRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PesertaRepository extends CrudRepository<Peserta, Integer> {
//public interface ThRepository extends CrudRepository<Th, Integer> {

}
