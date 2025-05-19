public class ShapeFactory{
    Shape getShape(String input){
        switch(input){
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Triangle":
                return new Triangle();
            case "Square":
                return new Square();
            default:
                return null;
        }
    }
}