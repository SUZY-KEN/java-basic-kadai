package kadai_018;

abstract public class kato_Chapter18 {
	
	public String famillyName;
	public String givenName;
	public String address;
	
	kato_Chapter18()
	{
		this.famillyName="加藤";
		this.address="東京都中野区〇×";
	}
	
	public void commonIntroduce()
	{
		System.out.println("名前は"+this.famillyName+this.givenName+"です\n住所は"+this.address+"です");
	};
	
	abstract public void eachIntroduce() ;
	
	
	public void execIntroduce() {
		
		commonIntroduce();
		eachIntroduce();
		
		
	};

}
