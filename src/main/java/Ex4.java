public class Ex4 {
   public enum Color {
        BLUE, RED, GREEN,
        ORANGE, BLACK, VIOLET,
        YELLOW, GRAY, WHITE
    }

    public enum Brand {
        AUDI(new Color[]{Color.BLUE, Color.RED, Color.GREEN}),
        BMW(new Color[]{Color.ORANGE, Color.BLACK, Color.VIOLET}),
        KIA(new Color[]{Color.YELLOW, Color.GRAY, Color.WHITE})
    }

    private final Color[] colors;

    Brand(Color[] colors) {
        this.colors = colors;
    }

    public Color[] getColors() {
        return colors;
    }
}

    public class Car {
    private Brand brand;
    private Color color;

    public Car(Brand brand, Color color) {
        this.brand = brand;
        for (Color c : brand.getColors()) {
            if (c == color) {
                this.color = color;
                break;
            }
        }
    }

    public void setColor(String newColor) {
        for (Color col : brand.getColors()) {
            if (col.name().equals(newColor.toUpperCase())) {
                color = col;
            }
        }
    }

    public Brand getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

}
