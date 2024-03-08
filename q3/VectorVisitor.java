public class VectorVisitor implements Visitor{
    @Override
    public void visit(Shape s) {
        if(s instanceof Circle) {
            System.out.println("Saving the circle... with radius= " + ((Circle) s).getRadius() + " at position "+ s.getxPos() +", " + s.getyPos() + " as vector");
        }
        else if(s instanceof Triangle) {
            System.out.println("Saving the triangle... with base = " + ((Triangle) s).getBase() + " at position "+ s.getxPos() +", " + s.getyPos() + " as vector");
        }
        else if(s instanceof Rectangle) {
            System.out.println("Saving the rectangle... with width = " + ((Rectangle) s).getWidth() + " height = " + ((Rectangle) s).getHeight() + " at position "+ s.getxPos() +", " + s.getyPos() + " as vector");
        }
    }
    
}
