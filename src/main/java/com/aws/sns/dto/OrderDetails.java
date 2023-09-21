package com.aws.sns.dto;

public class OrderDetails {

	private CardDetails cardDetails;
	private DiscountDetails discountDetails;

	public CardDetails getCardDetails() {
		return cardDetails;
	}

	public void setCardDetails(CardDetails cardDetails) {
		this.cardDetails = cardDetails;
	}

	public DiscountDetails getDiscountDetails() {
		return discountDetails;
	}

	public void setDiscountDetails(DiscountDetails discountDetails) {
		this.discountDetails = discountDetails;
	}

}
