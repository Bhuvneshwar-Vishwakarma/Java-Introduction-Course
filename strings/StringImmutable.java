package strings;

public class StringImmutable {

	
	/*    https://www.geeksforgeeks.org/java-string-is-immutable-what-exactly-is-the-meaning/
Why String is Immutable or Final in Java

Almost every method, applied to a String object in order to modify it, creates new String object. So, 
where do these String objects go? Well, these exist in memory, and one of the key goals of any programming language is 
to make efficient use of memory.

As applications grow, it’s very common for String literals to occupy large area of memory, which can even cause redundancy. 
So, in order to make Java more efficient, the JVM sets aside a special area of memory called the “String constant pool“.

When the compiler sees a String literal, it looks for the String in the pool. If a match is found, the reference to the 
new literal is directed to the existing String and no new String object is created. The existing String simply has one more reference. 
Here comes the point of making String objects immutable:

In the String constant pool, a String object is likely to have one or many references. If several references point to same String without even knowing it, 
it would be bad if one of the references modified that String value. That’s why String objects are immutable.

*********************************************************************************************
 
The string is Immutable in Java because String objects are cached in the String pool. 
Since cached String literals are shared between multiple clients there is always a risk, 
where one client's action would affect all another client. For example, 
if one client changes the value of the String "Test" to "TEST", all other clients will also 
see that value as explained in the first example. Since caching of String objects was important 
from performance reason this risk was avoided by making String class Immutable. At the same time, 
String was made final so that no one can compromise invariant of String class like Immutability, 
Caching, hashcode calculation, etc by extending and overriding behaviors. Another reason why String class 
is immutable could die due to HashMap.


Since Strings are very popular as the HashMap key, it's important for them to be immutable so that they 
can retrieve the value object which was stored in HashMap. Since HashMap works in the principle of hashing, 
which requires the same has value to function properly. Mutable String would produce two different hashcodes 
at the time of insertion and retrieval if contents of String was modified after insertion, potentially losing 
the value object in the map.


*/
	
	
	
	
	
	
	
	
	
}
