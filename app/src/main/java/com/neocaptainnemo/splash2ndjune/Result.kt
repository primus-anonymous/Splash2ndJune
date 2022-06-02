package com.neocaptainnemo.splash2ndjune

sealed class Result

object Loading : Result()

data class Success<T>(val data: T): Result()

data class Error(val exc: Throwable): Result()