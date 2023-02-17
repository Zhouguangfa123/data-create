package com.data.create.entity;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhougf
 * @desc 钉钉常量类
 * @date 2023/01/05 14:30
 */
public class DingTalkConst {

    public static final List<String> TEXT_TYPE_LIST = Arrays.asList("DDSelectField", "DDDateField", "TextField", "NumberField","CalculateField", "InnerContactField");

    public static final List<String> ADDRESS_TYPE_LIST = Arrays.asList("AddressField");

    public static final List<String> SELECT_TYPE_LIST = Arrays.asList("DDMultiSelectField");

    /**
     * 此类型要注意保存时最好转化为-平台自身图片存储能力
     */
    public static final List<String> PHONE_TYPE_LIST = Arrays.asList("DDAttachment");


    public static final List<String> TABLE_TYPE_LIST = Arrays.asList("TableField");
}
