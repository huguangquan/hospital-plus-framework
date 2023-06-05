package com.plus.hospital.framework.core.bean.request;

import lombok.Data;

/**
 * 分页查询请求实体
 * @author huguangquan
 * 2023/6/5
 **/
@Data
public class PageQueryRequest extends BaseRequest{
    private Integer pageSize = 10;

    private Integer pageNo = 1;
}
