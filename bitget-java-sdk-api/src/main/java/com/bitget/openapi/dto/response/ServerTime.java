package com.bitget.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ( 合约服务器时间 )
 * @author jian.li
 * @create 2020-05-29 12:37
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServerTime implements Serializable {
    private static final long serialVersionUID = -8330252274924674355L;
    /**
     * UTC时区Unix时间戳的十进制秒数格式
     */
    private String epoch;
    /**
     * ISO8601标准的时间格式
     */
    private String iso;
    /**
     * 服务器时间戳
     */
    private long timestamp;
}
