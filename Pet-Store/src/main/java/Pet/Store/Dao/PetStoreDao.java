package Pet.Store.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Pet.Store.Entity.PetStore;

public interface PetStoreDao extends JpaRepository<PetStore, Long> {

	

}