package com.plus.hospital.framework.core.bean.request;

import lombok.Data;

import java.util.Date;

/**
 * 日期时间查询基类
 * @author huguangquan
 * 2023/6/5
 **/
@Data
public class DateTimeQueryRequest extends BaseRequest{
    private Date beginDateTime;

    private Date endDateTime;

}
