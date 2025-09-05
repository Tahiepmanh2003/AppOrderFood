package com.example.apporderfood.models.entity

data class User(
    val id: Int,              // ID người dùng
    val username: String,     // Tên đăng nhập
    val password: String,     // Mật khẩu
    val fullName: String,     // Họ và tên
    val email: String,        // Địa chỉ email
    val phone: String,        // Số điện thoại
    val address: String,      // Địa chỉ
    val role: String,         // Vai trò (Admin, User, ...)
)

