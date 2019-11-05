/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.trackmysleepquality.database

import androidx.room.Database
import androidx.room.RoomDatabase

        //list the tables              //schema version       //saves the schema to a folder that shows version history for the database
@Database(entities = [SleepNight::class], version = 1, exportSchema = false)    //true by default
abstract class SleepDatabase : RoomDatabase(){
            abstract val sleepDatabaseDao: SleepDatabaseDao //return SleepDatabase

            //one table and one Dao for now

            companion object {

                @Volatile   //ensures value of INSTANCE is always up to date
                private var INSTANCE: SleepDatabase? = null
                //INSTANCE keeps reference to the database so we dont have to keep reconnecting to the database
            }
        }