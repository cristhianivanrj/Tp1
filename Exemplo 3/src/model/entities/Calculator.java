package model.entities;

public class Calculator {

		private int x;
		private int y;
		
		public Calculator(){
			
		}

		public Calculator(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public double adicao(){
			return x + y;
		}
		
		public double sub(){
			return x - y;
		}
		
		public double mult(){
			return x * y;
		}
		
		public double div(){
			return x / y;
		}
		
}
