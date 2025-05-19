public static void main(String args[]){
    ShapeFactory factory = new ShapeFactory();
    Shape shape = factory.getShape(input:"Circle");
    shape.draw();
}