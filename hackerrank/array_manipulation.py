def arrayManipulation(n, queries):
    array = [0] * n

    for a, b, k in queries:
        array[a - 1] += k

        if b != len(array):
            array[b] -= k

    max_val = 0
    itt = 0

    for i in array:
        itt += i

        if itt > max_val:
            max_val = itt

    return max_val

nm = input().split()

n = int(nm[0])

m = int(nm[1])

queries = []

len(queries)

for _ in range(m):
    queries.append(list(map(int, input().rstrip().split())))

result = arrayManipulation(n, queries)

print(result)