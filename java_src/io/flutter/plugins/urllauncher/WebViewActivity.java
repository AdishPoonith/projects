package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class WebViewActivity extends Activity {

    /* renamed from: l  reason: collision with root package name */
    WebView f10807l;

    /* renamed from: j  reason: collision with root package name */
    private final BroadcastReceiver f10805j = new a();

    /* renamed from: k  reason: collision with root package name */
    private final WebViewClient f10806k = new b();

    /* renamed from: m  reason: collision with root package name */
    private final IntentFilter f10808m = new IntentFilter("close action");

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("close action".equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends WebViewClient {
        b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* loaded from: classes.dex */
    class c extends WebChromeClient {

        /* loaded from: classes.dex */
        class a extends WebViewClient {
            a() {
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                WebViewActivity.this.f10807l.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                WebViewActivity.this.f10807l.loadUrl(str);
                return true;
            }
        }

        c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            a aVar = new a();
            WebView webView2 = new WebView(WebViewActivity.this.f10807l.getContext());
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static Intent a(Context context, String str, boolean z10, boolean z11, Bundle bundle) {
        return new Intent(context, WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", z10).putExtra("enableDomStorage", z11).putExtra("com.android.browser.headers", bundle);
    }

    public static Map<String, String> b(Bundle bundle) {
        if (bundle == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f10807l = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        this.f10807l.loadUrl(stringExtra, b(intent.getBundleExtra("com.android.browser.headers")));
        this.f10807l.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f10807l.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f10807l.setWebViewClient(this.f10806k);
        this.f10807l.getSettings().setSupportMultipleWindows(true);
        this.f10807l.setWebChromeClient(new c());
        registerReceiver(this.f10805j, this.f10808m);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f10805j);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4 && this.f10807l.canGoBack()) {
            this.f10807l.goBack();
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }
}
