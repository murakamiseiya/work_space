/**********************************************************************
 * ファイル：appBeans.java
 * 内容：tomcat起動中にアプリケーションにて起きたデータを管理
 *
 * 更新履歴
 * 新規作成 村上 聖矢 2017/12/26
 *
 *
 * 更新者　　村上 聖矢
 * 更新日付  2017/12/26
**********************************************************************/
package beans;

/**********************************************************************
 * public class appBeans extends Content
 * 用途:アプリケーション起動中(tomcat起動中)のデータを管理するクラス
**********************************************************************/
public class appBeans extends Content {

	//ルール
	//１． property名 と メンバ変数名  は同じものにデータが入る
	//     例：
	//        property="id"
	//        String id
	//２．アクセッサは絶対作る
	//	  命名規則は セッター:set変数名(String 変数名){this.変数名 = 変数名 }
	//	             ゲッター:get変数名(){return 変数名 }
	//※変数とアクセッサでセットと覚える


    private String acessCount = "0";

    //--------------------------アクセッサ---------------------------------------------

    //acessCount
    public void setacessCount(String acessCount) {
    	Integer thisaccesCount = Integer.parseInt(this.acessCount);
    	thisaccesCount = thisaccesCount + Integer.parseInt(acessCount);
    	this.acessCount = thisaccesCount.toString() ;

    }
    public String getacessCount() {return acessCount;}

}
