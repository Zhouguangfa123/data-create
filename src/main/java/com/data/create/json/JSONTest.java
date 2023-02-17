package com.data.create.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.data.create.entity.CaOaStationInfo;
import com.data.create.entity.FormComponentBean;
import com.data.create.entity.TableRowValue;
import com.data.create.utils.ClassFiledUtil;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static com.data.create.entity.DingTalkConst.TABLE_TYPE_LIST;
import static com.data.create.entity.DingTalkConst.TEXT_TYPE_LIST;

/**
 * @author zhougf
 * @desc json test
 * @date 2022/12/29 11:02
 */
public class JSONTest {

    private static final String text = "[\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"DDSelectField\",\n" +
            "\t\t\t\"extValue\": \"{\\\"label\\\":\\\"众畅科技有限公司\\\",\\\"key\\\":\\\"option_2\\\"}\",\n" +
            "\t\t\t\"id\": \"DDSelectField_14KJEFHALXHC0\",\n" +
            "\t\t\t\"name\": \"渠道方\",\n" +
            "\t\t\t\"value\": \"众畅科技有限公司\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"DepartmentField\",\n" +
            "\t\t\t\"extValue\": \"[{\\\"number\\\":141,\\\"itemId\\\":\\\"139605137\\\",\\\"name\\\":\\\"众畅科技有限公司\\\",\\\"id\\\":\\\"139605137\\\"}]\",\n" +
            "\t\t\t\"id\": \"DepartmentField_ANZO8PU7ZOW0\",\n" +
            "\t\t\t\"name\": \"渠道合作部门\",\n" +
            "\t\t\t\"value\": \"众畅科技有限公司\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"DDSelectField\",\n" +
            "\t\t\t\"extValue\": \"{\\\"label\\\":\\\"公司-合作共建\\\",\\\"key\\\":\\\"option_0\\\"}\",\n" +
            "\t\t\t\"id\": \"DDSelectField_1EGZFD4I5K2O0\",\n" +
            "\t\t\t\"name\": \"渠道方合作模式\",\n" +
            "\t\t\t\"value\": \"公司-合作共建\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"TextField\",\n" +
            "\t\t\t\"id\": \"TextField_6RC2AB1KUD40\",\n" +
            "\t\t\t\"name\": \"场地名称\",\n" +
            "\t\t\t\"value\": \"东沽路停车场\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"TextField\",\n" +
            "\t\t\t\"id\": \"TextField_1SBDFT5XS35S0\",\n" +
            "\t\t\t\"name\": \"场地方公司名称\",\n" +
            "\t\t\t\"value\": \"天津沽盛建设开发集团有限公司\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"TextField\",\n" +
            "\t\t\t\"id\": \"TextField_1IJJWYXPV8E80\",\n" +
            "\t\t\t\"name\": \"场地负责人\",\n" +
            "\t\t\t\"value\": \"廖鹏飞\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"PhoneField\",\n" +
            "\t\t\t\"extValue\": \"{\\\"mode\\\":\\\"phone\\\",\\\"countryKey\\\":\\\"CN\\\",\\\"flag\\\":\\\"C\\\",\\\"countryCode\\\":\\\"+86\\\",\\\"areaNumber\\\":\\\"\\\",\\\"flagPy\\\":\\\"Z\\\",\\\"countryNameZh\\\":\\\"中国\\\",\\\"countryName\\\":\\\"China\\\",\\\"countryNamePy\\\":\\\"ZHONGGUO\\\"}\",\n" +
            "\t\t\t\"id\": \"PhoneField_IB3KRIW4Y0O0\",\n" +
            "\t\t\t\"name\": \"负责人联系方式\",\n" +
            "\t\t\t\"value\": \"18602668650\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"TextField\",\n" +
            "\t\t\t\"id\": \"TextField_1HXZX5NJ54E80\",\n" +
            "\t\t\t\"name\": \"商务人员\",\n" +
            "\t\t\t\"value\": \"李振尧\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"DDDateField\",\n" +
            "\t\t\t\"id\": \"DDDateField_1HPBZJ8G2GW00\",\n" +
            "\t\t\t\"name\": \"踏勘日期\",\n" +
            "\t\t\t\"value\": \"2023-01-06\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"TextField\",\n" +
            "\t\t\t\"id\": \"TextField_1IBKW5OXN6740\",\n" +
            "\t\t\t\"name\": \"商务踏勘编码\",\n" +
            "\t\t\t\"value\": \"SWTK-20230106-LZY-0007\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"DDSelectField\",\n" +
            "\t\t\t\"extValue\": \"{\\\"label\\\":\\\"交通枢纽(高速、地铁、铁路站附近)\\\",\\\"key\\\":\\\"option_1PKUO0SE1W000\\\"}\",\n" +
            "\t\t\t\"id\": \"DDSelectField_11N4W5ZB8NY80\",\n" +
            "\t\t\t\"name\": \"场地属性\",\n" +
            "\t\t\t\"value\": \"交通枢纽(高速、地铁、铁路站附近)\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"AddressField\",\n" +
            "\t\t\t\"extValue\": \"{\\\"province\\\":{\\\"name\\\":\\\"天津\\\",\\\"id\\\":\\\"120000\\\"},\\\"city\\\":{\\\"name\\\":\\\"天津市\\\",\\\"id\\\":\\\"120100\\\"},\\\"street\\\":{\\\"name\\\":\\\"咸水沽镇\\\",\\\"id\\\":\\\"120112100\\\"},\\\"district\\\":{\\\"name\\\":\\\"津南区\\\",\\\"id\\\":\\\"120112\\\"},\\\"detail\\\":{}}\",\n" +
            "\t\t\t\"id\": \"AddressField_21EIBP0IT6OW0\",\n" +
            "\t\t\t\"name\": \"详细地址\",\n" +
            "\t\t\t\"value\": \"天津,天津市,津南区,咸水沽镇\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"NumberField\",\n" +
            "\t\t\t\"id\": \"NumberField_1PD1Y2J89M1S0\",\n" +
            "\t\t\t\"name\": \"经度（高德地图）\",\n" +
            "\t\t\t\"value\": \"117.41515\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"NumberField\",\n" +
            "\t\t\t\"id\": \"NumberField_WCEPB7T53I80\",\n" +
            "\t\t\t\"name\": \"纬度（高德地图）\",\n" +
            "\t\t\t\"value\": \"39.01798\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"NumberField\",\n" +
            "\t\t\t\"id\": \"NumberField_20T85TMI5WN4\",\n" +
            "\t\t\t\"name\": \"该地度电服务费\",\n" +
            "\t\t\t\"value\": \"1.5\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"DDSelectField\",\n" +
            "\t\t\t\"extValue\": \"{\\\"label\\\":\\\"是\\\",\\\"key\\\":\\\"option_0\\\"}\",\n" +
            "\t\t\t\"id\": \"DDSelectField_1HDLA4BDBYKG0\",\n" +
            "\t\t\t\"name\": \"该场地是否已验收启用\",\n" +
            "\t\t\t\"value\": \"是\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"DDDateField\",\n" +
            "\t\t\t\"id\": \"DDDateField_WHROXK50GM80\",\n" +
            "\t\t\t\"name\": \"预计验收启用日期\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"MoneyField\",\n" +
            "\t\t\t\"id\": \"MoneyField_1LSHUCASL1SW0\",\n" +
            "\t\t\t\"name\": \"一次性商务费用\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"NumberField\",\n" +
            "\t\t\t\"id\": \"NumberField_LAEPORQAIEO0\",\n" +
            "\t\t\t\"name\": \"分成比例\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"TableField\",\n" +
            "\t\t\t\"extValue\": \"{\\\"statValue\\\":[],\\\"componentName\\\":\\\"TableField\\\"}\",\n" +
            "\t\t\t\"id\": \"TableField_5PBLZKGF2JO0\",\n" +
            "\t\t\t\"name\": \"商务踏勘信息(仅可填1行)\",\n" +
            "\t\t\t\"value\": \"[{\\\"rowValue\\\":[{\\\"label\\\":\\\"说明\\\",\\\"value\\\":\\\"安装位置信息\\\",\\\"key\\\":\\\"TextNote_21KHKF2038DC0\\\"},{\\\"label\\\":\\\"安装区域（地上或地下）\\\",\\\"extendValue\\\":{\\\"label\\\":\\\"地上\\\",\\\"key\\\":\\\"option_0\\\"},\\\"value\\\":\\\"地上\\\",\\\"key\\\":\\\"DDSelectField_8GYGGY6VB5K0\\\"},{\\\"label\\\":\\\"计划安装位置\\\",\\\"extendValue\\\":{\\\"label\\\":\\\"车位前\\\",\\\"key\\\":\\\"option_0\\\"},\\\"value\\\":\\\"车位前\\\",\\\"key\\\":\\\"DDSelectField_88VOYJGYI9S0\\\"},{\\\"label\\\":\\\"安装位置环境照片\\\",\\\"value\\\":\\\"[\\\\\\\"https://static.dingtalk.com/media/lQDPM4siRbisxhjNA2TNB4CwFYfxAIekBv0DuZlWqcB2AA_1920_868.jpg\\\\\\\"]\\\",\\\"key\\\":\\\"DDPhotoField_1C9UDCLBW8PS0\\\"},{\\\"label\\\":\\\"说明\\\",\\\"value\\\":\\\"计划安装慢充桩\\\",\\\"key\\\":\\\"TextNote_214MA1LYQVMO0\\\"},{\\\"label\\\":\\\"说明\\\",\\\"value\\\":\\\"计划安装快充桩\\\",\\\"key\\\":\\\"TextNote_23U7KMT2POSG0\\\"},{\\\"label\\\":\\\"总计安装充电桩数（个）\\\",\\\"value\\\":\\\"0\\\",\\\"key\\\":\\\"CalculateField_1EDVYRC2A78G0\\\"},{\\\"label\\\":\\\"说明\\\",\\\"value\\\":\\\"电价信息\\\",\\\"key\\\":\\\"TextNote_169P93R7NB400\\\"},{\\\"label\\\":\\\"电价类型\\\",\\\"extendValue\\\":{\\\"extension\\\":{\\\"image\\\":\\\"\\\"},\\\"label\\\":\\\"其它\\\",\\\"key\\\":\\\"other\\\"},\\\"value\\\":\\\"其它\\\",\\\"key\\\":\\\"DDSelectField_22DUKTF2M7PC0\\\"},{\\\"label\\\":\\\"基础电价\\\",\\\"value\\\":\\\"1.5\\\",\\\"key\\\":\\\"NumberField_1NFJABP5C74W0\\\"},{\\\"label\\\":\\\"基础电价是否上浮\\\",\\\"extendValue\\\":{\\\"label\\\":\\\"否\\\",\\\"key\\\":\\\"option_1\\\"},\\\"value\\\":\\\"否\\\",\\\"key\\\":\\\"DDSelectField_1OCK5302QJ6O0\\\"},{\\\"label\\\":\\\"通信信号\\\",\\\"extendValue\\\":{\\\"label\\\":\\\"好\\\",\\\"key\\\":\\\"option_0\\\"},\\\"value\\\":\\\"好\\\",\\\"key\\\":\\\"DDSelectField_TJG76WQNUXS0\\\"},{\\\"label\\\":\\\"说明\\\",\\\"value\\\":\\\"站点环境\\\",\\\"key\\\":\\\"TextNote_HVYZ07GID9K0\\\"},{\\\"label\\\":\\\"对于充电汽车停车收费标准\\\",\\\"extendValue\\\":{\\\"label\\\":\\\"免费\\\",\\\"key\\\":\\\"option_0\\\"},\\\"value\\\":\\\"免费\\\",\\\"key\\\":\\\"DDSelectField_LFNV2AIK1G00\\\"},{\\\"label\\\":\\\"说明\\\",\\\"value\\\":\\\"产权及电容情况\\\",\\\"key\\\":\\\"TextNote_WMVPZF27TMO0\\\"},{\\\"label\\\":\\\"电源及车位产权是否属于业主或合作方\\\",\\\"extendValue\\\":{\\\"label\\\":\\\"是\\\",\\\"key\\\":\\\"option_0\\\"},\\\"value\\\":\\\"是\\\",\\\"key\\\":\\\"DDSelectField_1WQMZXKZNYG00\\\"},{\\\"label\\\":\\\"原本是否有桩\\\",\\\"extendValue\\\":{\\\"label\\\":\\\"无桩\\\",\\\"key\\\":\\\"option_0\\\"},\\\"value\\\":\\\"无桩\\\",\\\"key\\\":\\\"DDSelectField_1DC3AHQGPUAO0\\\"},{\\\"label\\\":\\\"可否增容\\\",\\\"extendValue\\\":{\\\"label\\\":\\\"是\\\",\\\"key\\\":\\\"option_0\\\"},\\\"value\\\":\\\"是\\\",\\\"key\\\":\\\"DDSelectField_1XTFT3TBAM5C0\\\"},{\\\"label\\\":\\\"电源点照片\\\",\\\"value\\\":\\\"[\\\\\\\"https://static.dingtalk.com/media/lQDPM45CoMm1DZjNA2TNB4Cw8bLOpIgURGYDuZl3iIDaAA_1920_868.jpg\\\\\\\"]\\\",\\\"key\\\":\\\"DDPhotoField_1L1QGYEMUWQO0\\\"},{\\\"label\\\":\\\"预计购电渠道\\\",\\\"extendValue\\\":{\\\"label\\\":\\\"国家电网\\\",\\\"key\\\":\\\"option_0\\\"},\\\"value\\\":\\\"国家电网\\\",\\\"key\\\":\\\"DDSelectField_1R6WRGG6B0BK0\\\"},{\\\"label\\\":\\\"商务踏勘结论\\\",\\\"extendValue\\\":{\\\"label\\\":\\\"可以安装\\\",\\\"key\\\":\\\"option_0\\\"},\\\"value\\\":\\\"可以安装\\\",\\\"key\\\":\\\"DDSelectField_219QB3HBHEXS0\\\"}],\\\"rowNumber\\\":\\\"TableField_5PBLZKGF2JO0_11VNETXBA3QO0\\\"}]\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"DDSelectField\",\n" +
            "\t\t\t\"id\": \"DDSelectField_1DD79N4PSTC00\",\n" +
            "\t\t\t\"name\": \"经营评审-周边资产使用情况（交流）\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"DDSelectField\",\n" +
            "\t\t\t\"extValue\": \"{\\\"label\\\":\\\"C级-普通\\\",\\\"key\\\":\\\"option_2\\\"}\",\n" +
            "\t\t\t\"id\": \"DDSelectField_1WYLFH6I3PZ40\",\n" +
            "\t\t\t\"name\": \"经营评审-周边资产使用情况（其他）\",\n" +
            "\t\t\t\"value\": \"C级-普通\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"TextareaField\",\n" +
            "\t\t\t\"id\": \"TextareaField_1CQHX1X6WXUO0\",\n" +
            "\t\t\t\"name\": \"经营评审-周边情况描述\",\n" +
            "\t\t\t\"value\": \"【使用】3KM内共1个站点有充电订单(1直流0个交流0个交直一体)，KA运营商有0个（tld xx gw）\\n    全站点总计等级：较差\\n    没有交流站有充电订单\\n【周边站点密度】：极低；1KM内\\n【周边小区数】：极低；1KM内\\n附近1KM完全没有充电站和小区\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"DDSelectField\",\n" +
            "\t\t\t\"extValue\": \"{\\\"label\\\":\\\"是\\\",\\\"key\\\":\\\"option_0\\\"}\",\n" +
            "\t\t\t\"id\": \"DDSelectField_1NSJ6RBSYXB40\",\n" +
            "\t\t\t\"name\": \"工程部确认-是否进行工程踏勘\",\n" +
            "\t\t\t\"value\": \"是\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"InnerContactField\",\n" +
            "\t\t\t\"extValue\": \"[{\\\"emplId\\\":\\\"LSNY10003\\\",\\\"itemId\\\":\\\"LSNY10003\\\",\\\"name\\\":\\\"张峰\\\",\\\"selectDeptName\\\":\\\"\\\",\\\"avatar\\\":\\\"\\\",\\\"selectDeptId\\\":\\\"\\\"}]\",\n" +
            "\t\t\t\"id\": \"InnerContactField_N605I70FOLS0\",\n" +
            "\t\t\t\"name\": \"工程踏勘人员\",\n" +
            "\t\t\t\"value\": \"张峰\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"TextField\",\n" +
            "\t\t\t\"id\": \"TextField_235MVGT4U6PS0\",\n" +
            "\t\t\t\"name\": \"工程踏勘编码\",\n" +
            "\t\t\t\"value\": \"GCKC-202301-ZF-020\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"TableField\",\n" +
            "\t\t\t\"extValue\": \"{\\\"statValue\\\":[],\\\"componentName\\\":\\\"TableField\\\"}\",\n" +
            "\t\t\t\"id\": \"TableField_1SRDNF2U05FK0\",\n" +
            "\t\t\t\"name\": \"工程踏勘-基本信息\",\n" +
            "\t\t\t\"value\": \"[{\\\"rowValue\\\":[{\\\"label\\\":\\\"工程踏勘日期\\\",\\\"value\\\":\\\"2023-01-12\\\",\\\"key\\\":\\\"DDDateField_1Z11F8GD6EAO0\\\"},{\\\"label\\\":\\\"项目性质\\\",\\\"extendValue\\\":{\\\"extension\\\":{\\\"image\\\":\\\"\\\"},\\\"label\\\":\\\"新建\\\",\\\"key\\\":\\\"option_19QAS3O0XQ4G0\\\"},\\\"value\\\":\\\"新建\\\",\\\"key\\\":\\\"DDSelectField_8DIHOS2CQ1W0\\\"},{\\\"label\\\":\\\"土地使用权是否自有\\\",\\\"extendValue\\\":{\\\"label\\\":\\\"是\\\",\\\"key\\\":\\\"option_0\\\"},\\\"value\\\":\\\"是\\\",\\\"key\\\":\\\"DDSelectField_13X6TAGQP9C00\\\"},{\\\"label\\\":\\\"项目级别\\\",\\\"extendValue\\\":{\\\"label\\\":\\\"小型项目\\\",\\\"key\\\":\\\"option_0\\\"},\\\"value\\\":\\\"小型项目\\\",\\\"key\\\":\\\"DDSelectField_GC2NVXHKJZ40\\\"},{\\\"label\\\":\\\"现场联系人\\\",\\\"value\\\":\\\"廖鹏飞\\\",\\\"key\\\":\\\"TextField_1403A7ZG9JUK0\\\"},{\\\"label\\\":\\\"联系电话\\\",\\\"value\\\":\\\"18602668650\\\",\\\"key\\\":\\\"TextField_1GE9F6BXMAHS0\\\"},{\\\"label\\\":\\\"邮箱\\\",\\\"value\\\":\\\"无\\\",\\\"key\\\":\\\"TextField_B9FC36M161K0\\\"},{\\\"label\\\":\\\"设计方案需求日期\\\",\\\"value\\\":\\\"2023-01-12\\\",\\\"key\\\":\\\"DDDateField_SLX14AARCCW0\\\"}],\\\"rowNumber\\\":\\\"TableField_1SRDNF2U05FK0_18KJ8GXWBL0G0\\\"}]\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"TableField\",\n" +
            "\t\t\t\"extValue\": \"{\\\"statValue\\\":[],\\\"componentName\\\":\\\"TableField\\\"}\",\n" +
            "\t\t\t\"id\": \"TableField_IQXL21GGZYO0\",\n" +
            "\t\t\t\"name\": \"工程踏勘-配电基本情况\",\n" +
            "\t\t\t\"value\": \"[{\\\"rowValue\\\":[{\\\"label\\\":\\\"是否有配电室\\\",\\\"extendValue\\\":{\\\"label\\\":\\\"否\\\",\\\"key\\\":\\\"option_1\\\"},\\\"value\\\":\\\"否\\\",\\\"key\\\":\\\"DDSelectField_1W70WUXSXM000\\\"},{\\\"label\\\":\\\"说明\\\",\\\"value\\\":\\\"配电箱情况（如果没有配电室）\\\",\\\"key\\\":\\\"TextNote_U8HU1Q16IMO0\\\"}],\\\"rowNumber\\\":\\\"TableField_IQXL21GGZYO0_CNZU4HHJFI80\\\"}]\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"TableField\",\n" +
            "\t\t\t\"extValue\": \"{\\\"statValue\\\":[],\\\"componentName\\\":\\\"TableField\\\"}\",\n" +
            "\t\t\t\"id\": \"TableField_GFLOJZOBBH40\",\n" +
            "\t\t\t\"name\": \"工程踏勘-客户需求情况\",\n" +
            "\t\t\t\"value\": \"[{\\\"rowValue\\\":[{\\\"label\\\":\\\"电源接入位置\\\",\\\"extendValue\\\":{\\\"extension\\\":{\\\"image\\\":\\\"\\\"},\\\"label\\\":\\\"其它\\\",\\\"key\\\":\\\"other\\\"},\\\"value\\\":\\\"其它\\\",\\\"key\\\":\\\"DDSelectField_1Q7HUMLD5NY80\\\"},{\\\"label\\\":\\\"说明\\\",\\\"value\\\":\\\"需求终端数量\\\",\\\"key\\\":\\\"TextNote_PP8TAHDTD4G0\\\"},{\\\"label\\\":\\\"直流充电桩个数\\\",\\\"value\\\":\\\"5\\\",\\\"key\\\":\\\"NumberField_1YMCV9GSWQ680\\\"},{\\\"label\\\":\\\"直流充电桩功率\\\",\\\"value\\\":\\\"120\\\",\\\"key\\\":\\\"NumberField_L4DEIWCC6C00\\\"},{\\\"label\\\":\\\"交流充电桩个数\\\",\\\"value\\\":\\\"6\\\",\\\"key\\\":\\\"NumberField_1ORDBNM0VJZ40\\\"},{\\\"label\\\":\\\"交流充电桩功率\\\",\\\"value\\\":\\\"7\\\",\\\"key\\\":\\\"NumberField_1RH0VRTOBXUO0\\\"}],\\\"rowNumber\\\":\\\"TableField_GFLOJZOBBH40_13XG2HS8660W0\\\"}]\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"TableField\",\n" +
            "\t\t\t\"extValue\": \"{\\\"statValue\\\":[],\\\"componentName\\\":\\\"TableField\\\"}\",\n" +
            "\t\t\t\"id\": \"TableField_DO5Q79HXUU00\",\n" +
            "\t\t\t\"name\": \"工程踏勘-现场情况\",\n" +
            "\t\t\t\"value\": \"[{\\\"rowValue\\\":[{\\\"label\\\":\\\"说明\\\",\\\"value\\\":\\\"现场尺寸\\\",\\\"key\\\":\\\"TextNote_1WVE868QD2OW0\\\"},{\\\"label\\\":\\\"电源接入点与充电配电箱的距离\\\",\\\"value\\\":\\\"0\\\",\\\"key\\\":\\\"NumberField_ACGCOH539O00\\\"},{\\\"label\\\":\\\"充电配电箱与充电终端的距离\\\",\\\"value\\\":\\\"0\\\",\\\"key\\\":\\\"NumberField_8XIGKCC7RU40\\\"},{\\\"label\\\":\\\"周围危险物识别（多选）\\\",\\\"extendValue\\\":[{\\\"image\\\":\\\"\\\",\\\"label\\\":\\\"无\\\",\\\"key\\\":\\\"option_12ILBT3Y5AM80\\\"}],\\\"value\\\":[\\\"无\\\"],\\\"key\\\":\\\"DDMultiSelectField_14OWG8E644TC0\\\"}],\\\"rowNumber\\\":\\\"TableField_DO5Q79HXUU00_SSS2S6MJBYO0\\\"}]\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"InnerContactField\",\n" +
            "\t\t\t\"extValue\": \"[{\\\"emplId\\\":\\\"LSNY10003\\\",\\\"itemId\\\":\\\"LSNY10003\\\",\\\"name\\\":\\\"张峰\\\",\\\"selectDeptName\\\":\\\"\\\",\\\"avatar\\\":\\\"\\\",\\\"selectDeptId\\\":\\\"781370520\\\"}]\",\n" +
            "\t\t\t\"id\": \"InnerContactField_1DJAN8RG1XPC0\",\n" +
            "\t\t\t\"name\": \"工程技术方案编制人\",\n" +
            "\t\t\t\"value\": \"张峰\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"TableField\",\n" +
            "\t\t\t\"extValue\": \"{\\\"statValue\\\":[],\\\"componentName\\\":\\\"TableField\\\"}\",\n" +
            "\t\t\t\"id\": \"TableField_1BDXVX539VI80\",\n" +
            "\t\t\t\"name\": \"工程踏勘-技术方案\",\n" +
            "\t\t\t\"value\": \"[{\\\"rowValue\\\":[{\\\"label\\\":\\\"工程预计造价\\\",\\\"value\\\":\\\"410456.48\\\",\\\"key\\\":\\\"NumberField_1BM62E2BNC3K0\\\"},{\\\"label\\\":\\\"附件2：工程造价报价单\\\",\\\"value\\\":[{\\\"spaceId\\\":\\\"166989756\\\",\\\"fileName\\\":\\\"东沽停车场.xlsx\\\",\\\"fileSize\\\":20845,\\\"fileType\\\":\\\"xlsx\\\",\\\"fileId\\\":\\\"94496033962\\\"}],\\\"key\\\":\\\"DDAttachment_1C2M88OWYJ1C0\\\"}],\\\"rowNumber\\\":\\\"TableField_1BDXVX539VI80_1DT6OW7KCITC0\\\"}]\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"InnerContactField\",\n" +
            "\t\t\t\"id\": \"InnerContactField_1Y26098YZKWW0\",\n" +
            "\t\t\t\"name\": \"工程踏勘审核人\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"TextNote\",\n" +
            "\t\t\t\"id\": \"TextNote_3ZVWUDCS4180\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"NumberField\",\n" +
            "\t\t\t\"id\": \"NumberField_KA4HN3PFW4W0\",\n" +
            "\t\t\t\"name\": \"拟投资含税金额\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"NumberField\",\n" +
            "\t\t\t\"id\": \"NumberField_85858G8B3VW0\",\n" +
            "\t\t\t\"name\": \"场地合同年限\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"DDDateField\",\n" +
            "\t\t\t\"id\": \"DDDateField_20JH1XQ6IRS00\",\n" +
            "\t\t\t\"name\": \"生效日期\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"DDDateField\",\n" +
            "\t\t\t\"id\": \"DDDateField_LRI7MRXRZ280\",\n" +
            "\t\t\t\"name\": \"失效日期\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"DDDateField\",\n" +
            "\t\t\t\"id\": \"DDDateField_1P7XPDU19WSG\",\n" +
            "\t\t\t\"name\": \"计划投建日期\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"DDSelectField\",\n" +
            "\t\t\t\"id\": \"DDSelectField_13QETIHWBRGG0\",\n" +
            "\t\t\t\"name\": \"投建类型\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"DDSelectField\",\n" +
            "\t\t\t\"id\": \"DDSelectField_17MI1PRL5VUO0\",\n" +
            "\t\t\t\"name\": \"场地提供方收益模式\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"NumberField\",\n" +
            "\t\t\t\"id\": \"NumberField_1OZY0AX7D5280\",\n" +
            "\t\t\t\"name\": \"场地租赁费/分成比例\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"NumberField\",\n" +
            "\t\t\t\"id\": \"NumberField_1KCYZ7CVBHR40\",\n" +
            "\t\t\t\"name\": \"资产方静态投资回报期\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"NumberField\",\n" +
            "\t\t\t\"id\": \"NumberField_GYLAW3HNEOO\",\n" +
            "\t\t\t\"name\": \"IRR\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"bizAlias\": \"\",\n" +
            "\t\t\t\"componentType\": \"DDAttachment\",\n" +
            "\t\t\t\"id\": \"DDAttachment_78EYYP0MI480\",\n" +
            "\t\t\t\"name\": \"投资测算表\"\n" +
            "\t\t}\n" +
            "\t]";

