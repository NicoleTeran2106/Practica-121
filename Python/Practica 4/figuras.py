import math
class Figura:

    def area_circulo(self, radio):
        return math.pi * radio * radio


    def area_rectangulo(self, base, altura):
        return base * altura

    def area_triangulo(self, base, altura):
        return (base * altura) / 2

    def area_trapecio(self, base_mayor, base_menor, altura):
        return ((base_mayor + base_menor) * altura) / 2
    
    def area_pentagono(self, lado):
        return (5 * lado * lado) / (4 * math.tan(math.pi / 5))
figura = Figura()
print("area del circulo: ", figura.area_circulo(5)) 
# radio =5
print("area del rectangulo:", figura.area_rectangulo(4, 6)) 
# base =4, h = 6
print("area del triangulo: ", figura.area_triangulo(4, 5)) 
#base =4, h = 5
print("area del trapecio: ", figura.area_trapecio(5, 3, 4)) 
# base1 =5, base2 =3, h = 4
print("area del pentágono: ", figura.area_pentagono(3))  
# lado =3