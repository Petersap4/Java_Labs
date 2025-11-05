
public class Complex extends SimpleComplex{
	
	Complex(){}
	
	Complex(float re, float im)
	{
		real = re;
		imaginary = im;
	}
	
	Complex conjugate()
	{
		Complex conj = new Complex(real, -imaginary);
		return conj;
	}
	
	static Complex multiply(Complex c1, Complex c2)
	{
		Complex product = new Complex();
		product.real = c1.real * c2.real - (c1.imaginary * c2.imaginary);
		product.imaginary = c1.real * c2.imaginary + (c1.imaginary * c2.real);
		return product;
	}
	
	
	public static void main(String[] args) 
	{
		Complex[] compArray = new Complex[10];
		for(int i = 0; i<10; i++)
		{
			compArray[i] = new Complex();
			compArray[i].real = (float)Math.random()*10;
			compArray[i].imaginary = (float)Math.random()*10;
		}
		float[] norms = new float[10];
		for(int i = 0; i<10; i++)
		{
			norms[i] = (float)Math.pow((compArray[i].computeNorm()),2);
		}
		for(int i = 0; i<10; i++)
		{
			System.out.println(compArray[i].real + " + i(" + compArray[i].imaginary + ")" + 
			"|| Conjugate: " + compArray[i].conjugate().real + " + i(" + compArray[i].conjugate().imaginary + ")" +
			"|| Product: " + multiply(compArray[i], compArray[i].conjugate()).real + " + i(" + multiply(compArray[i], compArray[i].conjugate()).imaginary + ")" +
			"|| Norm: " + norms[i]);
		}
	}

}
