package TestGit;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestArea {

    @Test
   public void testAreaCirle(){
        //Arrange
        Area areaCalc = new Area();
        //Act
        double cirlceTest = areaCalc.CircleArea(2);
        double squareTest = areaCalc.SquareArea(5, 4);
        //Assert
        assertEquals(12.566370614359172, cirlceTest);
        assertEquals(20.0, squareTest);
    }

}
