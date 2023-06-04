 //trabajando con mapas
 fun main(){
    //Mapa inmutable
    val ladas: Map<Int, String> =mapOf(
        1 to "Usa",
        34 to "España",
        52 to "México",
        233 to "Ghana"

    );
    //Imprimiendo el conjunto de pares clave-valor
    println(ladas);
    //imprimiendo el mapa usndo un for
    for((key, value)in ladas){
        println("La clave lada de $value es $key");
    }

    //imprimiendo el mapa usando lambda
    ladas.forEach{(k, v) ->println("$k -> $v")}

    //recuperar un solo elemnto del mapa
    println(ladas.get(52));
    println(ladas[52]);

    //Recuperar su tamaño, cuantos pares hay en el mapa
    println("Tamaño: ${ladas.size}");

    //Recuperar sólo las claves
    println("Claves del mapa: ${ladas.keys}");
    
    //Recuperar solo los valores
    println("Valores del mapa: ${ladas.values}");

    //Recuperar las entradas
    println("Entradas del mapa: ${ladas.entries}");

    //
    println("Valor de la lada 48: ${ladas.getOrDefault(48,"Pais desconocido")}");

    //Comprobar si el mapa esta vacío:
    println("Mapa vacio:${ladas.isEmpty()}");

    //

    println("Existe la clave lada 86:${86 in ladas}");


    //comprobar si existe un valor en el mapa
    println("Existe el valor Mexico en el mapa: ${"Mexico" in ladas.values}");

    //mapa mutable
    var nums=mutableMapOf(
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
    );
    println("Mapa de numeros: $nums");

    //eliminar valores del mapa
    nums.remove("two");
    println("Mapa nuevo de numeros: $nums");

    //agregando par al mapa
    nums ["six"]=6;
    println("Mapa nuevo de numeros: $nums");

    //mapas ordenado por llaves
    var sortedNums = nums.toSortedMap();
    println("Mapa ordenado: $sortedNums");

    //Reto:
    //Crear un diccionario español - inglés usando un mapa
    //1.Función para Crear o cargar el diccionario
    //2.Función para consulta, reciba una palabra en español y regrese su traducción y si no existe un valor por default
    //3.Imprimir todo el diccionario

println("***********************************");
    val diccionario=mutableMapOf(
        "naranja" to "orange",
        "mandarina" to "tangerine",
        "manzana" to "apple",
        "uva" to "grape",
        "fresa" to "strawberry",
        "limon" to "lemon",
        "platano" to "banana",
        "pera" to "pear",
        "mango" to "mango",
        "durazno" to "peach"
    );
    //agregar mas datos
    
    diccionario["frambuesa"]= "raspberry";
    println("Diccionario nuevo: $diccionario");
    //hacer una consulta y de ser lo contrario un valor por default
    println("¿Existe la palabra limon en el diccionario? +++ ${"limon" in diccionario.keys} ++++ y de ser verdadero ¿cual es su traduccion? " +  diccionario["limon"]);
    
//imprimir todo el diccionario
    println("Los valores del dicionario son: $diccionario");
    
}
    


 