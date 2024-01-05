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

        # 1 -> 2 -> 3
        if index > self.count:
            raise IndexError('linked list index out of range')
        
        new_node = Node(data=data)

        if index == 0:
            new_node.next = self.head
            self.head = new_node
        else:
            curr = self.head
            pos = 0
            while pos != (index - 1):
                curr = curr.next
                pos += 1
            
            new_node.next = curr.next
            curr.next = new_node

        self.count += 1

    def update_node(self, data, index):
        # 1 -> 2 -> 3
        pos = 0

        if index == pos:
            self.head.data = data
        else:
            curr = self.head
            while pos != index:
                pos += 1
                curr = curr.next
            if curr is None:
                raise IndexError('Index out of bounds')
            else:
                curr.data = data

    def delete_at_beginning(self):
        if self.head is None:
            print('List is empty')
        else:
            self.head = self.head.next

    def delete_at_end(self):
        # 1 -> 2 -> 3
        if self.head is None:
            print("List is empty")
        else:
            curr = self.head
            if curr.next is None:
                self.head = None
            else:
                while curr.next.next:
                    curr = curr.next
                curr.next = None

    def print(self):
        current_node = self.head
        while current_node != None:
            print(current_node.data, end=' ')
            current_node = current_node.next
        print()

if __name__ == '__main__':
    llist = LinkedList()

    llist.insert_at_beginning(1)
    llist.insert_at_end(2)
    llist.insert_at_index(10, 0)
    llist.insert_at_index(20, 2)
    llist.insert_at_index(30, 3)

    print('Before update')
    llist.print()

    print('After update')
    llist.update_node(60, 3)
    llist.print()

    print('Delete at beginning')
    llist.delete_at_beginning()
    llist.print()

    print('Delete at end')
    llist.delete_at_end()
    llist.print()