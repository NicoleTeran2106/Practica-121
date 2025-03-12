import math
class Punto:
    def __init__(self, x:float, y:float):
        self.x=x
        self.y=y
    def cordenada(self):
        return (self.x, self.y)
    def polar(self): 
        r=math.sqrt(self.x**2+self.y**2)
        t=math.atan2(self.y, self.x)
        return (r,t)
    def __str__(self):
        return f"Punto({self.x}, {self.y})"
p=Punto(3,4)
print(p)
print(p.cordenada())
print(p.polar())