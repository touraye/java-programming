# Array, ArrayList and Exception

Topics to cover:

* Array
* ArrayList
* Exception handling

# Array

Array in Java belongs non-primitives data type, Array are use to store multiples values of the same data type with a fix length, and the position items or elements on an Array are called index. Index start from `0`, reading items or elements you have go through their index. The number of elements or items on an Array is known by the `length` property.

Array are good choose if you want o store multiples values of the same type on a single variable. As we discussed earlier every variable can take a single value. 

How to create an Array in Java:

```java
String[] names = new String[5];
//or
String[] courses = {};
```

In the above code snippets we have seen two ways an Array can to created in Java, but what's the differentials the two. The first one with the `new` keyword is an declaration with a length of `5`, and the second one is with a `new` is initialization.

Adding items to an Array:

```java
//declaring an Array with fix legth
String[] names = new String[5];
names[0] = "lamin"
names[1] = "buba"
names[2] = "mariama"
names[3] = "amie"    
names[4] = "sally"
    
    
//initializing an Array
String courses = {"java", "web", "db", "python", "javascript"}
```

Well, we have seen two ways of adding elements or items to an Array. The first one we are using a square bracket and passing number in to it while the second one we just put values in a double quotation with a comma separated except the last item.

*Note in the first Array the length is 5, but the last item or elements is at position 4.*

### Accessing Elements on An Array and Length Property

When accessing or reading element from an we use square bracket `[]` and passing in the position of the item or element on an Array

```java
//declaring an Array with fix legth
String[] names = new String[5];
System.out.println(names);
// [Ljava.lang.String;@e9e54c2
names[0] = "lamin"
System.out.println(names[0])
// lamin
System.out.println(Arrays.toString(names));
// [lamin, null, null, null, null]    
System.out.println(names.length)
// 5

int[] num = new int[4];
System.out.println(Arrays.toString(num));
// [0, 0, 0, 0]

double[] amounts = new double[3];
amounts[2] = 9032.0;
System.out.println(Arrays.toString(amounts));
// [0.0, 0.0, 9032.0]
```

Arrays are access through their index. In the first print statement return a weird output `[Ljava.lang.String;@e9e54c2`. These output is reading the memory location of the Array.

We print the first element from the `names` Array which give us back 'lamin'. How if we want to read all the elements from an Array. Well, its pretty simple by using the `Arrays` class 
