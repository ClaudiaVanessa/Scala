//Palabra palindromo

def palindromo(palabra:String):Boolean = 
{
    return (palabra == palabra.reverse)
}

val palabra = "oso"

println(palindromo(palabra))


