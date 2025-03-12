class Cola:
    def __init__(self, n):
        self.__arreglo = [0] * (n + 1)
        self.__inicio = 0
        self.__fin = 0
        self.__n = n

    def insert(self, e):
        if self.__fin == self.__n:
            print("Cola llena")
        else:
            self.__fin += 1
            self.__arreglo[self.__fin] = e

    def remove(self):
        if self.__inicio == 0 and self.__fin == 0:
            print("Cola vacia")
            return None
        else:
            self.__inicio += 1
            dato = self.__arreglo[self.__inicio]
            if self.__inicio == self.__fin:
                self.__inicio = 0
                self.__fin = 0
            return dato

    def peek(self):
        return self.__arreglo[self.__inicio + 1]

    def isEmpty(self):
        return self.__inicio == 0 and self.__fin == 0

    def isFull(self):
        return self.__fin == self.__n

    def nroelem(self):  # size
        aux = Cola(self.__n)
        contador = 0
        while not self.isEmpty():
            dato = self.remove()
            aux.insert(dato)
            contador += 1

        while not aux.isEmpty():
            dato = aux.remove()
            self.insert(dato)
        return contador

    def nroelem2(self):  # size
        return self.__fin - self.__inicio

    def separar_primos_y_no_primos(self):
        cola_primos = Cola(self.__n)
        cola_no_primos = Cola(self.__n)
        
        while not self.isEmpty():
            dato = self.remove()
            if self.es_primo(dato):
                cola_primos.insert(dato)
            else:
                cola_no_primos.insert(dato)

        return cola_primos, cola_no_primos

    def es_primo(self, num):
        if num < 2:
            return False
        for i in range(2, int(num**0.5) + 1):
            if num % i == 0:
                return False
        return True

    def mostrar(self):

        elementos = []
        for i in range(1, self.__fin + 1):
            elementos.append(self.__arreglo[i])
        return elementos

n = 30
q = Cola(n)

numeros_a_insertar = +[13, 22, 7]
for numero in numeros_a_insertar:
    q.insert(numero)


print("A:", q.mostrar())

cola_primos, cola_no_primos = q.separar_primos_y_no_primos()

print("B:", cola_primos.mostrar())

print("C:", cola_no_primos.mostrar())