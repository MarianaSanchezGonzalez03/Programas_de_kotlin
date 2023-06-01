fun main(){
    var nombre : String? = null;
    println("Imprimiendo el valor nulo de nombre:");
    println(nombre);
   //nombre ="Ginger";
    //println(nombre!!.length); mala practica

    // var longitud= nombre?.length ?:0; // utilizar esto en lugar de lo de la mala práctica 

    // println("Longitud de nombre: ");
    // println(longitud);

    try{
        println("nombre: $nombre");
    }catch(exception : NullPointerException){
        println("Ha ocurrido un error");
        println(exception);
    }finally{
        println("Lo que este en finally, se ejecuta siempre");
    }

    var longitud= -1;

    println("--------------- try ---------------------")
    try{
        var longitud=nombre?.length;
        println("valor de longitud: $longitud");
    }catch(error: NullPointerException){

        //HUBO UN ERROR, NO SE PUEDE OBTENER LA LONGITUD DEL NOMBRE
        var longitud =0;
        println("valor de longitud: $longitud");
    }finally{
        //println("valor de longitud: $longitud");
        println("Finally!");
    
    }
    println("Termina prueba de try")

}