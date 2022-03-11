package com.codelab.daniwebandroidprepopulateroomdatabase

import androidx.room.Dao
import androidx.room.Query

@Dao
interface PersonDao {
    @Query("SELECT * FROM person WHERE id=:id")
    suspend fun getPersonById(id: Long): Person?
}