package com.enigmacamp.learnkotlin.repository.model

interface Engine {
    val engineName: String
    fun startEngine(): String
    fun stopEngine(): String
}