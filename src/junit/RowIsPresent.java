package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import logic.Board;
import logic.ColumnAnalyzer;
import logic.RowAnalyzer;

public class RowIsPresent {
	
	private static int[][] board = {
			{5,0,4,/**/7,0,6,/**/8,0,2},
			{3,0,6,/**/1,0,0,/**/0,0,0},
			{0,8,7,/**/0,0,5,/**/0,0,3},
			/*------------------------*/
			{8,4,0,/**/3,6,0,/**/2,7,0},
			{0,0,2,/**/8,5,9,/**/4,0,0},
			{0,1,3,/**/0,7,2,/**/0,8,6},
			/*------------------------*/
			{2,0,0,/**/9,0,0,/**/3,6,0},
			{0,0,0,/**/0,0,8,/**/1,0,7},
			{6,0,8,/**/5,0,3,/**/9,0,4}	};
	
	RowAnalyzer r0, r1, r2, r3, r4, r5, r6, r7, r8;

	
	@Before
	public void setUp() throws Exception {
		
		Board board = new Board(this.board);
		
		r0 = new RowAnalyzer(board, 0);
		r1 = new RowAnalyzer(board, 1);
		r2 = new RowAnalyzer(board, 2);
		r3 = new RowAnalyzer(board, 3);
		r4 = new RowAnalyzer(board, 4);
		r5 = new RowAnalyzer(board, 5);
		r6 = new RowAnalyzer(board, 6);
		r7 = new RowAnalyzer(board, 7);
		r8 = new RowAnalyzer(board, 8);
	}

	
	@Test
	public void r0TopTrue() {
		assertEquals(true, r0.isPresent(5));
	}
	
	@Test
	public void r8BottomTrue() {
		assertEquals(true, r8.isPresent(4));
	}
	
	@Test
	public void r0TopFalse() {
		assertEquals(false, r0.isPresent(3));
	}
	
	@Test
	public void r8BottomFalse() {
		assertEquals(false, r8.isPresent(2));
	}
	
	

}
