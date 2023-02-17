package com.data.create.entity;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhougf
 * @desc 钉钉id对应BO字段类
 * @date 2023/01/05 15:59
 */
public class FiledMatchConst {

    public static final String FILED_MATCH = "{\n" +
            "    \"DDSelectField_14KJEFHALXHC0\":\"channelCompany\",\n" +
            "    \"DepartmentField_ANZO8PU7ZOW0\":\"channelCompanyDepartment\",\n" +
            "    \"DDSelectField_1EGZFD4I5K2O0\":\"channelCooperationMode\",\n" +
            "    \"TextField_6RC2AB1KUD40\":\"stationName\",\n" +
            "    \"TextField_1SBDFT5XS35S0\":\"stationCompanyName\",\n" +
            "    \"TextField_1IJJWYXPV8E80\":\"stationResponsibilityPerson\",\n" +
            "    \"PhoneField_IB3KRIW4Y0O0\":\"stationResponsibilityPersonPhone\",\n" +
            "    \"TextField_1HXZX5NJ54E80\":\"commercialPersonnel\",\n" +
            "    \"DDDateField_1HPBZJ8G2GW00\":\"visitDate\",\n" +
            "    \"TextField_1IBKW5OXN6740\":\"visitBusinessCode\",\n" +
            "    \"DDSelectField_11N4W5ZB8NY80\":\"stationType\",\n" +
            "    \"AddressField_21EIBP0IT6OW0\":\"stationAddress\",\n" +
            "    \"NumberField_1PD1Y2J89M1S0\":\"lon\",\n" +
            "    \"NumberField_WCEPB7T53I80\":\"lat\",\n" +
            "    \"NumberField_20T85TMI5WN4\":\"serviceCharge\",\n" +
            "    \"DDSelectField_1HDLA4BDBYKG0\":\"stationAcceptanceStatus\",\n" +
            "    \"DDDateField_WHROXK50GM80\":\"stationAcceptanceDate\",\n" +
            "    \"MoneyField_1LSHUCASL1SW0\":\"businessExpense\",\n" +
            "    \"DDSelectField_8GYGGY6VB5K0\":\"installationArea\",\n" +
            "    \"DDSelectField_88VOYJGYI9S0\":\"plannedInstallationLocation\",\n" +
            "    \"CalculateField_1EDVYRC2A78G0\":\"totalPileNumber\",\n" +
            "    \"DDSelectField_22DUKTF2M7PC0\":\"electricityPriceType\",\n" +
            "    \"NumberField_1NFJABP5C74W0\":\"electricityPrice\",\n" +
            "    \"DDSelectField_1OCK5302QJ6O0\":\"priceFluctuation\",\n" +
            "    \"NumberField_1YXIZU2FEOG00\":\"fluctuationPrice\",\n" +
            "    \"DDSelectField_TJG76WQNUXS0\":\"communicationSignal\",\n" +
            "    \"DDSelectField_LFNV2AIK1G00\":\"electricVehicleChargingModel\",\n" +
            "    \"DDSelectField_1WQMZXKZNYG00\":\"parkingSpaceSupply\",\n" +
            "    \"DDSelectField_1DC3AHQGPUAO0\":\"pileSituation\",\n" +
            "    \"DDSelectField_1XTFT3TBAM5C0\":\"increaseCapacityFlag\",\n" +
            "    \"DDPhotoField_1L1QGYEMUWQO0\":\"powerPoint\",\n" +
            "    \"DDSelectField_1R6WRGG6B0BK0\":\"estimatedPurchasingChannels\",\n" +
            "    \"DDSelectField_219QB3HBHEXS0\":\"visitResult\",\n" +
            "\t\"NumberField_KV56OYAIWXO0\":\"electricVehiclesNumber\",\n" +
            "    \"DDAttachment_78EYYP0MI480\":\"investmentStatement\",\n" +
            "    \"NumberField_1KCYZ7CVBHR40\":\"assetsReturnCycle\",\n" +
            "    \"NumberField_9XX7O06ELIG0\":\"fastChargePileNumber\",\n" +
            "    \"NumberField_7FRN4MII9IG0\":\"slowChargePilePower\",\n" +
            "    \"NumberField_1OZY0AX7D5280\":\"shareRatio\",\n" +
            "    \"DDDateField_LRI7MRXRZ280\":\"expirationDate\",\n" +
            "    \"InnerContactField_N605I70FOLS0\":\"projectReconnaissancePersonnel\",\n" +
            "    \"TextField_843DQ6KJUUK0\":\"pileReplacementReason\",\n" +
            "    \"TextareaField_1NJ55SFTMJ9C0\":\"visitProcessinstanceResult\",\n" +
            "    \"DDSelectField_1OG2JXV7CCE8\":\"buildingLightStorageFlag\",\n" +
            "    \"DDSelectField_1WYLFH6I3PZ40\":\"assetUsage\",\n" +
            "    \"NumberField_1TMX8HPHV7J40\":\"valleyPrice\",\n" +
            "    \"DDDateField_20JH1XQ6IRS00\":\"effectiveDate\",\n" +
            "    \"NumberField_2F5YROBDM7OK\":\"surplusCapacitance\",\n" +
            "    \"NumberField_29JX1AGCCC00\":\"transformerCapacity\",\n" +
            "    \"NumberField_85858G8B3VW0\":\"siteContractLife\",\n" +
            "    \"DDSelectField_MMKRGZGDYYO0\":\"parkingSituation\",\n" +
            "    \"NumberField_1HCGI2I60Q1S\":\"freeQuantity\",\n" +
            "    \"DDDateField_1P7XPDU19WSG\":\"plannedConstructionDate\",\n" +
            "    \"InnerContactField_1DJAN8RG1XPC0\":\"echnicalPlanPreparer\",\n" +
            "    \"TextField_QEZCYGKL4QO0\":\"openingTimes\",\n" +
            "    \"TextField_235MVGT4U6PS0\":\"reconnaissanceCoding\",\n" +
            "    \"DDPhotoField_1C9UDCLBW8PS0\":\"installationPositionPicture\",\n" +
            "    \"NumberField_1EGDV2O9WWYO0\":\"flatPrice\",\n" +
            "    \"TextareaField_1CQHX1X6WXUO0\":\"situationDescription\",\n" +
            "    \"NumberField_149MMLSE5G680\":\"stationSpacesNumber\",\n" +
            "    \"NumberField_1A6NASQXQ9Z40\":\"fastChargePilePower\",\n" +
            "    \"NumberField_1ZEUNZO6GH1C0\":\"peakElectricityPrice\",\n" +
            "    \"NumberField_GYLAW3HNEOO\":\"irr\",\n" +
            "    \"DDDateField_BGFP5Y1EXK80\":\"installationDate\",\n" +
            "    \"InnerContactField_1Y26098YZKWW0\":\"visitAuditPerson\",\n" +
            "    \"NumberField_YAZ9RNJ6XF40\":\"slowChargePileNumber\",\n" +
            "    \"NumberField_KA4HN3PFW4W0\":\"investedIncludingTax\",\n" +
            "    \"DDSelectField_17MI1PRL5VUO0\":\"providerRevenueModel\",\n" +
            "    \"DDSelectField_1DD79N4PSTC00\":\"assetUsageCurrent\",\n" +
            "    \"DDSelectField_21S6G4JNYHR40\":\"opticalStorageConstruction\",\n" +
            "    \"DDSelectField_1NSJ6RBSYXB40\":\"projectVisitFlag\",\n" +
            "    \"DDSelectField_13QETIHWBRGG0\":\"investmentType\"\n" +
            "}";

