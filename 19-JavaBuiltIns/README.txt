Tianshi (Tyler) Wang

difference between the HashMap and HashSet:

HashMap:
implements the Map interface
utilize a put method
key-value based data structure
allows null for key and value (unlike hashtable)
faster since values are stored in unique keys

HashSets:
utilize an add method 
does not allow duplicate values (for unique lists)
implements the Set interface
does not gurantee constant order
key based data structure

TreeSet:
log(n) time performance
set is sorted
implements SortedSet


Between HashMaps and TreeMaps, HashMaps has a faster put and get speed.

Java has a built in Heap data structure but it's not named Heap
It is called Priority Queue


add(x) – adds a value to the heap
findMedian() - returns the current median
removeMedian() - returns and removes the current median (if the data set has an even number of items, return the average and remove the two median items).
you can add any support stuff you need

