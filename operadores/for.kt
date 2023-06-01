fun main(){

    println("Valores de i:");
    for (i in 1..10){
        println(i);
    }

    println();
    println("Letras");
    for (caracter in 'a'..'g' step 2){ //una si una no step
        println(caracter);
    }
    println();
    println("Letras en reversa");
    println();
    for (caracter in 'g' downTo 'a'){ //una si una no step
        println(caracter);
    }
    // recorriendo for con un arreglo
    val mascotas= arrayOf("Ginger", "Blackie", "Nicky", "Moka", " Moji");
    println();
    println("Mascotas");
    for(i in mascotas.indices){
        println("[$i, ${mascotas[i]}]");
    }
    println();
    println("Divideindo un String en caracteres:");
    for (letra in "---Hola mundo Kotlin ---"){
        println(letra);
    }
}