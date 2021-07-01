package com.bitget.openapi.dto.response.spot;

import lombok.*;

import java.io.Serializable;

/**
 * @Author: bitget
 * @Date: 2021-05-31 11:07
 * @DES:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SpotAssetsResult implements Serializable {
    private static final long serialVersionUID = 417635490084099103L;

    /**
     * 币种ID
     */
    private Integer coinId;

    /**
     * 币种名称
     */
    private String coinName;

    /**
     * 可用资产
     */
    private String available;

    /**
     * 冻结资产
     */
    private String frozen;

    /**
     * 锁仓资产
     */
    private String lock;

    /**
     * 更新时间
     */
    private Long uTime;
}
