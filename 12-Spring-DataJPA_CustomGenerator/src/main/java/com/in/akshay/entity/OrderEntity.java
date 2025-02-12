package com.in.akshay.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="order_dtls")
@Data
public class OrderEntity {
	
	@Column(name="order_id")
	@Id
	@GeneratedValue(generator = "order_id_generator")
	@GenericGenerator(name="order_id_generator", strategy="com.in.akshay.entity.CustomGenerator")
	private String orderId;
	
	@Column(name="order_name")
	private String orderName;
	
	@Column(name="order_number")
	private Integer orderNumber;
	
	@Column(name="ordered_by")
	private String orderedBy;
	

}
