package com.zch.aounhuipractice.practice;

import org.apache.commons.lang.StringUtils;

/**
 * StringUtils.isBlank判断是不是空白，而不是判空
 * StringUtils.isEmpty判断是不是为空，即判断是不是null或者length==0
 */
public class StringUtilsPractice {
    public static void main(String[] args) {
        System.out.println(StringUtils.isBlank("   "));
        System.out.println(StringUtils.isEmpty("   "));
    }
}
