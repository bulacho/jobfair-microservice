package com.cuongpmb.identity.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.Builder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class IntrospectResponse {
    boolean valid;
}
