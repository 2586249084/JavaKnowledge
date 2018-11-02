package generics;
//: generics/Wildcards.java
// Exploring the meaning of wildcards.
// ̽��ͨ����ĺ���.

public class Wildcards {
	
	// Raw argument:
	// ԭʼ����:
	@SuppressWarnings("rawtypes")
	static void rawArgs(Holder holder, Object arg) {
		// Warning:Unchecked call to set(T) as a
		// member of the raw type Holder
		// ����:δѡ�еĵ��ã���set(T)��Ϊԭʼ���ͳ����ߵĳ�Ա
		// holder.set(arg);
		// holder.set(new Wildcards());
		
		// Can't do this; don't have any 'T':
		// ������ô��;û��T:
		// T t = holder.get();
		
		// OK, but type information has been lost:
		// �õģ�����������Ϣ�Ѿ���ʧ��:
		// Object ocj = holder.get();
	}
	
	// Similar to rawType(), but errors instead of warning:
	// ������rawType()�����Ǵ�������Ǿ���:
	static void unboundedArg(Holder<?> holder, Object arg) {
		// Error:set(capture of ?) in Holder<capture of ?>
		// cannot be applied to (Object)
		// ����:Holder<capture of ?>�е�set(capture of ?)����Ӧ����(Object)
		// holder.set(arg);
		// holder.set(new Wildcards());
		
		
		// Can't do this; don't have any 'T':
		// ������ô��;û��T:
		// T t = holder.get();
		
		// OK, but type information has been lost:
		// �õģ�����������Ϣ�Ѿ���ʧ��:
		// Object obj = holder.get();
	}
	
	static <T> T exact1(Holder<T> holder) {
		T t = holder.get();
		return t;
	}
	
	static <T> T exact2(Holder<T> holder, T arg) {
		holder.set(arg);
		T t = holder.get();
		return t;
	}
	
	static <T> T wildSubtype(Holder<? extends T> holder, T arg) {
		// Error:set(capture of ? extends T) in Holder<capture
		// of ? extends T> cannot be applied to (T)
		// set(capture of ? extends T)��Holder<capture of ? extends T>�в���Ӧ����(T)
		// holder.set(arg);
		T t = holder.get();
		return t;
	}
	
	static <T> void wildSupertype(Holder<? super T> holder, T arg) {
		holder.set(arg);
		// T t = holder.get();
		
		// Object obj = holder.get();
	}

	@SuppressWarnings({"rawtypes", "unused"})
	public static void main(String[] args) {
		Holder raw = new Holder<Long>();
		// Or:����
		raw = new Holder();
		Holder<Long> qualified = new Holder<Long>();
		Holder<?> unbounded = new Holder<Long>();
		Holder<? extends Long> bounded = new Holder<Long>();
		Long lng = 1L;
		
		rawArgs(raw, lng);
		rawArgs(qualified, lng);
		rawArgs(unbounded, lng);
		rawArgs(bounded, lng);
		
		unboundedArg(raw, lng);
		unboundedArg(qualified, lng);
		unboundedArg(unbounded, lng);
		unboundedArg(bounded, lng);
		
		// Object r1 = exact1(raw); // Warning:
		// unchecked conversion from Holder to Holder<T>
		// unchecked method invocation : exact1(Holder<T>)
		// is applied to (Holder)
		// ����:δ���ת����Holder��Holder<T>��δ��鷽������:exact1(Holder<T>)Ӧ����(Holder)
		Long r2 = exact1(qualified);
		Object r3 = exact1(unbounded); // Must return Object
		Long r4 = exact1(bounded);
		
		// Long r5 = exact2(raw, lng); // Warning:
		// Unchecked conversion from Holder to Holder<Long>
		// Unchecked method invocation: exact2(Holder<T>, T)
		// is applied to (Holder, Long)
		Long r6 = exact2(qualified, lng);
		// Long r7 = exact2(unbounded,lng); // Error:
		// exact2(Holder<T>, T) cannot be applied to 
		// (Holder<capture of ?>, Long)
		// Long r8 = exact2(bounded, lng); // Error:
		// exact2(Holder<T>, T) cannot be applied
		// to (Holder<capture of ? extends Long>, Long)
		
		// Long r9 = wildSubtype(raw, lng); // Warning:
		// Unchecked conversion from Holder
		// to Holder<? extends Long>
		// Unchecked method invocation:
		// wildSubtype(Holder<? extends T>, T) is
		// applied to (Holder, Long)
		Long r10 = wildSubtype(qualified, lng);
		// OK, but can only return Object:
		Object r11 = wildSubtype(unbounded, lng);
		Long r12 = wildSubtype(bounded, lng);
		
		// wildSupertype(raw, lng); // Warning:
		// Unchecked conversion from Holder
		// to Holder<? super Long>
		// Unchecked method invocation:
		// wildSupertype(Holder<? super Long>, T)
		// is applied to (Holder, Long)
		wildSupertype(qualified, lng);
		// wildSupertype(unbounded, lng); // Error:
		// wildSupertype(Holder<? super T, T) cannot be
		// applied to (Holder<capture of ?>, Long)
		// wildSupertype(bounded, lng); // Error:
		// wildSupertype(Holder<? super T>, T) cannot be
		// applied to (Holder<capture of ? extends Long>, Long)
	}

} ///:~
