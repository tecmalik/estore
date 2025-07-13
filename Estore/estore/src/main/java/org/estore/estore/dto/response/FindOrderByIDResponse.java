package org.estore.estore.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FindOrderByIDResponse {
    private String orderStatus;
    private String message;
}
