package proxy.dahuashejims.common;

public class RealSubject implements Subject{

	@Override
	public void request() {
		System.out.println("RealSubject");
	}

}
