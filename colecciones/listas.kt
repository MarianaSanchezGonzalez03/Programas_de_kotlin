//listas
fun main(){
    //lista inmutable

    val readOnly : List<String> = listOf("Lunes","Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");

    println(readOnly);
    println("Tamaño de la lista: ${readOnly.size}");
    println("Elemento en la posición 3: ${readOnly.get(3)}");
    println("Primer elemento de la lista: ${readOnly.first()}");
    println("Ultimo elemento de la lista: ${readOnly.last()}");
    //Mostrando los elementos de las listas uansdo estructura for
    println("Elementos de readOnly: ");
    for(elemento in readOnly){
        println(elemento);
    }
    //Mostrar los elemento s d la lista usando el método forEach
    println("Elementos de readOnly usando forEach: ");
    readOnly.forEach{
        println(it);
    }

    //Lista mutable
    var mutableList : MutableList<String> = mutableListOf("Lunes", "Martes");
    println("Lista mutable: $mutableList");
    mutableList.add("Miercoles");
    println("Lista mutable: $mutableList");

    //Trabajando con listas mutables vacías
    var emptyList : MutableList<String> = mutableListOf();
    println("¿La lista esta vacía? ${emptyList.none()}");
    println("Primer elemento de emptyList: ${emptyList.firstOrNull()}");
    println("Último elemento de emptyList: ${emptyList.lastOrNull()}");
    println("Elemento en la posición 2 de emptyList: ${emptyList.elementAtOrNull(2)}");
    //Agregando elemntos a emptyList
    readOnly.forEach{
        emptyList.add(it);
    }
    println("La lista que estaba vacía :$emptyList");

    //Ordenar una lista
    val numerosDeLoteria = listOf(11, 2, 44, 33, 56, 78, 66);
    println("Números de loteria:$numerosDeLoteria");
    val  numerosOrdenados = numerosDeLoteria.sorted();
    println("Numeros ordenados: $numerosOrdenados");
    val numerosDescendentes = numerosDeLoteria.sortedDescending();
    println("Números ordenados en forma descendente: $numerosDescendentes");
    val numerosPares = numerosDeLoteria.filter{num -> num%2==0};
    println("Numeros pares: $numerosPares");

}