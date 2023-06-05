package com.plus.hospital.framework.core.bean.request;

import lombok.Data;

import java.util.Date;

/** 日期分页查询请求基类
 * @author huguangquan
 * 2023/6/5
 **/
@Data
public class DateTimePageQueryRequest extends PageQueryRequest {
    private Date beginDateTime;

    private Date endDateTime;
}
