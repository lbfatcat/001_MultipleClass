public class MultipleClass
{
	ClassOne cls_one;
	ClassTwo cls_two;

	MultipleClass(int one, int two)
	{
		System.out.println("start printing for the two classes: ");
		cls_one= new ClassOne(one);
		cls_two= new ClassTwo(two);
	}

	public static void main(String [] args)
	{
		System.out.println("This is the main in the MulipleClass");
		new MultipleClass(1,2);
		return;
	}
}

class ClassOne
{
	ClassOne(int i)
	{
		System.out.println("print Class One: NO."+i);
	}
}

class ClassTwo
{
	ClassTwo(int i)
	{
		System.out.println("print Class Two: NO."+i);
	}
}
