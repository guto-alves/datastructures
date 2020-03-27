def printLinkedList(head):
	if not head:
        return

    print(head.data)
    printLinkedList(head.next)