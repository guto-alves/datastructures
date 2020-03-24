def reverseArray(a):
    return [a[i] for i in range(len(a) - 1, -1, -1)]

arr_count = int(input())

arr = list(map(int, input().rstrip().split()))

res = reverseArray(arr)

print(' '.join(map(str, res)))