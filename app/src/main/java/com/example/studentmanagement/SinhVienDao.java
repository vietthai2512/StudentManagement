package com.example.studentmanagement;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface SinhVienDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertSinhVien(SinhVien... sinhViens);

    @Update
    void updateSinhVien(SinhVien sinhVien);

    @Delete
    void deleteSinhVien(SinhVien... sinhViens);

    @Query("SELECT * FROM student_list")
    SinhVien[] loadAllSinhVien();

    @Query("SELECT * FROM student_list WHERE mssv = :mssvInput")
    SinhVien searchByMssv(int mssvInput);

    @Query("SELECT * FROM student_list WHERE hoten = :hotenInput")
    SinhVien searchByHoten(String hotenInput);
}
