package com.nowcoder.community.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.util.UUID;

public class CommunityUtil {

    //生成随机字符串激活码
    public static String generateUUID() {
        return UUID.randomUUID().toString().replaceAll("-", " ");
    }

    //MD5加密
    //hello + 3e4a8(salt) -> wopfksldfks（提高密码的安全性，加上一个后置字符串后再加密，MD5只能加密不能解密）
    public static String md5(String key) {
        if (StringUtils.isBlank(key)) {
            return null;
        }
        return DigestUtils.md5DigestAsHex(key.getBytes());
    }
}
