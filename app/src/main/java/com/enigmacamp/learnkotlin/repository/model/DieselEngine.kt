package com.enigmacamp.learnkotlin.repository.model

class DieselEngine : Engine {
    override val engineName = "Diesel Engine"
    override fun startEngine() ="$engineName started"
    override fun stopEngine() = "$engineName stop"
}