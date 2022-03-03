# Singly Linked List
### You can create Linked list and manipulate it.
## Challenge
### writing methods to insert elements in the list, search on specific elements and print the list as a string.

## Approach & Efficiency
### There are two main classes ( Node , LinkedList ), each Node has two fields (value, next node) and the LinkedList has one field which is the (head node) head will pointing always to the first node of the list, when you need to add value to list, it will take the head place and pointing to the old head. The time complexity of inserting a value is : O(1) The time complexity of search on a value is : O(n)
## API
### insert(value): will insert the passed value as a new head of the list and make its next pointer pointing on the old head. includes(value): will search through the list on the passed value, if it find the value .. the method will return true. else, will return false. toString(): will print out the whole linked list as a string to the user.