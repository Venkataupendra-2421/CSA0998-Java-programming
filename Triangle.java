public class Triangle {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean isRight() {
        // Check if the triangle is a right triangle using the Pythagorean theorem
        return (side1 * side1 + side2 * side2 == side3 * side3) ||
               (side1 * side1 + side3 * side3 == side2 * side2) ||
               (side2 * side2 + side3 * side3 == side1 * side1);
    }

    public boolean isScalene() {
        // Check if no two sides are the same length
        return !((side1 == side2) || (side1 == side3) || (side2 == side3));
    }

    public boolean isIsosceles() {
        // Check if exactly two sides are the same length
        return (side1 == side2 && side1 != side3) ||
               (side1 == side3 && side1 != side2) ||
               (side2 == side3 && side2 != side1);
    }

    public boolean isEquilateral() {
        // Check if all three sides are the same length
        return (side1 == side2 && side1 == side3);
    }

    public static void main(String[] args) {
        // Example usage of Triangle class
        Triangle triangle1 = new Triangle(3, 4, 5);
        System.out.println("Is Right Triangle: " + triangle1.isRight());
        System.out.println("Is Scalene Triangle: " + triangle1.isScalene());
        System.out.println("Is Isosceles Triangle: " + triangle1.isIsosceles());
        System.out.println("Is Equilateral Triangle: " + triangle1.isEquilateral());

        Triangle triangle2 = new Triangle(2, 2, 3);
        System.out.println("Is Right Triangle: " + triangle2.isRight());
        System.out.println("Is Scalene Triangle: " + triangle2.isScalene());
        System.out.println("Is Isosceles Triangle: " + triangle2.isIsosceles());
        System.out.println("Is Equilateral Triangle: " + triangle2.isEquilateral());
    }
}
