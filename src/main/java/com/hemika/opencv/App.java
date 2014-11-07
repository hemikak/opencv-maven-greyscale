package com.hemika.opencv;

import nu.pattern.OpenCV;

import org.opencv.core.Mat;
import org.opencv.core.MatOfKeyPoint;
import org.opencv.features2d.FeatureDetector;
import org.opencv.features2d.Features2d;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		try {
			// reading an image file
			System.out.println("Reading file");
			Mat mat = Highgui.imread("car.jpg");

			// greyscaling
			Mat greyMat = new Mat();
			Imgproc.cvtColor(mat, greyMat, Imgproc.COLOR_RGB2GRAY);

			// writing to file
			System.out.println("Writing back to file");
			Highgui.imwrite("greyscaling.jpg", greyMat);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// loading native libraries for opencv
	static {
		OpenCV.loadLibrary();
	}
}
