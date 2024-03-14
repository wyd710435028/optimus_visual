package com.unisound.optimus_visual.modules.medicalrecord.model;

import lombok.Data;


/**
 * 长期医嘱
 */
@Data
public class StandingOrderModel {
    String openingTime;
    String startTime;
    String content;
    String openingPhysicianSign;
    String executeTime;
    String executorSign;
    String stopTime;
    String stopPhysicianSign;
    String stopExecutorSign;
    String yzsProjectType;
    String projectCategories;
    /**
     * 医嘱id唯一标识
     */
    String unisoundId;

    /**
     * 评论数量
     */
    Integer commentNum=0;
}
