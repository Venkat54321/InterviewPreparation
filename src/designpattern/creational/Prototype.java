package designpattern.creational;

/**
 * It would be leetcode.array.easy to understand prototype design pattern with an example.
 * Suppose we have an Object that loads data from database.
 * Now we need to modify this data in our program multiple times, so it’s not a good idea to
 * create the Object using new keyword and load all the data again from database.
 * The better approach would be to clone the existing object into a new object and then do the
 * data manipulation. Prototype design pattern mandates that the Object which you are copying
 * should provide the copying feature. It should not be done by any other class.
 * However whether to use shallow or deep copy of the Object properties depends on the
 * requirements and its a design decision. Here is a sample program showing Prototype
 * design pattern example in java. Employees.java
 */
public class Prototype {
}
