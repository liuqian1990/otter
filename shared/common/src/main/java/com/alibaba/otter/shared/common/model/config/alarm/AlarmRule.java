/*
 * Copyright (C) 2010-2101 Alibaba Group Holding Limited.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.otter.shared.common.model.config.alarm;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * @author simon 2012-8-23 上午11:04:07
 * @version 4.1.0
 */
public class AlarmRule implements Serializable {

    private static final long serialVersionUID = 7500180945297613382L;

    private Long              id;
    private Long              pipelineId;
    private AlarmRuleStatus   status;
    private MonitorName       monitorName;
    private String            receiverKey;
    private String            matchValue;
    private Long              intervalTime;
    private Date              pauseTime;                              // 标准
    private Integer           recoveryThresold;                       // 自动恢复阀值
    private Boolean           autoRecovery;                           // 是否需要自动恢复
    private String            description;
    private Date              gmtCreate;
    private Date              gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
    }

    public AlarmRuleStatus getStatus() {
        return status;
    }

    public void setStatus(AlarmRuleStatus status) {
        this.status = status;
    }

    public MonitorName getMonitorName() {
        return monitorName;
    }

    public void setMonitorName(MonitorName monitorName) {
        this.monitorName = monitorName;
    }

    public String getReceiverKey() {
        return receiverKey;
    }

    public void setReceiverKey(String receiverKey) {
        this.receiverKey = receiverKey;
    }

    public Long getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(Long intervalTime) {
        this.intervalTime = intervalTime;
    }

    public String getMatchValue() {
        return matchValue;
    }

    public void setMatchValue(String matchValue) {
        this.matchValue = matchValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Boolean getAutoRecovery() {
        return autoRecovery;
    }

    public void setAutoRecovery(Boolean autoRecovery) {
        this.autoRecovery = autoRecovery;
    }

    public Integer getRecoveryThresold() {
        return recoveryThresold;
    }

    public void setRecoveryThresold(Integer recoveryThresold) {
        this.recoveryThresold = recoveryThresold;
    }

    public Date getPauseTime() {
        return pauseTime;
    }

    public void setPauseTime(Date pauseTime) {
        this.pauseTime = pauseTime;
    }

    public boolean isPaused() {
        return pauseTime != null && new Date().before(pauseTime);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

}
