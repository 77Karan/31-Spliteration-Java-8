package pack1;

import java.util.Arrays;
import java.util.List;

import pack2.Demo1;

public class SpliteratorDemo1 
{
	public static void main(String[] args)
	{
		
		/*
		 * List<String> names =
		 * Arrays.asList("Virat","Rohit","Kl Rahul","Rishab","Jaddu","Yuzi");
		 * 
		 * names.spliterator().forEachRemaining(n->System.out.println(n));
		 * System.out.println("=============or or or or===============");
		 * names.spliterator().forEachRemaining(System.out::println);
		 */
		 

		int[] arr = {123,345,1};
		Demo1 d1 = new Demo1();
		System.out.println(d1.numSpecial1(arr));
		
	}
	
	

}
