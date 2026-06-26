/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.util;

import mini.entity.NhanVien;

/**
 *
 * @author LENOVO
 */
public class XAuth {
    public static NhanVien user = NhanVien.builder()
    .maNV("admin@gmail.com")
    .password("123")
    .enabled(true)
    .fullname("Admin")
    .manager(true)
    .build(); // biến user này sẽ được thay thế sau khi đăng nhập
}
