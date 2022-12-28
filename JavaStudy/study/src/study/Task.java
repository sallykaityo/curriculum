package study;

// ① TaskクラスにCalculatorクラスを継承させなさい。
	public class Task extends Calculator{
    /**
     * タスクの実行
     */
    public void doTask() {

        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
    	System.out.println("plusメゾットが1つの場合:"+super.plus(10));
    	System.out.println("plusメゾットが2つの場合:"+super.plus(11,19));
    	System.out.println("plusメゾットが3つの場合:"+super.plus(11,19,30));
    	
    }
}