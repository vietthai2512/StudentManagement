package com.example.studentmanagement;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.sql.Date;


@Entity(tableName = "student_list")
public class SinhVien {
    @PrimaryKey
    @NonNull
    public int mssv;

    @NonNull
    public String hoten;

    @NonNull
    public Date ngaysinh;

    @NonNull
    public String email;

    @NonNull
    public String diachi;
}