    public static  Map<String, String> FILED_MATCH_MAP = JSON.parseObject(FILED_MATCH, HashMap.class);

    public static final String filed_match_message = "{\n" +
            "\t\"TableField_DO5Q79HXUU00\": \"工程踏勘-现场情况\",\n" +
            "\t\"NumberField_1ORDBNM0VJZ40\": \"交流充电桩个数\",\n" +
            "\t\"NumberField_9XX7O06ELIG0\": \"快充桩个数\",\n" +
            "\t\"TextField_2224D4J1PK8W0\": \"服务车型推荐\",\n" +
            "\t\"DDSelectField_22DUKTF2M7PC0\": \"电价类型\",\n" +
            "\t\"TextField_1NWNRPU3R49S0\": \"备用开关型号\",\n" +
            "\t\"NumberField_1RH0VRTOBXUO0\": \"交流充电桩功率\",\n" +
            "\t\"TextField_RI3OUZI7JUO0\": \"保障措施\",\n" +
            "\t\"NumberField_1OZY0AX7D5280\": \"场地租赁费/分成比例\",\n" +
            "\t\"NumberField_20T85TMI5WN4\": \"该地度电服务费\",\n" +
            "\t\"DDSelectField_1E1M1KYSSJGG\": \"现场布置图\",\n" +
            "\t\"InnerContactField_N605I70FOLS0\": \"工程踏勘人员\",\n" +
            "\t\"TableField_ZO74PW7CFFK0\": \"工程踏勘-导引指示及安全规则\",\n" +
            "\t\"NumberField_1V2H6MC085R40\": \"交流终端个数\",\n" +
            "\t\"DDPhotoField_1U1REIFCUJ280\": \"箱变安放位置照片\",\n" +
            "\t\"DDDateField_20JH1XQ6IRS00\": \"生效日期\",\n" +
            "\t\"NumberField_2F5YROBDM7OK\": \"富余电容\",\n" +
            "\t\"DDSelectField_8GYGGY6VB5K0\": \"安装区域（地上或地下）\",\n" +
            "\t\"DDSelectField_1XTFT3TBAM5C0\": \"可否增容\",\n" +
            "\t\"DDMultiSelectField_1Z1M3MF1OHPC0\": \"终端形式（多选）\",\n" +
            "\t\"NumberField_1LV3VJ7LGFXC0\": \"运营直流终端数量\",\n" +
            "\t\"TextField_QEZCYGKL4QO0\": \"对外开放时间\",\n" +
            "\t\"TextField_2QEULBG147W0\": \"合作方基本情况及意义\",\n" +
            "\t\"TextField_1AXCB3ZZIEJK0\": \"导引尺寸\",\n" +
            "\t\"DDAttachment_AU6LGA1XJWO0\": \"附件1：工程CAD图1\",\n" +
            "\t\"NumberField_QBA1FEGZZK00\": \"交流充电终端功率（KW）\",\n" +
            "\t\"DDSelectField_14KJEFHALXHC0\": \"渠道方\",\n" +
            "\t\"TextField_1403A7ZG9JUK0\": \"现场联系人\",\n" +
            "\t\"DDMultiSelectField_14OWG8E644TC0\": \"周围危险物识别（多选）\",\n" +
            "\t\"NumberField_1ZEUNZO6GH1C0\": \"峰电价\",\n" +
            "\t\"DDSelectField_1W70WUXSXM000\": \"是否有配电室\",\n" +
            "\t\"TextField_VBXE1PPH3J40\": \"营销经理建议\",\n" +
            "\t\"NumberField_GYLAW3HNEOO\": \"IRR\",\n" +
            "\t\"NumberField_8XIGKCC7RU40\": \"充电配电箱与充电终端的距离\",\n" +
            "\t\"InnerContactField_1Y26098YZKWW0\": \"工程踏勘审核人\",\n" +
            "\t\"NumberField_YAZ9RNJ6XF40\": \"慢充桩个数\",\n" +
            "\t\"DDPhotoField_1KL4W59K58QO0\": \"电缆走线经过的地面照片\",\n" +
            "\t\"DDSelectField_17MI1PRL5VUO0\": \"场地提供方收益模式\",\n" +
            "\t\"DDSelectField_21S6G4JNYHR40\": \"具备光储建设条件\",\n" +
            "\t\"NumberField_1JNWR2VZHSW00\": \"客户车位总数\",\n" +
            "\t\"DDMultiSelectField_C1G74KT7LFC0\": \"现场照片（多选）\",\n" +
            "\t\"NumberField_JK2WYVL84NK0\": \"可用容量\",\n" +
            "\t\"DDPhotoField_1L1QGYEMUWQO0\": \"电源点照片\",\n" +
            "\t\"DDSelectField_131LY4WZL9RK0\": \"是否为用户私有\",\n" +
            "\t\"DDSelectField_8DIHOS2CQ1W0\": \"项目性质\",\n" +
            "\t\"TextField_8J0W9M9W2NW0\": \"用户总容量\",\n" +
            "\t\"NumberField_USPOI18CX3K0\": \"直流充电终端个数\",\n" +
            "\t\"NumberField_1XO8BZM3G6TC0\": \"活动预算金额\",\n" +
            "\t\"DDDateField_1Z7MX27E9RPC0\": \"活动时间\",\n" +
            "\t\"DDSelectField_2211JYU3KT4W\": \"电子版一次图\",\n" +
            "\t\"TextField_1IJJWYXPV8E80\": \"场地负责人\",\n" +
            "\t\"DDSelectField_78J3UACN4YW0\": \"配电室产权归属\",\n" +
            "\t\"TableField_1SRDNF2U05FK0\": \"工程踏勘-基本信息\",\n" +
            "\t\"NumberField_85858G8B3VW0\": \"场地合同年限\",\n" +
            "\t\"DDSelectField_1OCK5302QJ6O0\": \"基础电价是否上浮\",\n" +
            "\t\"NumberField_1G4OW97UAU1S0\": \"空壳交流终端数量\",\n" +
            "\t\"TableField_IQXL21GGZYO0\": \"工程踏勘-配电基本情况\",\n" +
            "\t\"TextField_235MVGT4U6PS0\": \"工程踏勘编码\",\n" +
            "\t\"NumberField_1PD1Y2J89M1S0\": \"经度（高德地图）\",\n" +
            "\t\"TextField_1GE9F6BXMAHS0\": \"联系电话\",\n" +
            "\t\"TextareaField_1CQHX1X6WXUO0\": \"经营评审-周边情况描述\",\n" +
            "\t\"DDSelectField_J3UMOZXA7Z40\": \"备用开关\",\n" +
            "\t\"DDSelectField_LFNV2AIK1G00\": \"对于充电汽车停车收费标准\",\n" +
            "\t\"TextField_16YO8943N5OG0\": \"用户其他需求\",\n" +
            "\t\"DDDateField_BGFP5Y1EXK80\": \"预计安装日期\",\n" +
            "\t\"DDSelectField_13X6TAGQP9C00\": \"土地使用权是否自有\",\n" +
            "\t\"NumberField_ACGCOH539O00\": \"电源接入点与充电配电箱的距离\",\n" +
            "\t\"DDSelectField_TJG76WQNUXS0\": \"通信信号\",\n" +
            "\t\"DDSelectField_1Q7HUMLD5NY80\": \"电源接入位置\",\n" +
            "\t\"DDDateField_1HPBZJ8G2GW00\": \"踏勘日期\",\n" +
            "\t\"NumberField_KA4HN3PFW4W0\": \"拟投资含税金额\",\n" +
            "\t\"NumberField_1NFJABP5C74W0\": \"基础电价\",\n" +
            "\t\"DDSelectField_13QETIHWBRGG0\": \"投建类型\",\n" +
            "\t\"DDPhotoField_1I4E87X800IO0\": \"车位整体布置照片\",\n" +
            "\t\"TableField_5PBLZKGF2JO0\": \"商务踏勘信息(仅可填1行)\",\n" +
            "\t\"DDSelectField_1R6WRGG6B0BK0\": \"预计购电渠道\",\n" +
            "\t\"DDPhotoField_Q4UGA7MW1SG0\": \"电子版一次图\",\n" +
            "\t\"DDPhotoField_1DRNJUXLSAHS0\": \"合作方与产权方的关系证明\",\n" +
            "\t\"DepartmentField_ANZO8PU7ZOW0\": \"渠道合作部门\",\n" +
            "\t\"DDDateField_LRI7MRXRZ280\": \"失效日期\",\n" +
            "\t\"TextField_843DQ6KJUUK0\": \"替代原有桩原因/ 与原有桩共存原因\",\n" +
            "\t\"TextField_6RC2AB1KUD40\": \"场地名称\",\n" +
            "\t\"MoneyField_1LSHUCASL1SW0\": \"一次性商务费用\",\n" +
            "\t\"TextareaField_1NJ55SFTMJ9C0\": \"原因\",\n" +
            "\t\"NumberField_9L9IRXLLJ1O0\": \"现有新能源车数量\",\n" +
            "\t\"CalculateField_1EDVYRC2A78G0\": \"总计安装充电桩数（个）\",\n" +
            "\t\"NumberField_1TMX8HPHV7J40\": \"谷电价\",\n" +
            "\t\"NumberField_29JX1AGCCC00\": \"变压器容量\",\n" +
            "\t\"TextField_1SBDFT5XS35S0\": \"场地方公司名称\",\n" +
            "\t\"TextField_1LCUBZZ43JTS0\": \"变压器大小\",\n" +
            "\t\"NumberField_1BM62E2BNC3K0\": \"工程预计造价\",\n" +
            "\t\"DDDateField_1P7XPDU19WSG\": \"计划投建日期\",\n" +
            "\t\"DDSelectField_1DC3AHQGPUAO0\": \"原本是否有桩\",\n" +
            "\t\"NumberField_LAEPORQAIEO0\": \"分成比例\",\n" +
            "\t\"TextField_1CU0N35KMQ3K0\": \"导引材质\",\n" +
            "\t\"DDPhotoField_452P5AOTMV40\": \"土地产权证明\",\n" +
            "\t\"DDSelectField_1SSM9643QL1C0\": \"低压柜备用回路\",\n" +
            "\t\"NumberField_1A6NASQXQ9Z40\": \"快充桩功率\",\n" +
            "\t\"DDDateField_1Z11F8GD6EAO0\": \"工程踏勘日期\",\n" +
            "\t\"DDDateField_SLX14AARCCW0\": \"设计方案需求日期\",\n" +
            "\t\"NumberField_WCEPB7T53I80\": \"纬度（高德地图）\",\n" +
            "\t\"TextField_8O89U7L38VK0\": \"联系人职务\",\n" +
            "\t\"DDSelectField_219QB3HBHEXS0\": \"商务踏勘结论\",\n" +
            "\t\"NumberField_KV56OYAIWXO0\": \"当前电动汽车数\",\n" +
            "\t\"TextField_1ER44Y5E4LB40\": \"主进开关大小\",\n" +
            "\t\"DDAttachment_78EYYP0MI480\": \"投资测算表\",\n" +
            "\t\"TextField_JMLLN36HJ940\": \"低压柜备用回路开关型号\",\n" +
            "\t\"DDPhotoField_XDYIJZ47PCW0\": \"电源接入位置照片\",\n" +
            "\t\"NumberField_1KCYZ7CVBHR40\": \"资产方静态投资回报期\",\n" +
            "\t\"DDSelectField_11N4W5ZB8NY80\": \"场地属性\",\n" +
            "\t\"TableField_GFLOJZOBBH40\": \"工程踏勘-客户需求情况\",\n" +
            "\t\"NumberField_7FRN4MII9IG0\": \"慢充桩功率\",\n" +
            "\t\"NumberField_1IJJWYXQXOQO0\": \"直流充电终端功率\",\n" +
            "\t\"TextField_1HXZX5NJ54E80\": \"商务人员\",\n" +
            "\t\"TextField_1UE36HRIT3J40\": \"现有负荷使用容量\",\n" +
            "\t\"DDSelectField_1XLGHNQEI20W0\": \"充电站类别\",\n" +
            "\t\"TextField_1Z2L92YELVGG0\": \"导引数量\",\n" +
            "\t\"TextField_142PT4YKJB280\": \"项目经理建议\",\n" +
            "\t\"TextField_1IBKW5OXN6740\": \"商务踏勘编码\",\n" +
            "\t\"NumberField_1YMCV9GSWQ680\": \"直流充电桩个数\",\n" +
            "\t\"DDSelectField_1EGZFD4I5K2O0\": \"渠道方合作模式\",\n" +
            "\t\"TableField_1BDXVX539VI80\": \"工程踏勘-技术方案\",\n" +
            "\t\"TextareaField_X6W6L0XJNXS0\": \"技术方案安排\",\n" +
            "\t\"NumberField_1E29HRLLJD6O0\": \"停车收费标准\",\n" +
            "\t\"DDAttachment_1C2M88OWYJ1C0\": \"附件2：工程造价报价单\",\n" +
            "\t\"DDPhotoField_1DBLNZNUFTNK0\": \"车位照片   （地上、地下）\",\n" +
            "\t\"NumberField_1YXIZU2FEOG00\": \"上浮金额（元/度）\",\n" +
            "\t\"DDSelectField_1OG2JXV7CCE8\": \"是否建光储\",\n" +
            "\t\"DDSelectField_1WYLFH6I3PZ40\": \"经营评审-周边资产使用情况（其他）\",\n" +
            "\t\"DDSelectField_1HDLA4BDBYKG0\": \"该场地是否已验收启用\",\n" +
            "\t\"NumberField_RQ9WFQ084F40\": \"空壳直流终端数量\",\n" +
            "\t\"TextField_1YZ0K5JAO1OG0\": \"活动策划\",\n" +
            "\t\"DDSelectField_MMKRGZGDYYO0\": \"当前停车情况\",\n" +
            "\t\"NumberField_1HCGI2I60Q1S\": \"空开数量\",\n" +
            "\t\"TextField_B9FC36M161K0\": \"邮箱\",\n" +
            "\t\"NumberField_YSI88D1V40W0\": \"运营交流终端数量\",\n" +
            "\t\"DDSelectField_1WQMZXKZNYG00\": \"电源及车位产权是否属于业主或合作方\",\n" +
            "\t\"InnerContactField_1DJAN8RG1XPC0\": \"工程技术方案编制人\",\n" +
            "\t\"TableField_46N49GDM5VW0\": \"工程踏勘-商务需求\",\n" +
            "\t\"DDPhotoField_AIEIET69X600\": \"停车收费信息牌\",\n" +
            "\t\"AddressField_21EIBP0IT6OW0\": \"详细地址\",\n" +
            "\t\"DDSelectField_GC2NVXHKJZ40\": \"项目级别\",\n" +
            "\t\"TableField_1T0W3WE9CB8G0\": \"工程踏勘-企划跟进情况\",\n" +
            "\t\"NumberField_L4DEIWCC6C00\": \"直流充电桩功率\",\n" +
            "\t\"DDPhotoField_1VKBK9Q95JDS0\": \"周围环境照片\",\n" +
            "\t\"DDPhotoField_1C9UDCLBW8PS0\": \"安装位置环境照片\",\n" +
            "\t\"NumberField_1EGDV2O9WWYO0\": \"平电价\",\n" +
            "\t\"NumberField_149MMLSE5G680\": \"站点车位数量\",\n" +
            "\t\"PhoneField_IB3KRIW4Y0O0\": \"负责人联系方式\",\n" +
            "\t\"DDDateField_WHROXK50GM80\": \"预计验收启用日期\",\n" +
            "\t\"DDSelectField_88VOYJGYI9S0\": \"计划安装位置\",\n" +
            "\t\"DDSelectField_1DD79N4PSTC00\": \"经营评审-周边资产使用情况（交流）\",\n" +
            "\t\"DDSelectField_1NSJ6RBSYXB40\": \"工程部确认-是否进行工程踏勘\"\n" +
            "}";

    public static  Map<String, String> FILED_MATCH_MESSAGE_MAP = JSON.parseObject(filed_match_message, HashMap.class);

}
