def handshake(n):
    handshakes = 0
    for i in range(n - 1, 0, -1):
        handshakes += i
    return handshakes

assert handshake(1) == 0
assert handshake(2) == 1
