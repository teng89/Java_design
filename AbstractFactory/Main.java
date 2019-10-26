package design.AbstractFactory;

public class Main {
	public static void main(String[] args) {
		Factory mediaF = new MediaFactory();
		ProductBinXiang binxingMedia = mediaF.createBinXiang();
		ProductKongTiao kongtiaoMedia = mediaF.createKongTiao();
		binxingMedia.lengDong();
		kongtiaoMedia.zhileng();
		
		Factory tclF = new TclFactory();
		ProductBinXiang binxiangTcl = tclF.createBinXiang();
		ProductKongTiao kongtiaoTcl = tclF.createKongTiao();
		binxiangTcl.lengDong();
		kongtiaoTcl.zhileng();
	}
}
