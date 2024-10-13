public final class Monitor {
    private final int width;
    private final int height;

    // Constructor accepting resolution string
    public Monitor(String resolution) {
        String[] dimensions = resolution.trim().split("\\s*x\\s*");
        this.width = Integer.parseInt(dimensions[0].trim());
        this.height = Integer.parseInt(dimensions[1].trim());
    }

    // Getters for width and height
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // Method to calculate the total number of pixels
    public int getNumberOfPixels() {
        return width * height;
    }

    // Method to check if the resolution is Full HD (1920x1080)
    public boolean isFullHD() {
        return width == 1920 && height == 1080;
    }

    // Method to get the aspect ratio
    public double getRatio() {
        return (double) width / height;
    }

    // Method to compare two monitors based on the number of pixels
    public int compare(Monitor other) {
        return Integer.compare(this.getNumberOfPixels(), other.getNumberOfPixels());
    }

    // Overriding toString method for custom output format
    @Override
    public String toString() {
        return "Monitor(" + width + "x" + height + ")";
    }
}
