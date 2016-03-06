package com.learn.test.arrays;

public class Transposer {

	public int[][] trans(int[][] datas) {
		validate(datas);
		int cnum = datas.length;
		int rnum = datas[0].length;
		int[][] newdatas = new int[rnum][cnum];
		
		for(int i=0;i<rnum;i++){
			for(int j=0;j<cnum;j++){
				newdatas[j][i] = datas[i][j];
			}
		}
		return newdatas;
	}

	private void validate(int[][] datas) {
		// TODO Auto-generated method stub
		
	}

}
