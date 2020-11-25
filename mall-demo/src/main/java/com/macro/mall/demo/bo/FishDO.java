package com.macro.mall.demo.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author chengwanli
 * @date 2020/9/5 19:43
 */

@Data
public class FishDO {
    private Integer id;
    @JsonProperty("fishName")
    private String name;
    private String address;
    private Date createTime;
}
