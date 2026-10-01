# assginment

## 1.Strings in Java and major operations
- A String in Java is used to store text. The text is written inside double quotes.
- eg. String hello = "Hello";
- A String is an object, so it has many methods that do things of us. For example, length() tells us how many characters there are, and toUpperCase() and toLowerCase() change the letters to capital or small.
- We can also search and cut strings. indexOf() finds where a piece of text starts, counting from 0, and substring() takes out a part of the string. To compare strings we use equals(), and to swap some text for other text we use replace().

## 2.Linear and non-linear data stuctures
- A data structure is a way of organizing data so that we can store and use it easily. Good data structures make programs faster and easier to reuse.
- In Java, there are two types. Linear data structures keep their elements in a line, one after another. Arrays, ArrayLists, LinkedLists, stacks and queues are all linear.
- Non-linear data structures do not keep elements in a single line. Instead, they are organized like a hierarchy.

## 3.Arrays and matrices
- An array stores several values of the same type in one place. Each value has a number called an index, and the first index is 0.
- eg. int[] nums = {1, 2, 3, 4, 5}; create an array with five numbers.
- A matrix is a table of values with rows and columns. In Java, we make it with a two-dimensional array, which is an array that contains other arrays.
- eg. int[][] matrix = {{1, 2, 3}, {4, 5, 6}};it has two rows and three columns.

## 4.ArrayList and its difference from array
- An ArrayList is a list that can change its size. We can add new items with add(), read an item with get(), change an item with set(), and delete items with remove() or clear().
- The main difference from an array is the size. When we create a normal array, its length is fixed and can't be changed. An ArrayList is more flexible, because it grows when we add items and shrinks when we remove them.

## 5.LinkedList
- A LinkedList is used in almost the same way as an ArrayList. Both are lists, so we can add, change and remove items with the same methods. The different is how they work inside. A LinkedList puts each item in its own small "container", and each container points to the next one, like a chain.
- Because of this, a LinkedList is handy for working at the beginning or end of the list, using methods like addFirst() and removeLast(). But if we often need to jump to random item, an ArrayList is usually the better choice.

## 6.HashSet and HashMap
- A HashMap stores data in pairs: a key and a value. Instead of finding an item by a number, we find it by its key.
- eg. if the key is "id" and the value is student's name "tom", then get("id") gives us "tom".
- A HashSet is a collection that doesn't allow the same item twice. If we add one "car" two times, the set keeps only one "car". We can use add() to put items in and contains() to check whether an item is there.

## 7.Stacks and their hierarchy
- A stack follows the last-in-first-out rule: the last item added is the first one removed. Java's Stack class uses push, pop and peek for this. In the class hierarchy, Stack is a subclass of Vector.

## 8. Queues
A queue works like people standing in a line. The first person who arrives is the first one to be served. In Java, Queue is an interface, so it needs a class like PriorityQueue or LinkedList to implement it.