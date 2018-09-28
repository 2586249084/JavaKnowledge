package interfaces;
//: interfaces/RandVals.java
// Initializing interface fields with
// non-constant initializers.
// 用非常量初始化器初始化接口字段

import java.util.*;

public interface RandVals {
	Random RAND = new Random(47);
	int RANDOM_INT = RAND.nextInt(10);
	long RANDOM_LONG = RAND.nextLong() * 10;
	float RANDOM_FLOAT = RAND.nextFloat() * 10;
	double RANDOM_DOUBLE = RAND.nextDouble() * 10;
}
