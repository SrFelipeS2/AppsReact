import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ComandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AbstractFactoryComponent implements ComandLineRunner {
	
	@Override
	public void run(String...args) throws Exeption{
		
		AbstractProduct ProductoA = AbstractProductFactory.getProduct(new ConcreteProductAfactory());
		AbstractProduct ProductoB = AbstractProductFactory.getProduct(new ConcreteProductBfactory());
		log.info("Method for product A config {}", ProductoA.comonMethod());
		log.info("Method for product B config {}", ProductoB.comonMethod());
	}

}
