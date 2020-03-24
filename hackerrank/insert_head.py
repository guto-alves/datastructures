class SinglyLinkedListNode:
    def __init__(self, node_data):
        self.data = node_data
        self.next = None

class SinglyLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

def insertNodeAtHead(head, data):
    new_head = SinglyLinkedListNode(data)
    new_head.next = head
    return new_head
