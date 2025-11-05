import java.lang.Math;
public class SimpleComplex {
	float real;
	float imaginary;
	
	SimpleComplex()
	{
		real = imaginary = 0;
	}
	
	SimpleComplex(float re, float im)
	{
		real = re;
		imaginary = im;
	}
	
	void setReal(float re)
	{
		real = re;
	}
	
	float getReal()
	{
		return real;
	}
	
	void setImaginary(float im)
	{
		imaginary = im;
	}
	
	float getImaginary()
	{
		return imaginary;
	}
	
	float computeNorm()
	{
		return (float)(Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2)));
	}
}
