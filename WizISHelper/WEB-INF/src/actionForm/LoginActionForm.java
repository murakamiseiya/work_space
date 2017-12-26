package actionForm;

import org.apache.struts.action.ActionForm;

/**********************************************************************
 * public class LoginAction extends Action
 * 用途:Login.jspのデータを取得保持するクラス
**********************************************************************/
public class LoginActionForm extends ActionForm {

	//ルール
	//１． property名 と メンバ変数名  は同じものにデータが入る
	//     例：
	//        property="id"
	//        String id
	//２．アクセッサは絶対作る
	//	  命名規則は セッター:set変数名(String 変数名){this.変数名 = 変数名 }
	//	             ゲッター:get変数名(){return 変数名 }
	//※変数とアクセッサでセットと覚える


    private String id;		//ユーザID
    private String pass;	//パスワード

    //--------------------------アクセッサ---------------------------------------------

    //id
    public void setId(String id) {this.id = id;}
    public String getId() {return id;}

    //pass
    public void setPass(String pass) {this.pass = pass;}
    public String getPass() {return pass;}

}
