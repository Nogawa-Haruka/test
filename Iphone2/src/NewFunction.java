
public interface NewFunction {
	public abstract void call();
	public abstract void mail();
	public abstract void photo();
	public abstract void internet();
	default void internet2(){
		System.out.println("インターネット2");
	}
}
