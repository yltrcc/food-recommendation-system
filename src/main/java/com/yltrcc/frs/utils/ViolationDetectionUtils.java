package com.yltrcc.frs.utils;

/**
 * Package: com.yltrcc.frs.utils
 * Date：2022-03-19
 * Time：13:42
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
public class ViolationDetectionUtils {

    public static boolean exeDetection(String comment) {
        //判断是否包含错误此
        if (comment.contains("辣鸡")) {
            return false;
        }
        if (comment.contains("垃圾")) {
            return false;
        }
        if (comment.contains("倒闭")) {
            return false;
        }
        if (comment.contains("恶心")) {
            return false;
        }
        return true;
    }
}
