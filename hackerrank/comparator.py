class Player:
    def __init__(self, name, score):
        self.name = name
        self.score = score

    def __repr__(self):
        print(name, ' ', score)

    def comparator(a, b):
        if a.score == b.score:
            if a.name == b.name:
                return 0
            return 1 if a.name > b.name else -1
        return -1 if a.score > b.score else 1