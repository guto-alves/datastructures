def sockMerchant(n, ar):
    socks = set()

    pairs = 0

    for sock in ar:
        if sock in socks:
            socks.remove(sock)
            pairs += 1
        else:
            socks.add(sock)

    return pairs

assert sockMerchant(5, [1, 1, 2, 2, 3]) == 2
assert sockMerchant(9, [10, 20, 20, 10, 10, 30, 50, 10, 20]) == 3