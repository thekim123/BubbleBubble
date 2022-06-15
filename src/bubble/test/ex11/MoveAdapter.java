package bubble.test.ex11;

// 어댑터 -> 걸러내는 역할
public abstract class MoveAdapter implements Moveable {

	// 이렇게해서 상속 받게 하면 down을 배제하고 사용할 수 있다.
	@Override
	public void down() {}
	
}
