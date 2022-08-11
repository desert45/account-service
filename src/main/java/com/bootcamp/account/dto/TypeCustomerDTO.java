package com.bootcamp.account.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TypeCustomerDTO {

	// private String id;

	// @NotEmpty(message = "The Type Is Requerid")
	@Id
	private String id;

	private String type;
}
