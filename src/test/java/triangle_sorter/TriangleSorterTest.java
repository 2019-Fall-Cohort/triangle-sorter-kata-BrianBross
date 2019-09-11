package triangle_sorter;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TriangleSorterTest {
   
	@Test
    public void threeEqualSidesIsAnEquilateralTriangle() {
    	TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(new int[]{3, 3, 3});
        assertThat(triangleType, is("form an equilateral triangle."));
    }
    
    @Test
    public void twoEqualSidesIsAnIsoscelesTriangle() {
    	TriangleSorter underTest = new TriangleSorter();
    	String triangleType = underTest.analyze(new int[]{5, 3, 5});
    	assertThat(triangleType, is("form an isosceles triangle."));
    }
    
    @Test
    public void theseThreeSidesFormARightTriangle() {
    	TriangleSorter underTest = new TriangleSorter();
    	String triangleType = underTest.analyze(new int[]{3, 4, 5});
    	assertThat(triangleType, is("form a right triangle."));
    }
   
    @Test
    public void theseThreeSidesFormATriangle() {
    	TriangleSorter underTest = new TriangleSorter();
    	String triangleType = underTest.analyze(new int[]{2, 3, 4});
    	assertThat(triangleType, is("form an irregular triangle."));
    }
    
    @Test
    public void theseThreeSidesDoNotFormATriangle() {
    	TriangleSorter underTest = new TriangleSorter();
    	String triangleType = underTest.analyze(new int[]{6, 3, 2});
    	assertThat(triangleType, is("do NOT form a triangle."));
    }
     
}

