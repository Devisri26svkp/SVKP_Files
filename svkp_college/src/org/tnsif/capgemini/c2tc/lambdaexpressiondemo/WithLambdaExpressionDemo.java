package org.tnsif.capgemini.c2tc.lambdaexpressiondemo;

@FunctionalInterface
interface Drawable1
{
	public void draw();
}
public class WithLambdaExpressionDemo {

	public static void main(String[] args) {
		int width=50;
		Drawable1 d2=()->{
			System.out.println("Drawing " + width);
			};
		d2.draw();
	}
}//16 lines