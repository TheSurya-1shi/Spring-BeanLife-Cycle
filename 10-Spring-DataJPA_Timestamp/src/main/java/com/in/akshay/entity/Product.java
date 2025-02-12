package com.in.akshay.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="product")
public class Product {
	
	@Column(name="product_NAME")
	private String productName;
	
	@Column(name="product_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer productId;
	
	@Column(name="product_price")
	private Double productPrice;
	
	@CreationTimestamp
	@Column(name="Created_dttm", updatable=false)
	private LocalDateTime createdDttm;
	
	@UpdateTimestamp
	@Column(name="updated_dttm", insertable=false)
	private LocalDateTime updatedDttm;
	

}
