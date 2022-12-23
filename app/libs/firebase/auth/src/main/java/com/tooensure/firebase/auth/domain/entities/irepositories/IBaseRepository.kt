package com.tooensure.firebase.auth.domain.entities.irepositories

import android.os.Parcel

abstract interface IBaseRepository<T> {
    fun get() : List<T>?
    fun get(id: Int) : T?
    fun add(entity: T) : T?
    fun exist(entity: T) : T?
    fun delete(entity: T) : T?
}