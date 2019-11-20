package com.ipartek.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.clases.Botella;

public class BotellaTest {
	
	static Botella botella1;
	static Botella botella2;
	static Botella botella3;

	
	@BeforeClass
	public static void inicio()
	{
		botella1 = new Botella("Fontvella",500,51);
		botella2 = new Botella("Fontvella",450,50);
		botella3 = new Botella("Fontvella",500,51);
	}
	
	@Test
	public void testCalidad()
	{
		Assert.assertEquals(true, botella1.calidad());
		Assert.assertEquals(true, botella2.calidad());
		Assert.assertEquals(true, botella3.calidad());
	}
	
	@Test
	public void testNullidad()
	{
		Assert.assertNull(botella1);
		Assert.assertNull(botella2);
		Assert.assertNull(botella3);
	}

}
