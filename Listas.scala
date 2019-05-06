//Ejemplo 1: Numero de elemtos en una lista
def numElems(lista: List[Int]): Int =
    if (lista.isEmpty) 0 else 
    1 + numElems(lista.tail)

numElems(List(1,2,3,4,5))

//Ejemplo 2: Ordenar una lista
def sort(lista: List[Int]): List[Int] 
    if (lista.isEmpty) Nil else
    insert(lista.head, sort(lista.tail))

sort(List(20,-1,3,34,-10))


