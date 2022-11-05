package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "brands")
@Data // getter ve setterları oluşturur (sadece getter için @getter ve sadece setter için @setter kullanılır)
@AllArgsConstructor // parametreli constructor oluşturur
@NoArgsConstructor // parametresiz consructor
@Entity
public class Brand {

	@Id // primary key anlamında
	@GeneratedValue(strategy = GenerationType.IDENTITY) // id yi bir bir otomatik arttırma
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

}
