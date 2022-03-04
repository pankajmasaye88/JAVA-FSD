package springhibintegration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductServiceImple implements ProductService {

	
	
	@Autowired
	private EProductDAO eproductdao;
	
	public List<EProductEntity> getAllProducts() {
		
			
		return eproductdao.getAllProducts();
	}

}