package com.rmm.software.demoapp.restcontrollers;

import java.awt.image.BufferedImage;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rmm.software.demoapp.barecodeServices.ZxingBarcodeGenerator;

@RestController
@RequestMapping("/barcodes")
public class BarecodesController {
	
	/**
	 * @param inputString
	 * @return
	 * @throws Exception
	 * @Comment: Rest controller for producing QRCode based on input string
	 */
	@PostMapping(value = "/zxing/qrcode", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<BufferedImage> zxingQRCode(@RequestBody String inputString) throws Exception {
        return new ResponseEntity<>(ZxingBarcodeGenerator.generateQRCodeImage(inputString), HttpStatus.OK);
    }

}
