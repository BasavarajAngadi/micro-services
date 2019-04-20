package com.braj.electronicgoodsservice.contoller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.braj.electronicgoodsservice.discountservice.DiscountService;
import com.braj.electronicgoodsservice.dto.DiscountPrice;
import com.braj.electronicgoodsservice.entity.EProduct;
import com.braj.electronicgoodsservice.pojo.ElectronicProductDetails;
import com.braj.electronicgoodsservice.service.ElectronicService;


@RestController
public class ElectronicGoodsContoller {

	@Autowired
	DiscountService discountService;
	
	@Autowired
	ElectronicService electronicService;

	@GetMapping("/electronItems")
	public List<EProduct> getElectronicItems() {
		return  electronicService.getAllElectronicsDetails();
		//return new EProduct(2, "Mobile", 1000);

	}

	@GetMapping("/electronItems/{itemId}")
	public ElectronicProductDetails getDiscountRateByItemId(@PathVariable Integer itemId) {

		Map<String, String> discoutPathVariable = new HashMap<>();
		discoutPathVariable.put("type", "E");
		discoutPathVariable.put("itemId", itemId.toString());
		ResponseEntity<DiscountPrice> responseEntity = new RestTemplate()
				.getForEntity("http://localhost:4000/discount/{type}/{itemId}",
						DiscountPrice.class, discoutPathVariable);
		DiscountPrice discountedAmount = responseEntity.getBody();
		System.out.println("discountedAmount" + discountedAmount);
		return new ElectronicProductDetails(2, "Mobile", discountedAmount.getItemPrice(),discountedAmount.getServerPortNumber());

	}

	@GetMapping("/electronic/{itemId}")
	public ElectronicProductDetails getDiscountedRateByItemId(@PathVariable Integer itemId) {
		Optional<DiscountPrice> discountPrice = Optional.of(discountService.getDiscountedAmountByProductId("EGoods", itemId));
		Integer discouPrice=0;
		if(discountPrice.isPresent())
			discouPrice=discountPrice.get().getItemPrice();
		System.out.println("discountedAmount" + discouPrice);
		return new ElectronicProductDetails(2, "Mobile"+discountPrice.get().getItemName(), discouPrice,discountPrice.get().getServerPortNumber());

	}

}
