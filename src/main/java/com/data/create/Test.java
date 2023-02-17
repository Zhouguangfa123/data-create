package com.data.create;

import com.alibaba.fastjson.JSON;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static com.data.create.entity.FiledMatchConst.*;

/**
 * @author zhougf
 * @desc
 * @date 2023/01/06 11:12
 */
public class Test {
    public static void main(String[] args) {
        Map<String,String> newMap = new HashMap<>();
        Set<String> keys = FILED_MATCH_MESSAGE_MAP.keySet();
        for(String key : keys) {
            if (!FILED_MATCH_MAP.containsKey(key)) {
                newMap.put(key, FILED_MATCH_MESSAGE_MAP.get(key));
            }
        }
        System.out.println(JSON.toJSONString(newMap));
    }
}
