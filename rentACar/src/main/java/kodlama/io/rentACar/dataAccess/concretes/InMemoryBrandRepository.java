package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Repository  // bu sınıf bir data access nesnesidir anlamında
public class InMemoryBrandRepository implements BrandRepository {

	List<Brand> brands;

	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>();
		brands.add(new Brand(1, "BMW"));
		brands.add(new Brand(2, "MERCEDES"));
		brands.add(new Brand(3, "AUDI"));
		brands.add(new Brand(4, "FİAT"));
		brands.add(new Brand(5, "RENAULT"));
	}

	@Override
	public List<Brand> getAll() {
		return brands;
	}

}
