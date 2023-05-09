#Escreva um programa que identifique o tipo de triangulo. Deve ser informado as três arestas.  O programa deve informar se o triangulo é equilatero, isosceles ou escaleno.
arestas = []
for i in range(3):
    ar = int(input("Digite o valor da aresta: "))
    arestas.append(ar)

arestas.sort()

if arestas[0] + arestas[1] < arestas[2]:
    print("Não é um triangulo")
elif arestas[0] == arestas[1] and arestas[1] == arestas[2]:
    print("Triangulo equilatero")
elif arestas[0] == arestas[1] or arestas[1] == arestas[2] or arestas[0] == arestas[2]:
    print("Triangulo isosceles")
else:
    print("Triangulo escaleno")