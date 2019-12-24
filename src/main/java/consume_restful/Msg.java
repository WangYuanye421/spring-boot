package consume_restful;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @description:
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-12-24 10:37
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public @Data class Msg {
    @JsonProperty("type")
    private String type1;
    @JsonProperty("value")
    private Quote value1;

    private String name;
}
