package com.xworkz.functional;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.LongConsumer;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// implementing BiConsumer interface using lambda expression
		BiConsumer<String, Integer> consumer = (a, b) -> {
			System.out.println("BiConsumer interface a: " + a);
			System.out.println("BiConsumer interface b: " + b);
		};
		consumer.accept("HI", 1);

		// implementing BiFunction interface using lambda expression
		BiFunction<String, Integer, Integer> biFunction = (product, price) -> {
			System.out.println("Product is " + product);
			System.out.println("price is " + price);
			return price;
		};
		biFunction.apply("Bag", 1000);

		// implementing BooleanSupplier interface using lambda expression
		BooleanSupplier booleanSupplier = () -> {
			System.out.println("BooleanSupplier interface implementing using lambda expression");
			return true;
		};
		booleanSupplier.getAsBoolean();

		// implementing BooleanSupplier interface using lambda expression
		Consumer<Integer> consumer2 = (n) -> {
			System.out.println("Counsumoer interface :" + n);
		};
		consumer2.accept(100);

		// implementing DoubleBinaryOperator interface using lambda expression
		DoubleBinaryOperator binaryOperator = (a, b) -> {
			double c = a + b;
			System.out.println("DoubleBinaryOperator: " + c);
			return c;
		};
		binaryOperator.applyAsDouble(10, 20);

		// implementing DoubleConsumer interface using lambda expression
		DoubleConsumer consumer3 = (a) -> {
			System.out.println("DoubleConsumer :" + a);
		};
		consumer3.accept(11);

		// implementing DoubleFunction interface using lambda expression
		DoubleFunction<Integer> doubleFunction = (a) -> {
			System.out.println("DoubleFunction :" + a);
			return 1;
		};
		doubleFunction.apply(21);

		// implementing IntConsumer interface using lambda expression
		IntConsumer consumer4 = (a) -> {
			System.out.println("IntConsumer :" + a);
		};
		consumer4.accept(1000);

		// implementing IntFunction interface using lambda expression
		IntFunction<Integer> function = (a) -> {
			System.out.println("IntFunction :" + a);
			return a;
		};
		function.apply(500);

		// implementing LongConsumer interface using lambda expression
		LongConsumer consumer5 = (a) -> {
			System.out.println("LongConsumer :" + a);
		};
		consumer5.accept(300);

	}
}
