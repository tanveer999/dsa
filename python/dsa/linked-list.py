class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
    
class LinkedList:
    count = 0

    def __init__(self):
        self.head = None

    def insert_at_beginning(self, data: int):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            # self.count += 1
        else:
            new_node.next = self.head
            self.head = new_node
        self.count += 1
    
    def insert_at_end(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            self.count += 1
        else:
            current_node = self.head
            while current_node.next is not None:
                current_node = current_node.next
            current_node.next = new_node
            self.count += 1

    def insert_at_index(self, data, index):
        if index > self.count:
            raise IndexError('linked list index out of range')

    def print(self):
        current_node = self.head
        while current_node != None:
            print(current_node.data, end=' ')
            current_node = current_node.next
        print()

llist = LinkedList()

llist.insert_at_beginning(1)
llist.insert_at_end(2)
llist.insert_at_index(3, 2)

print('len of llist: ', llist.count)
llist.print()