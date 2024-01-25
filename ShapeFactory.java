public class ShapeFactory {

    /* Only Added this 2 lines to make SINGLETONE */
    private static final ShapeFactory instance = new ShapeFactory();

    private ShapeFactory() {
    }
    public static ShapeFactory getInstance(){
        return instance;
    }
    /* Same Code from the PDF */

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }
}