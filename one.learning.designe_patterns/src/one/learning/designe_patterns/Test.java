package one.learning.designe_patterns;

import one.learning.designe_patterns.strategy.AggressiveBehavior;
import one.learning.designe_patterns.strategy.Behavior;
import one.learning.designe_patterns.strategy.DefensiveBehavior;
import one.learning.designe_patterns.strategy.NormalBehavior;
import one.learning.designe_patterns.strategy.Robot;

public class Test {

	public static void main(String[] args) {
		
		/** Singleton
		
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
		 **/

		 // Strategy
		 
		 Behavior defencive = new DefensiveBehavior();
		 Behavior normal = new NormalBehavior();
		 Behavior aggressive = new AggressiveBehavior();
		 
		 Robot robot = new Robot();
		 
		 robot.setBehavior(normal);
		 robot.move();
		 robot.move();
		 robot.setBehavior(defencive);
		 robot.move();
		 robot.setBehavior(aggressive);
		 robot.move();
		 robot.move();
		 robot.move();
	}

}
