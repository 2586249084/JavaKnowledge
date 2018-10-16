package exceptions;
//: exceptions/DynamicFields.java
// A class that dynamically adds fields to itself.
// 一个动态地将字段添加到自身的类
// Demonstrates exception chaining.
// 显示异常链

import static util.Print.*;

class DynamicFieldsException extends Exception {

	private static final long serialVersionUID = 1L;
	
}

public class DynamicFields {
	
	private Object[][] fields;
	
	public DynamicFields(int initialSize) {
		fields = new Object[initialSize][2];
		for (int i = 0; i < initialSize; i++)
			fields[i] = new Object[]{null, null};
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Object[] object : fields) {
			result.append(object[0]);
			result.append(": ");
			result.append(object[1]);
			result.append("\n");
		}
		return result.toString();
	}
	
	private int hasField(String id) {
		for (int i = 0; i < fields.length; i++)
			if (id.equals(fields[i][0]))
				return i;
		return -1;
	}
	
	private int getFieldNumber(String id) throws NoSuchFieldException {
		int fieldNum = hasField(id);
		if (fieldNum == -1)
			throw new NoSuchFieldException();
		return fieldNum;
	}
	
	private int makeField(String id) {
		for (int i = 0; i < fields.length; i++)
			if (fields[i][0] == null) {
				fields[i][0] = id;
				return i;
			}
		// No empty fields.Add one:
		// 没有空字段.添加一个:
		Object[][] tmp = new Object[fields.length + 1][2];
		for (int i = 0; i < fields.length; i++)
			tmp[i] = fields[i];
		for (int i = fields.length; i < tmp.length; i++)
			tmp[i] = new Object[] {null, null};
		fields = tmp;
		// Recursive call with expanded fields:
		// 扩展字段的递归调用
		return makeField(id);
	}
	
	public Object getField(String id) throws NoSuchFieldException {
		return fields[getFieldNumber(id)][1];
	}
	
	public Object setField(String id, Object value) throws DynamicFieldsException {
		if (value == null) {
			// Most exceptions don't have a "cause" constructor.
			// 大多数例外都没有"cause"构造函数.
			// In these cases you must use initCause(),
			// available in all Throwable subclasses.
			// 在这些情况下，您必须使用initCause()，在所有可抛出的子类中都可用.
			DynamicFieldsException dfe = new DynamicFieldsException();
			dfe.initCause(new NullPointerException());
			throw dfe;
		}
		int fieldNumber = hasField(id);
		if (fieldNumber == -1)
			fieldNumber = makeField(id);
		Object result = null;
		try {
			result = getField(id); // Get old value 获取旧数据
		} catch (NoSuchFieldException error) {
			// Use constructor that takes "cause":
			// 使用"cause"的构造函数:
			throw new RuntimeException();
		}
		fields[fieldNumber][1] = value;
		return result;
	}
	
	public static void main(String[] args) {
		DynamicFields df = new DynamicFields(3);
		println(df);
		try {
			df.setField("d", "A value for d");
			df.setField("number", 47);
			df.setField("number2", 48);
			println(df);
			df.setField("d", "A new value for d");
			df.setField("number3", 11);
			println("df : " + df);
			println("df.getField(\'d\') : " + df.getField("d"));
			@SuppressWarnings("unused")
			Object field = df.setField("d", null); // Exception
		} catch (NoSuchFieldException error) {
			error.printStackTrace(System.out);
		} catch (DynamicFieldsException error) {
			error.printStackTrace(System.out);
		}
	}
	
}/*Output:
null: null
null: null
null: null

d: A value for d
number: 47
number2: 48

df : d: A new value for d
number: 47
number2: 48
number3: 11

df.getField('d') : A new value for d
exceptions.DynamicFieldsException
	at exceptions.DynamicFields.setField(DynamicFields.java:81)
	at exceptions.DynamicFields.main(DynamicFields.java:113)
Caused by: java.lang.NullPointerException
	at exceptions.DynamicFields.setField(DynamicFields.java:82)
	... 1 more
*///:~
