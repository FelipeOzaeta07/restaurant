package org.globant.restaurant.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {
    private String document;
    private String fullName;
    private String email;
    private String phone;
    private String deliveryAddress;
}
