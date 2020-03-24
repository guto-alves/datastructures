def insertNodeAtTail(head, data):
    if head == None:
        head = SinglyLinkedListNode(data)
    else:
        tail = head

        while tail.next != None:
            tail = tail.next

        tail.next = SinglyLinkedListNode(data)

    return head