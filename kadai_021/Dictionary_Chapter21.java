package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	private HashMap<String,String>mapIndex=new HashMap<String,String>();
	
	
	
	
//	private String[]wordEn= {"apple","peach","banana","lemon","pear","kiwi","strawberry","grape","muscat","cherry"};
//	private String[]wordJa= {"りんご","桃","バナナ","レモン","梨","キウィ","いちご","ぶどう","マスカット","さくらんぼ"};
//	
	
	Dictionary_Chapter21()
	{

		mapIndex.put("apple", "りんご");
		mapIndex.put("peach", "桃");
		mapIndex.put("banana","バナナ" );
		mapIndex.put("lemon","レモン" );
		mapIndex.put("pear","梨" );
		mapIndex.put("kiwi", "キウィ");
		mapIndex.put("strawberry","いちご" );
		mapIndex.put("grape", "ぶどう");
		mapIndex.put("muscat", "マスカット");
		mapIndex.put("cherry", "さくらんぼ");
		
		
		
		
		
//		
//		for(int i=0;i<this.wordEn.length;i++)
//		{
//			this.mapIndex.put(wordEn[i], wordJa[i]);
//		}
		
		
		
	}
	
	
	public void searchDictionay(String[]word)
	{
		
		for(int i=0;i<word.length;i++)
		{
//			引数に対応するキーがあるか判定し、空値ならスキップ
			
			
			 String wordDic=this.mapIndex.get(word[i]);
			
			
			if(wordDic==null)
			{
				System.out.println(word[i]+"は辞書に存在しません");
				continue;
				
			};
			
			
			
			
			
			System.out.println(wordDic+"の意味は"+word[i]);
		}
		
		
		
	};
	

}
