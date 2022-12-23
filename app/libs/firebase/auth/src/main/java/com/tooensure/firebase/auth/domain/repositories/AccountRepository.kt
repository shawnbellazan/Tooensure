package com.tooensure.firebase.auth.domain.repositories

import android.os.AsyncTask
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.tooensure.firebase.auth.domain.entities.AccountEntity

class AccountRepository : BaseRepository<AccountEntity>() {
    private lateinit var auth: FirebaseAuth;

    override fun get(): List<AccountEntity>? {
//        auth = Firebase.auth.currentUser()
        return TODO("Provide the return value")
    }

    override fun get(id: Int): AccountEntity? {

        TODO("Not yet implemented")
    }

    override fun add(entity: AccountEntity): AccountEntity? {
        TODO("Not yet implemented")
    }

    override fun delete(entity: AccountEntity): AccountEntity? {
        TODO("Not yet implemented")
    }

    override fun exist(entity: AccountEntity): AccountEntity? {
        TODO("Not yet implemented")
    }

//    override fun add(entity: AccountEntity)  {
////        auth = Firebase.auth.createUserWithEmailAndPassword(entity.email,"")
//        TODO("Not yet implemented")
//
//    }


}