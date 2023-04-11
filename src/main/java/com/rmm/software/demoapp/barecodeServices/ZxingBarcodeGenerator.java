package com.rmm.software.demoapp.barecodeServices;

import java.awt.image.BufferedImage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class ZxingBarcodeGenerator {
	
	private ZxingBarcodeGenerator(){}
	
	/**
	 * @param barcodeText
	 * @return
	 * @throws Exception
	 * @Comment: Generating QR Code
	 */
	public static BufferedImage generateQRCodeImage(String qrcodeText) throws WriterException {
        QRCodeWriter barcodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = barcodeWriter.encode(qrcodeText, BarcodeFormat.QR_CODE, 200, 200);

        return MatrixToImageWriter.toBufferedImage(bitMatrix);
    }

}
