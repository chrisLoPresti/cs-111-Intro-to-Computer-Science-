
public class MyPicture {

    private String description;

    private String filename;

    private int height;

    private int width;

    private String infoPacket;

     Picture pic;

    public MyPicture(String filename, String description) {

        this.pic = new Picture(filename);

        this.description = description;

        this.filename = filename;

        this.height = pic.getHeight();

        this.width = pic.getWidth();

        this.infoPacket =  this.filename +" " + this.width + " x " + this.height  +" " + this.description ;

    }

    public String toString() {

        return this.infoPacket;
    }

    public boolean equals(MyPicture p) {

        String nameCompare = p.filename;

        String descriptionCompare = p.description;

        if (nameCompare == this.filename && descriptionCompare == this.description) {

            return true;

        } else {

            return false;

        }

    }

    public Picture negative() {

        Picture myNegative = new Picture(pic);

        for (int i = 0; i < width; i++) {

            for (int j = 0; j < height; j++) {

                Pixel x = myNegative.getPixel(i, j);

                int red = x.getRed();

                int green = x.getGreen();

                int blue = x.getBlue();

                x.setRed(255 - red);

                x.setGreen(255 - green);

                x.setBlue(255 - blue);

            }

        }

        return myNegative;

    }

    public double redness() {

        double redness = 0;

        int redCount = 0;

        int totalPixels = 0;

        for  (int i = 0; i < width; i++){

            for (int j = 0; j < height; j++) {

                Pixel x = pic.getPixel(i, j);

                int red = x.getRed();

                int green = x.getGreen();

                int blue = x.getBlue();

                totalPixels++;

                if (red > green && red > blue) {

                    redCount++;

                }

            }

        }
        
        redness = (double)redCount / totalPixels;

        return redness;
    }

    public void flipHorizontal() {

        int height = pic.getHeight();
        int width = pic.getWidth();
        
        double middle= width/2.0 ; 
        
        for (int i = 0; i < height ; i++) {

            for (int j = 0; j < middle ; j++) {

                Pixel x = pic.getPixel(j, i);    
                Pixel y = pic.getPixel(width-1-j, i);

                y.setBlue(x.getBlue());
                y.setGreen(x.getGreen());
                y.setRed(x.getRed());
                

            }

        }

    }

    

    public void flipVertical() {

        int height = pic.getHeight();
        int width = pic.getWidth();

        for (int j = 0; j < width; j++) {
            for (int i = 0; i < height / 2; i++) {

                Pixel x = pic.getPixel(j, i);

                int red = x.getRed();
                int blue = x.getBlue();
                int green = x.getGreen();

                Pixel y = pic.getPixel(j, height - 1 - i);

                y.setBlue(blue);
                y.setGreen(green);
                y.setRed(red);

            }
        }

    }

}
