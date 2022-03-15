# Stacks and Queues
 ### Create Stacks and Queue using LinkedList and manipulate it.

## Challenge
### Stack writing methods to push elements in the stack, pop from it , print the top element and check if the stack empty .

### Queues writing methods to enqueue elements in the queues, dequeue from it , print the top element and check if the queues empty .

## Approach & Efficiency
### There are three main classes ( Node , stack, queue ), each Node has two fields (value, next node) and the stack has one field which is the (top node) top will pointing always to the last node of the stack,which it's follow FILO principle when you need to push value to stack, it will take the top place and pointing to the new top. The time complexity of inserting a value is : O(1)

### and the queue has two field which is the (front,back) front will pointing always to the first node of the stack,and back will pointing always to the last node of the stack which it's follow FIFO principle when you need to insert value to queue, it will take the back place and pointing to the new node.

# API
## Stack

* push(value): will insert the passed value as a new top of the stack and make top next pointer on the new node.

* pop():will pop always the top value and we will use tepm node

* peek(): will print out the top value.

* isEmpty():return true if it empty and false if not

## Queue

* enqueue(value): will insert the passed value as a new back value of the queue .

* dequeue():will dequeue always the back value.

* peek(): will print out the first value.

* isEmpty():return true if it empty and false if not.

# [My Code](https://github.com/hashem98/data-structures-and-algorithms/tree/main/Java/stackandQueue)