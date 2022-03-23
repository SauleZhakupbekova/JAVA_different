package L6_Classes_Types;

import java.util.Objects;

public class Oval extends Circle {
    private int secondRadius;

    public Oval() {
        // 1st option by calling parent constructor

        super();  // each constructor calls parent empty constructor by first row by default.
    }

    public Oval(int radius, int secondRadius) {
        super(radius);
        this.secondRadius = secondRadius;


//        // 2nd option of saving variable to parent class through Protected type - increasing of visibility of variable
//        this.radius = radius;
//
//        // 3rd option by calling SET method
//        this.setRadius(radius);

    }

        public int getSecondRadius () {
            return secondRadius;
        }

        public void setSecondRadius ( int secondRadius){
            this.secondRadius = secondRadius;
        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            Oval oval = (Oval) o;
            return secondRadius == oval.secondRadius;
        }

        @Override
        public int hashCode () {
            return Objects.hash(super.hashCode(), secondRadius);
        }


        @Override
        public String toString () {
            return "Oval{" +
                    "radius=" + radius +
                    ", secondRadius=" + secondRadius +
                    '}';
        }

    @Override
    public double perimeter() {
        return 2 * Math.PI * Math.sqrt((radius * radius + secondRadius * secondRadius)/2);
    }
}


