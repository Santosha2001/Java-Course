package com.santosh.sterotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BakeryComponent {
	@Value("Chacolate cake")
	private String cakeName;

	@Value("200")
	private Double cost;

	@Value("Heart shape")
	private String cakeShape;

	@Value("#{branches}")
	private List<String> branches;

	public BakeryComponent() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BakeryComponent [cakeName=" + cakeName + ", cost=" + cost + ", cakeShape=" + cakeShape + ", branches="
				+ branches + "]";
	}

	public String getCakeName() {
		return cakeName;
	}

	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getCakeShape() {
		return cakeShape;
	}

	public void setCakeShape(String cakeShape) {
		this.cakeShape = cakeShape;
	}

	public List<String> getBranches() {
		return branches;
	}

	public void setBranches(List<String> branches) {
		this.branches = branches;
	}

}
