from Colas import Cola
cola = Cola(3)
cola.insert(10)
cola.insert(20)
cola.insert(30)
print("Elemento al frente:", cola.peek())
print("Sacando elemento:", cola.remove())
print("Elemento al frente:", cola.peek())
print("Cola vacía", cola.isEmpty())
print("Cola llena", cola.isFull())
print("Tamaño de la cola:", cola.getSize())