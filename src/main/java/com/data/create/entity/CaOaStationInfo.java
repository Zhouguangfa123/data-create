package com.data.create.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author zhougf
 * @since 2023-01-04
 */
@TableName("ca_oa_station_info")
@Getter
@Setter
public class CaOaStationInfo {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 踏勘实例id
     */
    private String visitProcessinstanceId;

    /**
     * 渠道方
     */
    private String channelCompany;

    /**
     * 渠道合作部门
     */
    private String channelCompanyDepartment;

    /**
     * 渠道合作模式
     */
    private String channelCooperationMode;

    /**
     * 踏勘编码
     */
    private String reconnaissanceCoding;

    /**
     * 场地名称
     */
    private String stationName;

    /**
     * 场地方公司名称
     */
    private String stationCompanyName;

    /**
     * 经度
     */
    private String lon;

    /**
     * 纬度
     */
    private String lat;

    /**
     * 场地负责人
     */
    private String stationResponsibilityPerson;

    /**
     * 场地负责人联系方式
     */
    private String stationResponsibilityPersonPhone;

    /**
     * 商务人员
     */
    private String commercialPersonnel;

    /**
     * 踏勘日期
     */
    private LocalDate visitDate;

    /**
     * 商务踏勘商务编码
     */
    private String visitBusinessCode;

    /**
     * 场地属性
     */
    private String stationType;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 详细地址
     */
    private String stationAddress;

    /**
     * 服务费 /度
     */
    private BigDecimal serviceCharge;

    /**
     * 该场地是否已验收启用
     */
    private String stationAcceptanceStatus;

    /**
     * 一次性商务费用
     */
    private BigDecimal businessExpense;

    /**
     * 安装区域 地上/地下
     */
    private String installationArea;

    /**
     * 计划安装位置
     */
    private String plannedInstallationLocation;

    /**
     * 安装位置照片
     */
    private String installationPositionPicture;

    /**
     * 慢充桩功率
     */
    private BigDecimal slowChargePilePower;

    /**
     * 慢充桩个数
     */
    private Integer slowChargePileNumber;

    /**
     * 快充桩个数
     */
    private BigDecimal fastChargePilePower;

    /**
     * 慢充桩个数
     */
    private Integer fastChargePileNumber;

    /**
     * 总计安装个数
     */
    private Integer totalPileNumber;

    /**
     * 电价类型
     */
    private String electricityPriceType;

    /**
     * 基础电价(元/度)
     */
    private String electricityPrice;

    /**
     * 基础电价是否上浮
     */
    private String priceFluctuation;

    /**
     * 上浮金额 (元/度)
     */
    private BigDecimal fluctuationPrice;

    /**
     * 峰电价
     */
    private BigDecimal peakElectricityPrice;

    /**
     * 平电价
     */
    private BigDecimal flatPrice;

    /**
     * 谷电价
     */
    private BigDecimal valleyPrice;

    /**
     * 通信信号
     */
    private String communicationSignal;

    /**
     * 站点车位数量
     */
    private Integer stationSpacesNumber;

    /**
     * 当前电动汽车数
     */
    private Integer electricVehiclesNumber;

    /**
     * 对于电动汽车收费标准
     */
    private String electricVehicleChargingModel;

    /**
     * 对外开放时间
     */
    private String openingTimes;

    /**
     * 停车收费信息牌
     */
    private String parkingRateInformationBoard;

    /**
     * 当前停车情况
     */
    private String parkingSituation;

    /**
     * 电源及车位产权是否属于业主或合作方
     */
    private String parkingSpaceSupply;

    /**
     * 土地产品证明
     */
    private String landTitleCertificate;

    /**
     * 原本是否有桩
     */
    private String pileSituation;

    /**
     * 替代原有桩原因/与原有桩共存原因
     */
    private String pileReplacementReason;

    /**
     * 富余电容(KW)
     */
    private BigDecimal surplusCapacitance;

    /**
     * 编译器容量(KVA)
     */
    private BigDecimal transformerCapacity;

    /**
     * 空开数量
     */
    private Integer freeQuantity;

    /**
     * 可否增容
     */
    private String increaseCapacityFlag;

    /**
     * 电源点照片
     */
    private String powerPoint;

    /**
     * 预计购电渠道
     */
    private String estimatedPurchasingChannels;

    /**
     * 具备光储建设条件
     */
    private String opticalStorageConstruction;

    /**
     * 是否建设光储
     */
    private String buildingLightStorageFlag;

    /**
     * 商务踏勘结论
     */
    private String visitResult;

    /**
     * 商务踏勘结论原因
     */
    private String visitResultReason;

    /**
     * 踏勘实例审批结果
     */
    private String visitProcessinstanceResult;

    /**
     * 踏勘实例审批状态
     */
    private String visitProcessinstanceStatus;

    /**
     * 踏勘实例创建时间
     */
    private LocalDateTime visitProcessinstanceCreateTime;

    /**
     * 踏勘实例完成时间
     */
    private LocalDateTime visitProcessinstanceFinishTime;



}
