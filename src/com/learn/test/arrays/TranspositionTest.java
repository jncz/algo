package com.learn.test.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class TranspositionTest {

	@Test
	public void test_2_dims_1x1() {
		int[][] datas = new int[1][1];
		datas[0][0] = 1;
		
		Transposer t = new Transposer();
		int[][] newdatas = t.trans(datas);
		
		print(datas);
		print(newdatas);
		assertTrue(newdatas != datas);
		assertEquals(1,newdatas.length);
		assertEquals(1,newdatas[0].length);
		assertEquals(1,newdatas[0][0]);
	}
	
	@Test
	public void test_2_dims_2x2() {
		int[][] datas = new int[2][2];
		datas[0][0] = 1;
		datas[0][1] = 2;
		datas[1][0] = 3;
		datas[1][1] = 4;
		
		Transposer t = new Transposer();
		int[][] newdatas = t.trans(datas);
		
		print(datas);
		print(newdatas);
		assertTrue(newdatas != datas);
		assertEquals(2,newdatas.length);
		assertEquals(2,newdatas[0].length);
		assertEquals(1,newdatas[0][0]);
	}

	private void print(int[][] datas) {
		for(int i=0;i<datas.length;i++){
			for(int j=0;j<datas[0].length;j++){
				System.out.print(datas[i][j]+" ");
			}
			System.out.println("");
		}
	}

}