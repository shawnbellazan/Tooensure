package com.tooensure.firebase.auth.domain.repositories

import com.google.firebase.ktx.Firebase
import com.tooensure.firebase.auth.domain.entities.irepositories.IBaseRepository

abstract class BaseRepository<T>() : IBaseRepository<T>
{
};