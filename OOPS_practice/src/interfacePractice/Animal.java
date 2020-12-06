package interfacePractice;

/* An Interface is collection of Abstract methods.
 * The java compiler adds public and abstract keywords before the interface method.
 * The java compiler adds public, static and final keyword before the interface variable.
 * So we can say that all variables are constant,no instance variable.
 * A class can inherit from just one superclass,but can implement multiple interfaces.
 * Method in an interface are implicity public.
 * interface can't create an object.
 */

public interface Animal {
	
	void eat();

}
