package com.example.todoapp.ui.theme.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.todoapp.ui.theme.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase: RoomDatabase() {
    abstract fun toDoDao(): ToDoDao
}