package design.AbstractFactory;

public class MediaFactory implements Factory{

	public ProductBinXiang createBinXiang() {
		// TODO Auto-generated method stub
		return new BinXiangMedia();
	}
	
	public ProductKongTiao createKongTiao() {
		// TODO Auto-generated method stub
		return new KongTiaoMedia();
	}
}
