
public class Milestone2 {

    // -- GOOD DO NOT CHANGE THIS --

    public static int countRedPixels(Picture v) {

        int redCount = 0;

        int height = v.getHeight();
        int width = v.getWidth();

        for (int i = 0; i < width; i++) {

            for (int j = 0; j < height; j++) {

                Pixel x = v.getPixel(i, j);

                int red = x.getRed();

                int green = x.getGreen();

                int blue = x.getBlue();

                if (red == 255 && blue == 0 && green == 0) {

                    redCount++;
                }

            }
        }

        return redCount;

    }// end of CountRedPixels

    // -- GOOD DO NOT CHANGE THIS --

    public static void switchRedBlue(Picture v) {

        int height = v.getHeight();
        double width = v.getWidth();

        for (int i = 0; i < width; i++) {

            for (int j = 0; j < height; j++) {

                Pixel x = v.getPixel(i, j);

                int red = x.getRed();

                int green = x.getGreen();

                int blue = x.getBlue();

                if (red == 255 && blue == 0 && green == 0) {

                    x.setBlue(255);

                    x.setGreen(0);

                    x.setRed(0);

                }

                else if (red == 0 && blue == 255 && green == 0) {

                    x.setBlue(0);

                    x.setGreen(0);

                    x.setRed(255);

                }

            }

        }
    }// end of switchRedBlue

    // -- GOOD DO NOT CHANGE THIS --
    public static void flipHorizontal(Picture v) {

        int height = v.getHeight();
        int width = v.getWidth();

        for (int j = 0; j < width; j++) {
            for (int i = 0; i < height / 2; i++) {

                Pixel x = v.getPixel(j, i);

                int red = x.getRed();
                int blue = x.getBlue();
                int green = x.getGreen();

                Pixel y = v.getPixel(j, height - 1 - i);

                y.setBlue(blue);
                y.setGreen(green);
                y.setRed(red);

            }
        }

    }// end of flipHorizontal

    // -- GOOD DO NOT CHANGE THIS --

    public static void flipVertical(Picture v) {

        int height = v.getHeight();
        int width = v.getWidth();

        for (int j = 0; j < width / 2; j++) {

            for (int i = 0; i < height; i++) {

                Pixel x = v.getPixel(j, i);

                int red = x.getRed();
                int blue = x.getBlue();
                int green = x.getGreen();

                Pixel y = v.getPixel(width - 1 - j, i);

                y.setBlue(blue);
                y.setGreen(green);
                y.setRed(red);

            }

        }

    }// end of flipVertical

    // -- GOOD DO NOT CHANGE THIS --

    public static void flipDiagonal(Picture v) {

        int myheight = v.getHeight();
        int mywidth = v.getWidth();

        for (int i = 0; i < mywidth - 1; i++) {

            for (int j = 0; j < myheight - i; j++) {

                Pixel x = v.getPixel(i, j);

                int blue = x.getBlue();
                int green = x.getGreen();
                int red = x.getRed();

                Pixel y = v.getPixel(myheight - j - 1, mywidth - 1 - i);

                y.setBlue(blue);
                y.setGreen(green);
                y.setRed(red);

            }

        }

    } // end of flipDiagonal

}// end of class