import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversed1() {
    int[] input1 = { 1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversedInPlace() {
    int[] input1 = { 1,2,3};
    ArrayExamples.reverseInPlace(input1);
    int[] output1 = {3,2,1};
    assertArrayEquals(output1, input1);
  }
  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = {3.0,3.0,4.0,5.0,6.0,7.0};
    double b = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(5,b, 0.001);

  }
}