    public static void main(String[] args) {
        createMapper(text);
    }

    private static void createMapper(String text){
        Map<String, String> filedMap = new LinkedHashMap<>(16);
        List<FormComponentBean> formComponentBeans = JSONObject.parseArray(text, FormComponentBean.class);
        CaOaStationInfo caOaStationInfo = new CaOaStationInfo();
        for (FormComponentBean formComponentBean : formComponentBeans) {
            //table列表需要特殊处理
            if (TABLE_TYPE_LIST.contains(formComponentBean.getComponentType())) {
                String value = formComponentBean.getValue();
                JSONObject jsonObject = (JSONObject) (JSONObject.parseArray(value).get(0));
                jsonObject.get("rowValue");
                List<TableRowValue> tableRowValues = JSONObject.parseArray(jsonObject.getString("rowValue"), TableRowValue.class);
                for (TableRowValue tableRowValue : tableRowValues) {
                    filedMap.put(tableRowValue.getLabel(), tableRowValue.getValue());
//                    ClassFiledUtil.assignmentByFiled(caOaStationInfo, tableRowValue.getKey(), tableRowValue.getValue());
                }
                continue;
            }
            filedMap.put(formComponentBean.getName(), formComponentBean.getValue());
//            ClassFiledUtil.assignmentByFiled(caOaStationInfo, formComponentBean.getId(), formComponentBean.getValue());
        }
        System.out.println(JSON.toJSONString(filedMap));
    }
}
