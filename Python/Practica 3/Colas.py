class Cola:
    def __init__(self, n):
        self.n = n
        self.arreglo = [None] * n
        self.inicio = 0
        self.fin = -1
        self.size = 0
    def insert(self, e):
        if not self.isFull():
            self.fin = (self.fin + 1) % self.n
            self.arreglo[self.fin] = e
            self.size += 1
        else:
            print("La cola está llena.")
    def remove(self):
        if not self.isEmpty():
            elemento = self.arreglo[self.inicio]
            self.inicio = (self.inicio + 1) % self.n
            self.size -= 1
            return elemento
        else:
            print("La cola está vacía.")
            return None
    def peek(self):
        if not self.isEmpty():
            return self.arreglo[self.inicio]
        return None
    def isEmpty(self):
        return self.size == 0
    def isFull(self):
        return self.size == self.n
    def getSize(self):
        return self.size