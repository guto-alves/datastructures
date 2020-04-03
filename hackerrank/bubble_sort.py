def countSwaps(a):
    numSwaps = 0
    for i in range(n - 1):
        for j in range(i + 1, n):
            if a[i] > a[j]:
                a[j], a[i] = a[i], a[j]
                numSwaps += 1

    print(f'Array is sorted in {numSwaps} swaps.')
    print(f'First Element: {a[0]}')
    print(f'Last Element: {a[len(a) - 1]}')
