package exceptions;
//: exceptions/StormyInning.java
// Overridden methods may throw only the exceptions
// specified in their base-class versions, or exceptions
// derived from the base-class exceptions.
// 覆盖的方法可能只会抛出它们的基类版本中指定的异常，或者从基类异常派生出的异常

@SuppressWarnings("serial")
class BaseballException extends Exception {}

@SuppressWarnings("serial")
class Foul extends BaseballException {}

@SuppressWarnings("serial")
class Strike extends BaseballException {}

abstract class Inning {
	
	public Inning() throws BaseballException {}
	
	public void event() throws BaseballException {
		// Doesn't actually have to throw anything.
		// 实际上不需要扔任何东西
	}
	
	public abstract void atBat() throws Strike, Foul;
	
	public void walk() {} // Throws no checked exceptions. 不抛出检查异常
	
}

@SuppressWarnings("serial")
class StormException extends Exception {}

@SuppressWarnings("serial")
class RainedOut extends StormException {}

@SuppressWarnings("serial")
class PopFoul extends Foul {}

interface Storm {
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
	
	// OK to add new exceptions for constructor, but you
	// must deal with base constructor exceptions.
	// 可以为构造器添加新的异常，但是您必须处理基底构造函数异常
	public StormyInning() throws BaseballException, RainedOut {}
	
	public StormyInning(String s) throws Foul, BaseballException{}
	
	// Regular methods must conform to base class:
	// 常规方法必须符合基类:
	//! void walk() throws PopFoul {} //Compile error
	
	// Interface CANNOT add exceptions to existing
	// methods from the base class:
	// 接口不能从基类中添加现有方法的异常:
	//! public void event() throws RainedOut {}
	
	// If the method dosen't already exist in the
	// base class, the exception is OK:
	// 如果这个方法在基类中还不存在，那么例外是可以的:
	@Override
	public void rainHard() throws RainedOut {}
	
	// You can choose to not throw any exceptions,
	// even if the base version does:
	// 您可以选择不抛出任何异常，即使基本版本是这样做的:
	@Override
	public void event() {}
	
	// Overridden methods can throw inherited exceptions:
	// 覆盖的方法可以抛出继承的异常:
	@Override
	public void atBat() throws PopFoul {}
	
	public static void main(String[] args) {
		try {
			StormyInning si = new StormyInning();
			si.atBat();
		} catch (PopFoul e) {
			System.out.println("Pop foul");
		} catch (RainedOut e) {
			System.out.println("Rained out");
		} catch (BaseballException e) {
			System.out.println("Generic baseball exception");
		}
		// Strike not thrown in derived version.
		// 未抛出的派生版本.
		try {
			// What happens if you upcast?
			// 如果你向上转型会发生什么?
			Inning i = new StormyInning();
			i.atBat();
			// You must catch the exceptions from the 
			// base-class version of the method:
			// 您必须从该方法的基类版本中捕获异常:
		} catch (Strike e) {
			System.out.println("Strike");
		} catch (Foul e) {
			System.out.println("Foul");
		} catch (RainedOut e) {
			System.out.println("Rained out");
		} catch (BaseballException e) {
			System.out.println("Generic baseball exception");
		}
	}

}/*Output:

*///:~
