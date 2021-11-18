 import java.util.Random
fun main() {

    val listaMuteable = MutableList(10){
        numeroRandom()
    }
    listaMuteable.forEach {
        println("LISTA EN POSICCIÓN "+ it +": "+numeroRandom () )
    }
}
fun numeroRandom(): Int{

    var numeros =(1..9).random()
    return numeros
}
