package om.collection.hashset.example8;

import java.util.HashSet;

class Amazon {

	String productName;
	double productPrice;
	int ItemInkart;

	Amazon(String productName, double productPrice, int ItemInkart) {

		this.productName = productName;
		this.productPrice = productPrice;
		this.ItemInkart = ItemInkart;

	}

	/*
	 * When a class inherits hashCode() from Object, it simply inherits the
	 * implementation of Object.hashCode().
	 * 
	 * Object.hashCode() is a native method implemented by the JVM/runtime. When
	 * called, the JVM generates/provides an int hash value for that object.
	 * 
	 * It does not take an attribute as input and it does not automatically inspect
	 * the object's fields.
	 */

	@Override
	public int hashCode() {

		return this.productName.hashCode() + Double.hashCode(this.productPrice) + Integer.hashCode(this.ItemInkart);

		/*
		 * int, double, float and long are primitive so they don't have any mothods
		 * like(hashCode(), Contain(), get();..... etc)
		 */

		/*
		 * The reason we use Double.hashCode(this.productPrice) and
		 * Integer.hashCode(this.ItemInkart) is that productPrice and ItemInkart are
		 * primitive data types (double and int), and primitive data types do not have
		 * methods like hashCode(). Therefore, we cannot write
		 * this.productPrice.hashCode() or this.ItemInkart.hashCode(). Java provides
		 * wrapper classes such as Double and Integer, which contain static hashCode()
		 * methods to calculate the hash value of the corresponding primitive value.
		 * However, we can directly write this.productName.hashCode() because
		 * productName is a String, and String is a class (object/reference type), not a
		 * primitive data type. The String class already overrides the hashCode()
		 * method, so we can call hashCode() directly on a String object.
		 */

	}

	/*
	 * This equals() method is checking whether two Amazon objects are logically
	 * equal based on their attributes. When you call kart1.equals(kart2), this
	 * refers to kart1, while obj refers to kart2. The statement Amazon items =
	 * (Amazon) obj converts the Object reference into an Amazon reference so that
	 * its fields can be accessed. Then the method compares the productName,
	 * productPrice, and ItemInkart of both objects. If all three values are equal,
	 * the method returns true, meaning both objects are logically equal; if even
	 * one value is different, it returns false.
	 */
	@Override
	public boolean equals(Object obj) {

		Amazon items = (Amazon) obj;
		return this.productName.equals(items.productName) && this.productPrice == items.productPrice
				&& this.ItemInkart == items.ItemInkart;

	}
}

public class Example8 {

	public static void main(String[] args) {

		HashSet<Amazon> item = new HashSet<Amazon>();

		Amazon kart1 = new Amazon("iphone16", 355.00, 3);
		Amazon kart2 = new Amazon("iphone16", 355.00, 3);
		Amazon kart3 = new Amazon("iphone16", 355.00, 3);
		Amazon kart4 = new Amazon("iphone16", 355.00, 3);
		Amazon kart5 = new Amazon("iphone16", 355.00, 3);
		Amazon kart6 = new Amazon("iphone16", 355.00, 3);

		item.add(kart1);
		item.add(kart2);
		item.add(kart3);
		item.add(kart4);
		item.add(kart5);
		item.add(kart6);

		System.out.println(item);
		System.out.println(kart1.hashCode());
		System.out.println(kart2.hashCode());
		System.out.println(kart3.hashCode());
		System.out.println(kart4.hashCode());
		System.out.println(kart5.hashCode());
		System.out.println(kart6.hashCode());

	}

}
