package com.enigmacamp.learnkotlin.repository.model

import android.util.Log

data class Car constructor(private val engine: Engine){
    fun run(){
        Log.d("CarDI","run: ${engine.startEngine()}")
    }

    fun parking(){
        Log.d("CarDI","run:${engine.stopEngine()}")
    }
}