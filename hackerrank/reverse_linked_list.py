def reverse(head):
    if head == None:
        return

    values = []

    while head != None:
        values.insert(0, head.data)
        head = head.next

    head = SinglyLinkedListNode(values[0])
    iterator = head

    for value in values[1:]:
        iterator.next = SinglyLinkedListNode(value)
        iterator = iterator.next

    return head