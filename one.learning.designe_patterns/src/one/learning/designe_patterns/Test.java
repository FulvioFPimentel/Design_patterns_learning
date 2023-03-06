package one.learning.designe_patterns;

import one.learning.designe_patterns.singleton.SingletonEager;
import one.learning.designe_patterns.singleton.SingletonLazy;
import one.learning.designe_patterns.singleton.SingletonLazyHolder;

public class Test {

	public static void main(String[] args) {
		
		 SingletonLazy lazy = SingletonLazy.getInstance();
		 System.out.println(lazy);
		 lazy = SingletonLazy.getInstance();
		 System.out.println(lazy);
		 
		 SingletonEager eager = SingletonEager.getInstance();
		 System.out.println(eager);
		 eager = SingletonEager.getInstance();
		 System.out.println(eager);
		 SingletonEager eager1 = SingletonEager.getInstance();
		 System.out.println(eager1);
		 
		 SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
		 System.out.println(lazyHolder);
		 lazyHolder = SingletonLazyHolder.getInstance();
		 System.out.println(lazyHolder);
		
	}

}
