
public class GreenScreen {

public static void greenReplace(Picture greenScreen, Picture replace) {

	//this will get the height and width of the image on the green screen
	//and the height and width of the image we will put the green screen image onto 

		int gheight = greenScreen.getHeight();
		int gwidth = greenScreen.getWidth();
		
		int rheight = replace.getHeight();
		int rwidth = replace.getWidth();
		
	//if the green screen image and the new background image (Replace) are not the same dimensions, it cant work
		
		if(gheight != rheight && gwidth !=rwidth){
			
			System.out.println("These images are not the same dimensions");
			
			return;		
			
		}
		
		
	//iterate through the image width by height 
		
		for (int i = 0; i < gwidth; i++) {

			for (int j = 0; j < gheight; j++) {

	//this will grab the pixel of the green screen pixels 
				
				Pixel x = greenScreen.getPixel(i, j);
	
	//this will get the new background pixels
				
				Pixel y = replace.getPixel(i, j);
	
	//get the green value of the green screen
				int ggreen = x.getGreen();
	
	//get the rgb of the background 
				int rred = y.getRed();
				int rgreen = y.getGreen();
				int rblue = y.getBlue();
				
	//now since the green screen green values get manipulated from writing a jpeg
	//we check to see if the green is above 180, and if so force it to be 255
	//this will help with replacing green pixels around the image 
				
				if (ggreen >=180) {
					
					x.setBlue(0);
					x.setGreen(255);
					x.setRed(0);
				}
				
	//this gets the rgb for the green screen
				
				ggreen = x.getGreen();
				int gred = x.getRed();
				int gblue = x.getBlue();
				
	//if the pixel is pure green on the green screen, replace it with
	//the corresponding pixel on the replace background 
				if (gred ==0  && gblue ==0 && ggreen == 255) {
					
					x.setBlue(rblue);
					x.setGreen(rgreen);
					x.setRed(rred);
				}
				
				

			}
		}

	
	}// end of CountRedPixels

}
