import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	//ﾄﾞﾗｲﾊﾞｰの名前を変数に代入
	private static String driverName = "com.mysql.jdbc.Driver";
	//mysql用のURLの指定 ?以降はオプションなので必須ではない
	private static String url = "jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";

	//user名を変数に代入
	private static String user = "root";
	//passwoedを変数に代入
	private static String password = "mysql";

	//接続状態にする
	public Connection getConnection(){
		//状態を初期化 接続状態にするのと初期化するのは公式として覚えておくとOK
		Connection con = null;

		try{ //tryの中にはｴﾗｰが発生しそうな処理

			//ﾄﾞﾗｲﾊﾞｰがﾛｰﾄﾞされ使えるような状態にしている↓
			Class.forName(driverName);
			con = DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e){//ClassNotFoundExceptionはｸﾗｽが見つからない場合の例外
			e.printStackTrace();//printStackTracerはｴﾗｰに至る履歴を表示してくれる
		}catch(SQLException e){//SQLExceptioはﾃﾞｰﾀﾍﾞｰｽ処理に関する例外
			e.printStackTrace();
		}
		return con;
	}
}
