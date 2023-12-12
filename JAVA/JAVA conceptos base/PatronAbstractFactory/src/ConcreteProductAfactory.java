
public class ConcreteProductAfactory implements Abstractfactory{

	@Override
	public AbstractProduct createAbstractProduct() {
		// TODO Auto-generated method stub
		return new ProductoA();
	}

}
