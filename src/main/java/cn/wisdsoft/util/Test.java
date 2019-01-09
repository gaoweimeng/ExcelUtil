package cn.wisdsoft.util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * @Author 高伟萌
 * @Date 2018/10/22 08:18
 * @Description TODO
 */
public class Test {
    //public static void main(String[] args) {
    //    try {
    //        Class<?> clazz = MyPojo.class;
    //        Object obj = clazz.newInstance();
    //        String x = "name";
    //        String x1 = initSetMethod(x);
    //        String x2 = initGetMethod(x);
    //        Method method = clazz.getMethod(x1, Double.class);
    //        //Object invoke = method.invoke(obj, "1998-01-01");
    //        Method method1 = clazz.getMethod(x2);
    //        Object invoke1 = method1.invoke(obj);
    //        String name = method1.getReturnType().getName();
    //        System.out.println(name);
    //        //System.out.println(method);
    //    } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
    //        e.printStackTrace();
    //    }
    //}
    //
    //private static String initSetMethod(String field) {
    //    return "set" + field.substring(0, 1).toUpperCase() + field.substring(1);
    //}
    //
    //private static String initGetMethod(String field) {
    //    return "get" + field.substring(0, 1).toUpperCase() + field.substring(1);
    //}
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("user", "姓名");
        map.put("age", "年龄");
        HSSFWorkbook excel = TempUtil.createExcel(15, map);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:/123.xls");
            excel.write(fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
