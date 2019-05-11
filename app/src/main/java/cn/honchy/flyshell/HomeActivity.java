package cn.honchy.flyshell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;

import java.util.HashMap;
import java.util.Map;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        WebView wv = findViewById(R.id.webview);

        Map data = new HashMap();
        data.put("name", "LiLei");
        wv.addJavascriptInterface(data, "data");
    }
}
