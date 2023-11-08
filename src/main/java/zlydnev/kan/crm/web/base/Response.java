package zlydnev.kan.crm.web.base;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> {

    private String message;
    private T data;
}
