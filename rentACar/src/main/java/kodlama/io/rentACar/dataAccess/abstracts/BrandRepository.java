package kodlama.io.rentACar.dataAccess.abstracts;

import java.util.List;



import kodlama.io.rentACar.entities.concretes.Brand;

// veritabanı işlemlerini içeren sınıflarda isimlendirme için DAO gibi REPOSİTORY de kullanılabilir


public interface BrandRepository {
  List<Brand> getAll();
  
  
	
}
