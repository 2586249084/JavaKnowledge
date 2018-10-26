package util;
// util/Tuple.java

// Tuple library using type argument inference.
// 使用类型参数推理的元组库.

public class Tuple {

	public static <First, Second> TwoTuple<First, Second> tuple(First first, Second second) {
		return new TwoTuple<First, Second>(first, second);
	}

	public static <First, Second, Third> ThreeTuple<First, Second, Third> tuple(First first, Second second,
			Third third) {
		return new ThreeTuple<First, Second, Third>(first, second, third);
	}

	public static <First, Second, Third, Fourth> FourTuple<First, Second, Third, Fourth> tuple(First first,
			Second second, Third third, Fourth fourth) {
		return new FourTuple<First, Second, Third, Fourth>(first, second, third, fourth);
	}

	public static <First, Second, Third, Fourth, Fifth> FiveTuple<First, Second, Third, Fourth, Fifth> tuple(
			First first, Second second, Third third, Fourth fourth, Fifth fifth) {
		return new FiveTuple<First, Second, Third, Fourth, Fifth>(first, second, third, fourth, fifth);
	}

} ///:~
