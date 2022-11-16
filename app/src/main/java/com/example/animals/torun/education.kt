package com.example.animals.torun
import com.example.animals.model.Carnivores
import com.example.animals.model.Herbivores

// просто комментарий

fun main(){
    val cow = Herbivores("Корова",false, 50, "трава")
    cow.age = 3
    val elk = Herbivores("Лось", true, 20, "мох")
    elk.age = 12
    val cat = Carnivores("Кот")
    cat.lonely = true
    cat.weight = 5
    cat.food = "рыба"
    val coyote = Carnivores("Кайот")
    coyote.lonely = false
    coyote.weight = 21
    coyote.food = "мясо"

    val animalsHerb:List<Herbivores> = listOf(cow, elk)
    val animalsCarn:List<Carnivores> = listOf(cat, coyote)
    println("Травоядные")
    //for(animalsHerb in Predator::class.memberProperties)
    for (animal in animalsHerb) {
        println(animal.name)
        println(animal.age)
    }
    print("\n\n")
    println("Плотоядные")

    for (animal in animalsCarn)  {
        //for(property in animal::class.memberProperties) {
         //   property.get(ОБЪЕКТ_ВАШЕГО_КЛАССА_Predator)
        //}
        println("${animal.name}, одиночка - ${animal.lonely}, вес - ${animal.weight} кг, пища - ${animal.food}")

    }



}
