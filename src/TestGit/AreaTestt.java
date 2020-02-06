package TestGit;

import static org.junit.jupiter.api.Assertions.*;

class AreaTestt {

    @org.junit.jupiter.api.Test
    void circleArea() {
        Area areacalt = new Area();
        double test = areacalt.CircleArea(5);
        assertEquals(5*5*Math.PI, test);
    }

    @org.junit.jupiter.api.Test
    void squareArea() {
        Area areacalc = new Area();
        double test = areacalc.SquareArea(4, 5);
        assertEquals(4*5, test);
    }
}