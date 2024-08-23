    About LinkedLists
    -----------------------

    Unlike arrays, linked lists can grow or shrink automatically.
    A linked list consist of a group of nodes in sequence,each node
    holds two pieces of data, one is the value and the other one is the address of the next node in the list.
    So we say each node points or reference the next node in the list
    that is why we call them linked lists because these nodes are linked together.
    The first node is the head and the last node the tail.

    RunTime Complexity
    -----------------------

    LookUp-By Value:
    I want to find if the list contains a given number.I must traverse the list starting from the head
    all the way to the tail.
    So if the value that i am looking for is in the last node the complexity(worse case) will be O(n).

    LookUp-By Index:
    Unlike arrays where items are stored sequentially the nodes of the linked list can be all over the place in memory
    that's why each node needs to keep a reference to the next node.
    For this reason unlike arrays, we can not quickly look up an item by its index, we have to traverse the list 
    until we find that item .
    In the worst case scenario, the item can be at the end of the list so the runtime complexity will be O(n).

    Insert at the End:
    If we want to insert an item at the end we simply need to create a new node and have the last node called the tail point to it.
    So the runtime complexity is O(1)

    Insert at the Beginning:
    We should have a reference to the head or the first node so to insert a new item at the beginning of the list, we create
    a new node link to the first node and change the head to point at this node.
    Unlike arrays, we don't have to copy and shift items around, so the runtime complexity will be O(1).

    Insert somewhere in the middle:
    First we have to find that node that's an O(n) operation,
    and then we have to update the links which is an O(1) operation,
    so inserting an item in the middle is an O(n) operation.

    Delete from the Beginning:
    We simple move the head to point to the second node O(1) and also must unlink this object from the second object.

    Delete it from the End:
    We can easily get the tail, but we need to know the previous node,
    so we can have the tail point to this, which means that we have to traverse the list from the head all the way to the tail.
    As soon as we get to the node before the last node, we keep a reference to it as the previous node, then we will unlink 
    this node from the last node and point the tail to this previous node, so the runtime complexity is O(n).
    
    Delete it from the Middle:
    Again we have to traverst the list to find the node as well as its previous node, we
    should link the previous node to the node after this (the node that will be removed) and then 
    remove this link so this object gets removed from memory by java's garbage collector.
    Again we have O(n) operation runtime complexity.



    

 
