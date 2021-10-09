package com.cf.demo;

/**
 * @author: chenf
 * @Date: 2021/10/9 16:31
 */
public class DefaultCalculate implements Calculate{
	/**
	 * add
	 *
	 * @param a a
	 * @param b b
	 * @return result
	 */
	@Override
	public int add(int a, int b) {
		System.out.println("执行a+b");
		return a + b;
	}

	/**
	 * sub
	 *
	 * @param a a
	 * @param b b
	 * @return result
	 */
	@Override
	public int sub(int a, int b) {
		System.out.println("执行a-b");
		return a - b;
	}
}
