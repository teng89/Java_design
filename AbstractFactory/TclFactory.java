package design.AbstractFactory;

public class TclFactory implements Factory{
	
	public ProductBinXiang createBinXiang() {
		// TODO Auto-generated method stub
		return new BinXiangTcl();
	}
	
	public ProductKongTiao createKongTiao() {
		// TODO Auto-generated method stub
		return new KongTiaoTcl();
	}
}
