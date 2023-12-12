
public class AbstractProductFactory {

	public static AbstractProduct getProduct(Abstractfactory factory) {
		
		return factory.createAbstractProduct();
		
	}
	
	public static AbstractProduct getProductById(String id) {
		
		if("ProductoA".equals(id)) {
			
			return new ConcreteProductAfactory().createAbstractProduct();
			
		}
		else {
			
			return new ConcreteProductBfactory().createAbstractProduct();
			
		}
		
	}
}
