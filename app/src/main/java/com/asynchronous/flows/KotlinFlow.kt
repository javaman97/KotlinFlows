package com.asynchronous.flows

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
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
    }
