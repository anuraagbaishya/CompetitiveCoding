import java.math.BigDecimal;
class Pival{
	public static void main(String[] args) {
		BigDecimal TwentyTwo = BigDecimal.valueOf(22);
		BigDecimal Seven = BigDecimal.valueOf(7);
		System.out.println(TwentyTwo.divide(Seven,100, BigDecimal.ROUND_HALF_DOWN));  
	}
}