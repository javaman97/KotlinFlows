package com.asynchronous.flows

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking


   fun simpleFlow(): Flow<Int> = flow {
       for(i in 1..1 step 6){
         delay(1000)
         emit(i)
       }
   }
    fun main()=  runBlocking {
        simpleFlow().collect{ value ->
            println(value)
        }
        println("flow builder")
        FlowBuilder_flowOf()
    }

// Flow Builders -> asFlow(), flowOf(), flow{}, channelFlow{}

suspend fun FlowBuilder_flowOf(){
    flowOf(2,53,5353,635,44436,23).collect {
        println(it)
    }
}

suspend fun FlowBuilder_asFlow(){

}




