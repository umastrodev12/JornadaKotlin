package net_kotlin_app

import java.awt.Button

// -------------INFORMAÇÕES QUE VI NO CURSO---------------  //
// Val é uma variável imutável                              //
// Var é uma variável mutável                               //
// Lembrando ~nossos programas são burros~                  //
// Val(s), Var(s) são declarações de espaço de memória      //
// O Kotlin não diferencia números e textos                 //
// Para o Kotlin são apenas Binários(01010101)              //
// -------------------GLOSSÁRIO---------------------------- //
//                     Var                                  //
//                     Val                                  //
//                     Class                                //
//                     Double  ├── ├      Tipos             //
//                     String  ├── ├        de              //
//                     Int     ├── ├        Kotlin          //
//                     Byte                                 //
//                     Short                                //
//                     Long                                 //
// ----------------METAS----------------------------------- //
// [ ] Aprender Kotlin                                      //
// [ ] Terminar o Curso                                     //
// [ ] Aprender Kord                                        //
//--------------------------------------------------------- //
fun main() {
    val preco = 54.90 // TIPO INFERIDO EM KOTLIN //
    // TIPOS PRIMITIVOS EM KOTLIN //
    val botaoazul: Button

    val price: Double = 31.90
    // Espaços de memória em tipos primitivos //
    val byte: Byte = 8  // 8-bit
    val short: Short = 16 // 16-bit
    val age: Int = 31 // 32-bit (99% do tempo)
    val long: Long = 197298389 // 64-bit
  
    val product: String = "iMac"

    println(byte::class)
}
