package f1;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import f1.q0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p0.a;
import p0.j0;
/* loaded from: classes.dex */
public class q0 extends Dialog {

    /* renamed from: v  reason: collision with root package name */
    public static final b f8518v = new b(null);

    /* renamed from: w  reason: collision with root package name */
    private static final int f8519w = d1.e.com_facebook_activity_theme;

    /* renamed from: x  reason: collision with root package name */
    private static volatile int f8520x;

    /* renamed from: y  reason: collision with root package name */
    private static d f8521y;

    /* renamed from: j  reason: collision with root package name */
    private String f8522j;

    /* renamed from: k  reason: collision with root package name */
    private String f8523k;

    /* renamed from: l  reason: collision with root package name */
    private e f8524l;

    /* renamed from: m  reason: collision with root package name */
    private WebView f8525m;

    /* renamed from: n  reason: collision with root package name */
    private ProgressDialog f8526n;

    /* renamed from: o  reason: collision with root package name */
    private ImageView f8527o;

    /* renamed from: p  reason: collision with root package name */
    private FrameLayout f8528p;

    /* renamed from: q  reason: collision with root package name */
    private f f8529q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f8530r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f8531s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f8532t;

    /* renamed from: u  reason: collision with root package name */
    private WindowManager.LayoutParams f8533u;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Context f8534a;

        /* renamed from: b  reason: collision with root package name */
        private String f8535b;

        /* renamed from: c  reason: collision with root package name */
        private String f8536c;

        /* renamed from: d  reason: collision with root package name */
        private int f8537d;

        /* renamed from: e  reason: collision with root package name */
        private e f8538e;

        /* renamed from: f  reason: collision with root package name */
        private Bundle f8539f;

        /* renamed from: g  reason: collision with root package name */
        private p0.a f8540g;

