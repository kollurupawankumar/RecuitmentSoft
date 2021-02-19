package com.abiertasys.barmetric.api;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;


@RestController
@RequestMapping("/barmetrics")
public class BarcodeController {
	
	protected Logger logger = Logger.getLogger(BarcodeController.class.getName());

	@GetMapping(value = "/barcode/{barcode}", produces = MediaType.IMAGE_PNG_VALUE)
	public ResponseEntity<BufferedImage> barbecueEAN13Barcode(@PathVariable("barcode") String strBarcode)
    throws Exception {

		Barcode barCode= BarcodeFactory.createCode128(strBarcode);
        barCode.setBarHeight(40);
        barCode.setDrawingText(true);
		barCode.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 100));
		barCode.setName(strBarcode);


        logger.info("Barcode obtained");
		BufferedImage image = BarcodeImageHandler.getImage(barCode);


        logger.info(image.getHeight() + "  " + image.getWidth());
		return new ResponseEntity<>(image, HttpStatus.OK);
    }



}
