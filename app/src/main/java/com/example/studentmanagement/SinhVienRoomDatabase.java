package com.example.studentmanagement;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {SinhVien.class}, version = 1)
@TypeConverters({Converters.class})
public abstract class SinhVienRoomDatabase extends RoomDatabase
{
    public abstract SinhVienDao sinhVienDao();
}
