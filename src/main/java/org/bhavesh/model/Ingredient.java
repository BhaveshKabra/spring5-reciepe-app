package org.bhavesh.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Ingredient {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String description;
		private BigDecimal amount;
		
		@OneToOne(fetch = FetchType.EAGER)
		private UnitOfMeasure uom;
		
		@ManyToOne
		private Recipe reciepe;
		
		public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
			this.description=description;
			this.amount=amount;
			this.uom=uom;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		
		public UnitOfMeasure getUom() {
			return uom;
		}
		public void setUom(UnitOfMeasure uom) {
			this.uom = uom;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public BigDecimal getAmount() {
			return amount;
		}
		public void setAmount(BigDecimal amount) {
			this.amount = amount;
		}
		public Recipe getReciepe() {
			return reciepe;
		}
		public void setReciepe(Recipe reciepe) {
			this.reciepe = reciepe;
		}
		public Ingredient() {
			super();
			// TODO Auto-generated constructor stub
		}
		 
}
