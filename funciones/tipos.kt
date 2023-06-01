//Usando funciones que regresan valores
//y y funciones que no regresan valores
fun main(){
    val numero1= 15;
   val numero2= 40;
   val numero3= 20;
    borde("=", 20);
    var resultado=suma(numero1,numero2);
   
    println(resultado);
    borde("*", 35)

    //Ejemplo 1 de función anonima 
    val slogan={r:Int -> println("Tu puedes con $r problemas y mas")};
    slogan(resultado);

//resta
    val resta={ n1:Int, n2:Int -> n1-n2};
    println("Resta: ${resta(12,18)}");


   //Funcion anonima que encuentres el mayor de tres números

   val max = {n1: Int, n2: Int, n3: Int -> 
    if(n1 > n2 && n1 > n2) {
        println("El numero mas grande es: $n1");
    } else if(n2 > n1 && n2 > n3) {
        println("Elnumero mas grande es: $n2");
    } else {
        println("El numero mas agramde es: $n3" );
    }
}
max(numero1, numero2, numero3); 


   //Función anonima que calcule el promedio de tres numeros
   val promedio = { n1: Double, n2: Double, n3: Double -> 
    (n1 + n2 + n3) / 3;
}
var result = promedio(4.2, 5.6, 4.6);
    println("El promedio es:$result");
}


fun borde(caracter : String, veces : Int ){
    for(i in 1..veces){
        print(caracter)
    }
    println();
    }
    fun suma(n1:Int, n2:Int):Int{
        return n1+n2;
    }
    
