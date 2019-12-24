package consume_restful;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.PipedReader;

/**
 * @description:
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-12-24 10:35
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public @Data class Quote {
    private Long id;
    private String quote;
}
