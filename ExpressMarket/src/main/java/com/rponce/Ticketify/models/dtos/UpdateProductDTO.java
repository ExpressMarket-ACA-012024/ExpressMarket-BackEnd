package com.rponce.Ticketify.models.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UpdateProductDTO {

	@NotEmpty
	private String name;

	@NotEmpty
	private String image;
	
	@NotEmpty
	private String category;
	
	@NotEmpty
	private String description;
	
	@NotEmpty
	private Float price;
	
	@NotEmpty
	private String company;
	
}
