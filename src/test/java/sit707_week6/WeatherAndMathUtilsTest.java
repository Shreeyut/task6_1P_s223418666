package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s223418666";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Shreeyut Shrestha";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
	public void testFalseOddNumberIsEven() {
		Assert.assertFalse(WeatherAndMathUtils.isEven(3));
	}
	@Test
	public void testTrueEvenNumberIsEven() {
		Assert.assertTrue(WeatherAndMathUtils.isEven(4));
	}
	@Test
	public void testTrueOddNumberIsZero() {
		Assert.assertTrue(WeatherAndMathUtils.isEven(0));
	}
	@Test
	public void testFalseNegativeOddNumberIsEven() {
		Assert.assertFalse(WeatherAndMathUtils.isEven(-3));
	}
	@Test
	public void testTrueNegativeEvenNumberIsEven() {
		Assert.assertTrue(WeatherAndMathUtils.isEven(-4));
	}
	
    @Test
    public void testCancelWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    @Test
    public void testAllClearWeatherAdvice() {
    	Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30, 0.0));
    }
    @Test
    public void testWarnWeatherAdvice() {
    	Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(20, 5));
    }
    
    @Test
	public void testTruePrimeNumberIsPrime() {
		Assert.assertTrue(WeatherAndMathUtils.isPrime(3));
	}
    @Test
	public void testFalseNonPrimeNumberIsPrime() {
		Assert.assertFalse(WeatherAndMathUtils.isPrime(4));
	}
    @Test
	public void testTrueOneNumberIsPrime() {
		Assert.assertTrue(WeatherAndMathUtils.isPrime(1));
	}
    @Test
	public void testTrueSumInRange() {
		Assert.assertEquals(15,WeatherAndMathUtils.sumNumsInRange(1,5));
	}
    @Test
	public void testTrueTotalOddNumsInRange() {
		Assert.assertEquals(3,WeatherAndMathUtils.totalOddNumsInRange(1,5));
	}
	
    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
    	String a = WeatherAndMathUtils.weatherAdvice(-1, 0.0);
    	Assert.assertTrue(true);
    }
    
    
}
