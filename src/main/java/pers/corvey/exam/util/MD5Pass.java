package pers.corvey.exam.util;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

public class MD5Pass {
    private static final Md5PasswordEncoder md5PasswordEncoder = new Md5PasswordEncoder();

    public static void main(String[] args) {
        String password =   md5PasswordEncoder.encodePassword("123456", "admin");
        System.out.println(password);
    }
}
