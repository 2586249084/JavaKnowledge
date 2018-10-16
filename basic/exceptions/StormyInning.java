package exceptions;
//: exceptions/StormyInning.java
// Overridden methods may throw only the exceptions
// specified in their base-class versions, or exceptions
// derived from the base-class exceptions.
// ���ǵķ�������ֻ���׳����ǵĻ���汾��ָ�����쳣�����ߴӻ����쳣���������쳣

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
		// ʵ���ϲ���Ҫ���κζ���
	}
	
	public abstract void atBat() throws Strike, Foul;
	
	public void walk() {} // Throws no checked exceptions. ���׳�����쳣
	
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
	// ����Ϊ����������µ��쳣�����������봦����׹��캯���쳣
	public StormyInning() throws BaseballException, RainedOut {}
	
	public StormyInning(String s) throws Foul, BaseballException{}
	
	// Regular methods must conform to base class:
	// ���淽��������ϻ���:
	//! void walk() throws PopFoul {} //Compile error
	
	// Interface CANNOT add exceptions to existing
	// methods from the base class:
	// �ӿڲ��ܴӻ�����������з������쳣:
	//! public void event() throws RainedOut {}
	
	// If the method dosen't already exist in the
	// base class, the exception is OK:
	// �����������ڻ����л������ڣ���ô�����ǿ��Ե�:
	@Override
	public void rainHard() throws RainedOut {}
	
	// You can choose to not throw any exceptions,
	// even if the base version does:
	// ������ѡ���׳��κ��쳣����ʹ�����汾����������:
	@Override
	public void event() {}
	
	// Overridden methods can throw inherited exceptions:
	// ���ǵķ��������׳��̳е��쳣:
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
		// δ�׳��������汾.
		try {
			// What happens if you upcast?
			// ���������ת�ͻᷢ��ʲô?
			Inning i = new StormyInning();
			i.atBat();
			// You must catch the exceptions from the 
			// base-class version of the method:
			// ������Ӹ÷����Ļ���汾�в����쳣:
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
