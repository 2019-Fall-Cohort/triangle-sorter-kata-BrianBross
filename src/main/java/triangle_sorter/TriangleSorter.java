package triangle_sorter;

import java.util.Arrays;

public class TriangleSorter {
    public String analyze(int usersSides[]) {
    	String triangleType = "Unknown";
    	
    	Arrays.sort(usersSides);
    	
    	if(usersSides[2] >= (usersSides[0] + usersSides[1])) {
    		triangleType = "do NOT form a triangle.";
    	}else if(usersSides[0] == usersSides[1] && usersSides[1] == usersSides[2]) {
    		triangleType = "form an equilateral triangle.";
    	}else if(usersSides[0] == usersSides[1] || usersSides[1] == usersSides[2] || usersSides[0] == usersSides[2]){
    		triangleType = "form an isosceles triangle.";
//    	}else if((usersSides[0]*usersSides[0]) + (usersSides[1]*usersSides[1]) == (usersSides[2]*usersSides[2])) {
//    		triangleType = "form a right triangle.";
// is the above else-if easier to read than the below version???? Both work!
    	}else if(((Math.pow(usersSides[0], 2)) + (Math.pow(usersSides[1], 2))) == (Math.pow(usersSides[2], 2))){
    		triangleType = "form a right triangle.";
    	}else {
    		triangleType = "form an irregular triangle.";
    	}
    
        return triangleType;
    }
}
