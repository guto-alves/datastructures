def reversePrint1(head):
    data = []

    tail = head

    data.append(tail.data)

    while tail.next != None:
        tail = tail.next
        data.append(tail.data)

    for i in range(len(data) - 1, -1, -1):
        print(data[i])


def reversePrint2(head):
    if not head:
        return

    reversePrint2(head.next)
    print(head.data)