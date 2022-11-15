package com.example.animals.model

class Carnivores(name:String):Animal(name) {
    var lonely: Boolean = false //животное - одиночка(true), по умолчанию false
    set(value) {
        field = value
    }
    get(){
        return field
    }

    var weight:Int = 0 // вес животного
    get() {
        return field
    }
    set(value) {
        field = value
    }

    var food:String = ""// пища, употребляемая животным
        get() {
            return field
        }
        set(value) {
            field = value
        }
}