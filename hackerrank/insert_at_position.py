def insertNodeAtPosition(head, data, position):
    current = head

    for i in range(position - 1):
         current = current.next

    new_node = SinglyLinkedListNode(data)
    new_node.next = current.next
    current.next = new_node

    return head
