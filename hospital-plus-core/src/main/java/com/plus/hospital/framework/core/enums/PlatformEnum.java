package com.plus.hospital.framework.core.enums;

/**
 * 系统终端平台枚举
 * 以下平台枚举值不一定都会用到，可能只有PC运营、医生小程序以及患者小程序，根据实际场景后期进行平台建设
 * @author huguangquan
 * 2023/6/8
 **/
public enum PlatformEnum {
    doctor_pc("doctor_pc", "医生PC工作台"),
    doctor_mobile_mini("doctor_mobile_mini", "医生端小程序"),
    doctor_mobile_app("doctor_mobile_app", "医生端APP"),
    patient_mobile_mini("patient_mobile_mini", "患者端小程序"),
    patient_mobile_app("patient_mobile_app", "患者端APP"),
    system_pc_operation("system_pc_operation", "运营PC工作台"),
    monitor_system("monitor_system", "监控系统平台"),
    ;
    private String platform;

    private String platformName;

    PlatformEnum(String platform, String platformName) {
        this.platform = platform;
        this.platformName = platformName;
    }

    public String getPlatform() {
        return platform;
    }

    public String getPlatformName() {
        return platformName;
    }

    public static PlatformEnum getPlatform(String platform) {
        for (PlatformEnum value : PlatformEnum.values()) {
            if (value.getPlatform().equals(platform)) {
                return value;
            }
        }
        return null;
    }
}
