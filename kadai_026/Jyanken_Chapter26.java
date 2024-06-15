package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
//	変数定義
	private HashMap<String,String>rspMap=new HashMap<>() ;
	
	
	public Jyanken_Chapter26() {
		// TODO 自動生成されたコンストラクター・スタブ
		
//		じゃんけんのキー、値の格納
		this.rspMap.put("r","グー");
		this.rspMap.put("s","チョキ");
		this.rspMap.put("p","パー");
		
	}
	
	
		
	
	
	
//	入力の判定と取得
	public String getMyChoice() {
		
		
		Scanner choiceMine=new Scanner(System.in);
		String rspMine;
		
//		コンストラクターで設定したHashMapオブジェクトのキーと整合しなければずっとループ
		do {
		System.out.println("自分のじゃんけんの手を入力しましょう\n"
				+ "グーはrockのrを入力しましょう\n"
				+ "チョキはscissorsのsを入力しましょう\n"
				+ "パーはpaperのpを入力しましょう");
		
	
//		代入
		rspMine=choiceMine.next();
		
		}while(this.rspMap.get(rspMine)==null);
			
		
//		入力の受付を修了し入力値を戻す。
		choiceMine.close();
		return rspMap.get(rspMine);
			
		
		
	};
	
	
//	相手のRSPの取得
	public String getRandom() {
		
		String []rspArray= {"r","s","p"};
		String rspEnem=rspArray[(int)Math.floor((Math.random()*3-0.00001))];
		
		
		return rspMap.get(rspEnem);
		
		
	};
	
	
//	ゲームの開始
	public void playGame(String mychoice,String randomchoice) {
		
		System.out.println("自分の手は"+mychoice+",対戦相手の手は"+randomchoice);
		
		
//		自分の手がグー
		if(mychoice.equals(this.rspMap.get("r")))
		{
			
			switch(randomchoice)
			{
			
			case "グー"->System.out.println("あいこです");
			case"チョキ"->System.out.println("自分の勝ちです");
			case"パー"->System.out.println("自分の負けです");
			
				
			
			}
			
			
		}
		
		
//		自分の手がチョキ
		if(mychoice.equals(this.rspMap.get("s")))
		{
			
			switch(randomchoice)
			{
			
			case "グー"->System.out.println("自分の負けです");
			case"チョキ"->System.out.println("あいこです");
			case"パー"->System.out.println("自分の勝ちです\"");
			
				
			
			}
			
			
		}
		
		
//		自分の手がパー
		if(mychoice.equals(this.rspMap.get("p")))
		{
			
			switch(randomchoice)
			{
			
			case "グー"->System.out.println("自分の勝ちです\"");
			case"チョキ"->System.out.println("あいこです");
			case"パー"->System.out.println("自分の負けです");
			
				
			
			}
			
			
		}
		
		
	};
	
	

}
