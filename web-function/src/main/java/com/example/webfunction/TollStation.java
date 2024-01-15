package com.example.webfunction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TollStation {
	
	private String stationId;
	private float mileMarker;
	private Integer stallCount;

}
