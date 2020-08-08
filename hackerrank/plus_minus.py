def plusMinus(arr):
    zeros = 0
    positives = 0
    negatives = 0
    
    for i in arr:
        if i == 0:
            zeros += 1
        elif i > 0:
            positives += 1
        else:
            negatives += 1
    
    print(f'{positives / len(arr):.6f}')
    print(f'{negatives / len(arr):.6f}')
    print(f'{zeros / len(arr):.6f}')
    
    
if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)