package com.data.create.utils;

import com.data.create.entity.CaOaStationInfo;
import com.data.create.entity.FiledMatchConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author zhougf
 * @desc 基础类字段处理
 * @date 2023/01/05 16:21
 */
public class ClassFiledUtil {


    public static void assignmentByFiled(CaOaStationInfo caOaStationInfo, String filedName, String value){
        if (StringUtils.isEmpty(value)) {
            return;
        }
        Class<? extends CaOaStationInfo> aClass = caOaStationInfo.getClass();
        String classFiledName = FiledMatchConst.FILED_MATCH_MAP.get(filedName);
        try {
            Field field = aClass.getDeclaredField(classFiledName);
            field.setAccessible(true);
            if (field.getType().equals(LocalDate.class)) {
                field.set(caOaStationInfo, LocalDate.parse(value));
            }
            if (field.getType().equals(BigDecimal.class)) {
                field.set(caOaStationInfo, new BigDecimal(value));
            }
            if (field.getType().equals(String.class)) {
                field.set(caOaStationInfo, value);
            }
            if (field.getType().equals(Integer.class)) {
                field.set(caOaStationInfo, Integer.valueOf(value));
            }

        } catch (NoSuchFieldException | IllegalAccessException e) {
        }

    }
}
