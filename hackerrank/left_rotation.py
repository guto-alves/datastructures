nd = input().split()

n = int(nd[0])

d = int(nd[1])

a = list(map(int, input().rstrip().split()))

rotations_count = 0
while rotations_count < d:
    element = a[0]
    del a[0]
    a.append(element)
    rotations_count += 1

for element in a:
        print(element, end=' ')