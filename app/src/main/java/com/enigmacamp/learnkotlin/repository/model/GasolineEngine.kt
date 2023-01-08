package com.enigmacamp.learnkotlin.repository.model

class GasolineEngine():Engine {
    override val engineName = "Gasoline Engine"
    override fun startEngine() = "$engineName started"
    override fun stopEngine() ="$engineName stop"
}