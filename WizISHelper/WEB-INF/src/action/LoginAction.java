package action;

import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import actionForm.LoginActionForm;

/**********************************************************************
 * public class LoginAction extends Action
 * 用途：ログイン認証を行うクラス
**********************************************************************/
public class LoginAction extends Action {

	/******************************************************************
	 *	public ActionForward execute(
	 *			ActionMapping mapping,	//URLとActionクラスとのマッピング情報を保持するクラス
	 *			ActionForm form,		//strats-config.xmlのnameに書いてあるクラスが入る
	 *			HttpServletRequest req,	//リクエストパラメータのデータが入っているクラス
	 *			HttpServletResponse res	//レスポンスデータとして返却するデータを入れる
	 *	)
	 * 用途   :クラスが呼ばれる時に実行されるメソッド
	 * 戻り値 :forwardのNameを返す(それが次のページになる)
	 *****************************************************************/
	 public ActionForward execute(ActionMapping mapping,
	            ActionForm form,
	            HttpServletRequest req,
	            HttpServletResponse res) {


		System.setProperty("today", "/20160101");
		URL url = Thread.currentThread().getContextClassLoader().getResource("log4j.xml");

		Logger logger = Logger.getLogger(LoginAction.class);
		DOMConfigurator.configure(url);

		 //最終的にはDBからユーザデータを取得して入れる変数
		 //今回は暫定として適当なデータを入れている
		 String db_id = "java" ;
		 String db_pass = "road" ;

		//セッション情報を取得
		HttpSession session = req.getSession();
		ActionMessages errors = new ActionMessages();

		//前のページにて入力されたデータを取得する(formにそのデータが入っている)
		//今回は以下の所に入力されたデータが入る
		//<html:text property="id" size="16"/>
		//<html:password property="pass" size="16" redisplay="false"/>
		//このデータにLoginActionFormのメンバ変数にデータが入る
		//これはStrats独特の処理
		LoginActionForm authenticationForm
		    = (LoginActionForm)form;

		//ゲッターを使いLoginActionから入力されたデータを取得する
		String id = authenticationForm.getId();
		String pass = authenticationForm.getPass();

		//IDとパスワードが同じでなければ
		if(!(db_id.equals(id) && db_pass.equals(pass))) {
			//ログイン失敗の処理を行う
		    errors.add(ActionMessages.GLOBAL_MESSAGE,
		        new ActionMessage("errors.login"));
		    	saveErrors(req, errors);
		    	logger.info("パスワードが違います。");
		    return (mapping.findForward("fail"));
		    //ここでstruts-config.xmlのnameがfail(101ページ)に戻ります。
		} else {
			//ログイン成功の処理を行う
			//セッションにidを設定する
		    session.setAttribute("id", id);
	    	logger.info("ログイン成功です。");
		    return (mapping.findForward("success"));
		    //ここでstruts-config.xmlのnameがsuccess(100ページ)に戻ります。

		}
	 }
}
