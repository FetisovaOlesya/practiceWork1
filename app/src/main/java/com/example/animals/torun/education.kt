package com.example.animals.torun
import com.example.animals.model.Carnivores
import com.example.animals.model.Herbivores


fun main(){
    val cow = Herbivores("Корова",false, 50, "трава")
    cow.age = 3
    val elk = Herbivores("Лось", true, 20, "мох")
    elk.age = 12
    val cat = Carnivores("Кот", true, 5, "рыба")
    val tigr = Carnivores("Тигр", true, 250, "мясо")

    val animalsHerb:List<Herbivores> = listOf(cow, elk)
    val animalsCarn:List<Carnivores> = listOf(cat, tigr)
    println("Травоядные")
    //for(animalsHerb in Predator::class.memberProperties)
    for (animal in animalsHerb) {
        println(animal.name)

//        for(property in animal::class.memberProperties) {
//            property.get(ОБЪЕКТ_ВАШЕГО_КЛАССА_Predator)
//        }
    }
    print("\n\n")
    println("Плотоядные")
    animalsCarn.forEach {
        println(it.name)
    }



}