        public a(Context context, String action, Bundle bundle) {
            kotlin.jvm.internal.l.e(context, "context");
            kotlin.jvm.internal.l.e(action, "action");
            a.c cVar = p0.a.f14786u;
            this.f8540g = cVar.e();
            if (!cVar.g()) {
                l0 l0Var = l0.f8470a;
                String F = l0.F(context);
                if (F == null) {
                    throw new p0.s("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
                this.f8535b = F;
            }
            b(context, action, bundle);
        }

        public a(Context context, String str, String action, Bundle bundle) {
            kotlin.jvm.internal.l.e(context, "context");
            kotlin.jvm.internal.l.e(action, "action");
            if (str == null) {
                l0 l0Var = l0.f8470a;
                str = l0.F(context);
            }
            m0 m0Var = m0.f8479a;
            this.f8535b = m0.k(str, "applicationId");
            b(context, action, bundle);
        }

        private final void b(Context context, String str, Bundle bundle) {
            this.f8534a = context;
            this.f8536c = str;
            if (bundle != null) {
                this.f8539f = bundle;
            } else {
                this.f8539f = new Bundle();
            }
        }

        public q0 a() {
            p0.a aVar = this.f8540g;
            if (aVar != null) {
                Bundle bundle = this.f8539f;
                if (bundle != null) {
                    bundle.putString("app_id", aVar == null ? null : aVar.c());
                }
                Bundle bundle2 = this.f8539f;
                if (bundle2 != null) {
                    p0.a aVar2 = this.f8540g;
                    bundle2.putString("access_token", aVar2 != null ? aVar2.s() : null);
                }
            } else {
                Bundle bundle3 = this.f8539f;
                if (bundle3 != null) {
                    bundle3.putString("app_id", this.f8535b);
                }
            }
            b bVar = q0.f8518v;
            Context context = this.f8534a;
            if (context != null) {
                return bVar.c(context, this.f8536c, this.f8539f, this.f8537d, this.f8538e);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final String c() {
            return this.f8535b;
        }

        public final Context d() {
            return this.f8534a;
        }

        public final e e() {
            return this.f8538e;
        }

        public final Bundle f() {
            return this.f8539f;
        }

        public final int g() {
            return this.f8537d;
        }

        public final a h(e eVar) {
            this.f8538e = eVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final int a() {
            m0 m0Var = m0.f8479a;
            m0.l();
            return q0.f8520x;
        }

        protected final void b(Context context) {
            if (context == null) {
                return;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if ((applicationInfo == null ? null : applicationInfo.metaData) != null && q0.f8520x == 0) {
                    e(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }

        public final q0 c(Context context, String str, Bundle bundle, int i10, e eVar) {
            kotlin.jvm.internal.l.e(context, "context");
            q0.s(context);
            return new q0(context, str, bundle, i10, p1.i0.FACEBOOK, eVar, null);
        }

        public final q0 d(Context context, String str, Bundle bundle, int i10, p1.i0 targetApp, e eVar) {
            kotlin.jvm.internal.l.e(context, "context");
            kotlin.jvm.internal.l.e(targetApp, "targetApp");
            q0.s(context);
            return new q0(context, str, bundle, i10, targetApp, eVar, null);
        }

        public final void e(int i10) {
            if (i10 == 0) {
                i10 = q0.f8519w;
            }
            q0.f8520x = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q0 f8541a;

        public c(q0 this$0) {
            kotlin.jvm.internal.l.e(this$0, "this$0");
            this.f8541a = this$0;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            ProgressDialog progressDialog;
            kotlin.jvm.internal.l.e(view, "view");
            kotlin.jvm.internal.l.e(url, "url");
            super.onPageFinished(view, url);
            if (!this.f8541a.f8531s && (progressDialog = this.f8541a.f8526n) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = this.f8541a.f8528p;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            WebView r10 = this.f8541a.r();
            if (r10 != null) {
                r10.setVisibility(0);
            }
            ImageView imageView = this.f8541a.f8527o;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            this.f8541a.f8532t = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap bitmap) {
            ProgressDialog progressDialog;
            kotlin.jvm.internal.l.e(view, "view");
            kotlin.jvm.internal.l.e(url, "url");
            l0 l0Var = l0.f8470a;
            l0.e0("FacebookSDK.WebDialog", kotlin.jvm.internal.l.k("Webview loading URL: ", url));
            super.onPageStarted(view, url, bitmap);
            if (this.f8541a.f8531s || (progressDialog = this.f8541a.f8526n) == null) {
                return;
            }
            progressDialog.show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int i10, String description, String failingUrl) {
            kotlin.jvm.internal.l.e(view, "view");
            kotlin.jvm.internal.l.e(description, "description");
            kotlin.jvm.internal.l.e(failingUrl, "failingUrl");
            super.onReceivedError(view, i10, description, failingUrl);
            this.f8541a.y(new p0.q(description, i10, failingUrl));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            kotlin.jvm.internal.l.e(view, "view");
            kotlin.jvm.internal.l.e(handler, "handler");
            kotlin.jvm.internal.l.e(error, "error");
            super.onReceivedSslError(view, handler, error);
            handler.cancel();
            this.f8541a.y(new p0.q(null, -11, null));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            boolean t10;
            boolean t11;
            boolean w10;
            int i10;
            kotlin.jvm.internal.l.e(view, "view");
            kotlin.jvm.internal.l.e(url, "url");
            l0 l0Var = l0.f8470a;
            l0.e0("FacebookSDK.WebDialog", kotlin.jvm.internal.l.k("Redirect URL: ", url));
            Uri parse = Uri.parse(url);
            boolean z10 = parse.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", parse.getPath());
            t10 = ka.p.t(url, this.f8541a.f8523k, false, 2, null);
            if (!t10) {
                t11 = ka.p.t(url, "fbconnect://cancel", false, 2, null);
                if (t11) {
                    this.f8541a.cancel();
                    return true;
                }
                if (!z10) {
                    w10 = ka.q.w(url, "touch", false, 2, null);
                    if (!w10) {
                        try {
                            this.f8541a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                            return true;
                        } catch (ActivityNotFoundException unused) {
                            return false;
                        }
                    }
                }
                return false;
            }
            Bundle w11 = this.f8541a.w(url);
            String string = w11.getString("error");
            if (string == null) {
                string = w11.getString("error_type");
            }
            String string2 = w11.getString("error_msg");
            if (string2 == null) {
                string2 = w11.getString("error_message");
            }
            if (string2 == null) {
                string2 = w11.getString("error_description");
            }
            String string3 = w11.getString("error_code");
            if (string3 != null && !l0.X(string3)) {
                try {
                    i10 = Integer.parseInt(string3);
                } catch (NumberFormatException unused2) {
                }
                l0 l0Var2 = l0.f8470a;
                if (!l0.X(string) && l0.X(string2) && i10 == -1) {
                    this.f8541a.z(w11);
                } else if ((string == null && (kotlin.jvm.internal.l.a(string, "access_denied") || kotlin.jvm.internal.l.a(string, "OAuthAccessDeniedException"))) || i10 == 4201) {
                    this.f8541a.cancel();
                } else {
                    this.f8541a.y(new p0.h0(new p0.v(i10, string, string2), string2));
                }
                return true;
            }
            i10 = -1;
            l0 l0Var22 = l0.f8470a;
            if (!l0.X(string)) {
            }
            if (string == null) {
            }
            this.f8541a.y(new p0.h0(new p0.v(i10, string, string2), string2));
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(WebView webView);
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(Bundle bundle, p0.s sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class f extends AsyncTask<Void, Void, String[]> {

        /* renamed from: a  reason: collision with root package name */
        private final String f8542a;

        /* renamed from: b  reason: collision with root package name */
        private final Bundle f8543b;

        /* renamed from: c  reason: collision with root package name */
        private Exception[] f8544c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q0 f8545d;

        public f(q0 this$0, String action, Bundle parameters) {
            kotlin.jvm.internal.l.e(this$0, "this$0");
            kotlin.jvm.internal.l.e(action, "action");
            kotlin.jvm.internal.l.e(parameters, "parameters");
            this.f8545d = this$0;
            this.f8542a = action;
            this.f8543b = parameters;
            this.f8544c = new Exception[0];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(String[] results, int i10, f this$0, CountDownLatch latch, p0.o0 response) {
            p0.v b10;
            String str;
            kotlin.jvm.internal.l.e(results, "$results");
            kotlin.jvm.internal.l.e(this$0, "this$0");
            kotlin.jvm.internal.l.e(latch, "$latch");
            kotlin.jvm.internal.l.e(response, "response");
            try {
                b10 = response.b();
                str = "Error staging photo.";
            } catch (Exception e10) {
                this$0.f8544c[i10] = e10;
            }
            if (b10 != null) {
                String c10 = b10.c();
                if (c10 != null) {
                    str = c10;
                }
                throw new p0.t(response, str);
            }
            JSONObject c11 = response.c();
            if (c11 == null) {
                throw new p0.s("Error staging photo.");
            }
            String optString = c11.optString("uri");
            if (optString == null) {
                throw new p0.s("Error staging photo.");
            }
            results[i10] = optString;
            latch.countDown();
        }

        protected String[] b(Void... p02) {
            if (k1.a.d(this)) {
                return null;
            }
            try {
                kotlin.jvm.internal.l.e(p02, "p0");
                String[] stringArray = this.f8543b.getStringArray("media");
                if (stringArray == null) {
                    return null;
                }
                final String[] strArr = new String[stringArray.length];
                this.f8544c = new Exception[stringArray.length];
                final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                p0.a e10 = p0.a.f14786u.e();
                final int i10 = 0;
                try {
                    int length = stringArray.length - 1;
                    if (length >= 0) {
                        while (true) {
                            int i11 = i10 + 1;
                            if (isCancelled()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((p0.m0) it.next()).cancel(true);
                                }
                                return null;
                            }
                            Uri uri = Uri.parse(stringArray[i10]);
                            l0 l0Var = l0.f8470a;
                            if (l0.Z(uri)) {
                                strArr[i10] = uri.toString();
                                countDownLatch.countDown();
                            } else {
                                j0.b bVar = new j0.b() { // from class: f1.r0
                                    @Override // p0.j0.b
                                    public final void b(p0.o0 o0Var) {
                                        q0.f.c(strArr, i10, this, countDownLatch, o0Var);
                                    }
                                };
                                r1.a aVar = r1.a.f16635a;
                                kotlin.jvm.internal.l.d(uri, "uri");
                                concurrentLinkedQueue.add(r1.a.a(e10, uri, bVar).l());
                            }
                            if (i11 > length) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    countDownLatch.await();
                    return strArr;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((p0.m0) it2.next()).cancel(true);
                    }
                    return null;
                }
            } catch (Throwable th) {
                k1.a.b(th, this);
                return null;
            }
        }

        protected void d(String[] strArr) {
            List b10;
            if (k1.a.d(this)) {
                return;
            }
            try {
                ProgressDialog progressDialog = this.f8545d.f8526n;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                Exception[] excArr = this.f8544c;
                int i10 = 0;
                int length = excArr.length;
                while (i10 < length) {
                    Exception exc = excArr[i10];
                    i10++;
                    if (exc != null) {
                        this.f8545d.y(exc);
                        return;
                    }
                }
                if (strArr == null) {
                    this.f8545d.y(new p0.s("Failed to stage photos for web dialog"));
                    return;
                }
                b10 = t9.j.b(strArr);
                if (b10.contains(null)) {
                    this.f8545d.y(new p0.s("Failed to stage photos for web dialog"));
                    return;
                }
                l0 l0Var = l0.f8470a;
                l0.k0(this.f8543b, "media", new JSONArray((Collection) b10));
                h0 h0Var = h0.f8445a;
                String b11 = h0.b();
                StringBuilder sb = new StringBuilder();
                p0.f0 f0Var = p0.f0.f14852a;
                sb.append(p0.f0.w());
                sb.append("/dialog/");
                sb.append(this.f8542a);
                Uri g10 = l0.g(b11, sb.toString(), this.f8543b);
                this.f8545d.f8522j = g10.toString();
                ImageView imageView = this.f8545d.f8527o;
                if (imageView == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                this.f8545d.C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
            } catch (Throwable th) {
                k1.a.b(th, this);
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (k1.a.d(this)) {
                return null;
            }
            try {
                return b(voidArr);
            } catch (Throwable th) {
                k1.a.b(th, this);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(String[] strArr) {
            if (k1.a.d(this)) {
                return;
            }
            try {
                d(strArr);
            } catch (Throwable th) {
                k1.a.b(th, this);
            }
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class g {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8546a;

        static {
            int[] iArr = new int[p1.i0.valuesCustom().length];
            iArr[p1.i0.INSTAGRAM.ordinal()] = 1;
            f8546a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends WebView {
        h(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            try {
                super.onWindowFocusChanged(z10);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q0(Context context, String url) {
        this(context, url, f8518v.a());
        kotlin.jvm.internal.l.e(context, "context");
        kotlin.jvm.internal.l.e(url, "url");
    }

    private q0(Context context, String str, int i10) {
        super(context, i10 == 0 ? f8518v.a() : i10);
        this.f8523k = "fbconnect://success";
        this.f8522j = str;
    }

    private q0(Context context, String str, Bundle bundle, int i10, p1.i0 i0Var, e eVar) {
        super(context, i10 == 0 ? f8518v.a() : i10);
        String b10;
        String str2;
        this.f8523k = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        l0 l0Var = l0.f8470a;
        String str3 = l0.R(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f8523k = str3;
        bundle.putString("redirect_uri", str3);
        bundle.putString("display", "touch");
        p0.f0 f0Var = p0.f0.f14852a;
        bundle.putString("client_id", p0.f0.m());
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
        String format = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{p0.f0.B()}, 1));
        kotlin.jvm.internal.l.d(format, "java.lang.String.format(locale, format, *args)");
        bundle.putString("sdk", format);
        this.f8524l = eVar;
        if (kotlin.jvm.internal.l.a(str, "share") && bundle.containsKey("media")) {
            this.f8529q = new f(this, str, bundle);
            return;
        }
        if (g.f8546a[i0Var.ordinal()] == 1) {
            h0 h0Var = h0.f8445a;
            b10 = h0.k();
            str2 = "oauth/authorize";
        } else {
            h0 h0Var2 = h0.f8445a;
            b10 = h0.b();
            str2 = p0.f0.w() + "/dialog/" + ((Object) str);
        }
        this.f8522j = l0.g(b10, str2, bundle).toString();
    }

    public /* synthetic */ q0(Context context, String str, Bundle bundle, int i10, p1.i0 i0Var, e eVar, kotlin.jvm.internal.g gVar) {
        this(context, str, bundle, i10, i0Var, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(int i10) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f8525m = new h(getContext());
        d dVar = f8521y;
        if (dVar != null) {
            dVar.a(r());
        }
        WebView webView = this.f8525m;
        if (webView != null) {
            webView.setVerticalScrollBarEnabled(false);
        }
        WebView webView2 = this.f8525m;
        if (webView2 != null) {
            webView2.setHorizontalScrollBarEnabled(false);
        }
        WebView webView3 = this.f8525m;
        if (webView3 != null) {
            webView3.setWebViewClient(new c(this));
        }
        WebView webView4 = this.f8525m;
        WebSettings settings = webView4 == null ? null : webView4.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView5 = this.f8525m;
        if (webView5 != null) {
            String str = this.f8522j;
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            webView5.loadUrl(str);
        }
        WebView webView6 = this.f8525m;
        if (webView6 != null) {
            webView6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView7 = this.f8525m;
        if (webView7 != null) {
            webView7.setVisibility(4);
        }
        WebView webView8 = this.f8525m;
        WebSettings settings2 = webView8 == null ? null : webView8.getSettings();
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        WebView webView9 = this.f8525m;
        WebSettings settings3 = webView9 != null ? webView9.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        WebView webView10 = this.f8525m;
        if (webView10 != null) {
            webView10.setFocusable(true);
        }
        WebView webView11 = this.f8525m;
        if (webView11 != null) {
            webView11.setFocusableInTouchMode(true);
        }
        WebView webView12 = this.f8525m;
        if (webView12 != null) {
            webView12.setOnTouchListener(new View.OnTouchListener() { // from class: f1.p0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean D;
                    D = q0.D(view, motionEvent);
                    return D;
                }
            });
        }
        linearLayout.setPadding(i10, i10, i10, i10);
        linearLayout.addView(this.f8525m);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f8528p;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    private final void o() {
        ImageView imageView = new ImageView(getContext());
        this.f8527o = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: f1.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q0.p(q0.this, view);
            }
        });
        Drawable drawable = getContext().getResources().getDrawable(d1.a.com_facebook_close);
        ImageView imageView2 = this.f8527o;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f8527o;
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(q0 this$0, View view) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        this$0.cancel();
    }

    private final int q(int i10, float f10, int i11, int i12) {
        int i13 = (int) (i10 / f10);
        double d10 = 0.5d;
        if (i13 <= i11) {
            d10 = 1.0d;
        } else if (i13 < i12) {
            d10 = 0.5d + (((i12 - i13) / (i12 - i11)) * 0.5d);
        }
        return (int) (i10 * d10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void s(Context context) {
        f8518v.b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(q0 this$0, DialogInterface dialogInterface) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        this$0.cancel();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A(String expectedRedirectUrl) {
        kotlin.jvm.internal.l.e(expectedRedirectUrl, "expectedRedirectUrl");
        this.f8523k = expectedRedirectUrl;
    }

    public final void B(e eVar) {
        this.f8524l = eVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f8524l == null || this.f8530r) {
            return;
        }
        y(new p0.u());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f8525m;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f8531s && (progressDialog = this.f8526n) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        WindowManager.LayoutParams attributes;
        this.f8531s = false;
        l0 l0Var = l0.f8470a;
        Context context = getContext();
        kotlin.jvm.internal.l.d(context, "context");
        if (l0.i0(context) && (layoutParams = this.f8533u) != null) {
            if ((layoutParams == null ? null : layoutParams.token) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    Window window = ownerActivity == null ? null : ownerActivity.getWindow();
                    layoutParams.token = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                WindowManager.LayoutParams layoutParams2 = this.f8533u;
                l0.e0("FacebookSDK.WebDialog", kotlin.jvm.internal.l.k("Set token on onAttachedToWindow(): ", layoutParams2 != null ? layoutParams2.token : null));
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f8526n = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f8526n;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(d1.d.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.f8526n;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f8526n;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: f1.n0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    q0.v(q0.this, dialogInterface);
                }
            });
        }
        requestWindowFeature(1);
        this.f8528p = new FrameLayout(getContext());
        x();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        o();
        if (this.f8522j != null) {
            ImageView imageView = this.f8527o;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.f8528p;
        if (frameLayout != null) {
            frameLayout.addView(this.f8527o, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f8528p;
        if (frameLayout2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        setContentView(frameLayout2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f8531s = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent event) {
        kotlin.jvm.internal.l.e(event, "event");
        if (i10 == 4) {
            WebView webView = this.f8525m;
            if (webView != null) {
                if (kotlin.jvm.internal.l.a(webView == null ? null : Boolean.valueOf(webView.canGoBack()), Boolean.TRUE)) {
                    WebView webView2 = this.f8525m;
                    if (webView2 == null) {
                        return true;
                    }
                    webView2.goBack();
                    return true;
                }
            }
            cancel();
        }
        return super.onKeyDown(i10, event);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        f fVar = this.f8529q;
        if (fVar != null) {
            if ((fVar == null ? null : fVar.getStatus()) == AsyncTask.Status.PENDING) {
                f fVar2 = this.f8529q;
                if (fVar2 != null) {
                    fVar2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f8526n;
                if (progressDialog == null) {
                    return;
                }
                progressDialog.show();
                return;
            }
        }
        x();
    }

    @Override // android.app.Dialog
    protected void onStop() {
        f fVar = this.f8529q;
        if (fVar != null) {
            fVar.cancel(true);
            ProgressDialog progressDialog = this.f8526n;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        kotlin.jvm.internal.l.e(params, "params");
        if (params.token == null) {
            this.f8533u = params;
        }
        super.onWindowAttributesChanged(params);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WebView r() {
        return this.f8525m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean t() {
        return this.f8530r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean u() {
        return this.f8532t;
    }

    public Bundle w(String str) {
        Uri parse = Uri.parse(str);
        l0 l0Var = l0.f8470a;
        Bundle j02 = l0.j0(parse.getQuery());
        j02.putAll(l0.j0(parse.getFragment()));
        return j02;
    }

    public final void x() {
        Object systemService = getContext().getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        int i12 = i10 < i11 ? i10 : i11;
        if (i10 < i11) {
            i10 = i11;
        }
        int min = Math.min(q(i12, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        int min2 = Math.min(q(i10, displayMetrics.density, 800, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(min, min2);
    }

    protected final void y(Throwable th) {
        if (this.f8524l == null || this.f8530r) {
            return;
        }
        this.f8530r = true;
        p0.s sVar = th instanceof p0.s ? (p0.s) th : new p0.s(th);
        e eVar = this.f8524l;
        if (eVar != null) {
            eVar.a(null, sVar);
        }
        dismiss();
    }

    protected final void z(Bundle bundle) {
        e eVar = this.f8524l;
        if (eVar == null || this.f8530r) {
            return;
        }
        this.f8530r = true;
        if (eVar != null) {
            eVar.a(bundle, null);
        }
        dismiss();
    }
}
