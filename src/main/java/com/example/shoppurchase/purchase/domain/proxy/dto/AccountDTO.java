package com.example.shoppurchase.purchase.domain.proxy.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class AccountDTO {

    private String name;
    private MemberType memberType;
    private MembershipLevelType membershipLevelType;
    private Address address;
    private String email;
}
