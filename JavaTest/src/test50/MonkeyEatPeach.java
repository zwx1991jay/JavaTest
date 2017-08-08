package test50;

/**
 * @author VellBibi
 *【程序17】MonkeyEatPeach.java 
 *题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个 第二天早上又将剩下的桃子吃掉一半
 *，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。 
 *1.程序分析：采取逆向思维的方法，从后往前推断
 */
public class MonkeyEatPeach {

	/**
	 * 获取d天前有多少桃子
	 * @param d
	 * @return
	 */
	public static int getNum(int d){
		if(d == 0) return 1;
		else return (getNum(d-1) + 1) * 2;
	}
	
	public static void main(String[] args) {
		System.out.println(getNum(10));
	}

}
