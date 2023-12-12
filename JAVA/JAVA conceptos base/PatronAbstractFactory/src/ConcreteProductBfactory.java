
public class ConcreteProductBfactory implements Abstractfactory{

	@Override
	public AbstractProduct createAbstractProduct() {
		// TODO Auto-generated method stub
		return new ProductoB();
	}

}