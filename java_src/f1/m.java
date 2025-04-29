package f1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import f1.q0;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class m extends q0 {
    public static final a A = new a(null);
    private static final String B = m.class.getName();

    /* renamed from: z  reason: collision with root package name */
    private boolean f8478z;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final m a(Context context, String url, String expectedRedirectUrl) {
            kotlin.jvm.internal.l.e(context, "context");
            kotlin.jvm.internal.l.e(url, "url");
            kotlin.jvm.internal.l.e(expectedRedirectUrl, "expectedRedirectUrl");
            q0.b bVar = q0.f8518v;
            q0.s(context);
            return new m(context, url, expectedRedirectUrl, null);
        }
    }

    private m(Context context, String str, String str2) {
        super(context, str);
        A(str2);
    }

    public /* synthetic */ m(Context context, String str, String str2, kotlin.jvm.internal.g gVar) {
        this(context, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(m this$0) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        super.cancel();
    }

    @Override // f1.q0, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView r10 = r();
        if (!u() || t() || r10 == null || !r10.isShown()) {
            super.cancel();
        } else if (this.f8478z) {
        } else {
            this.f8478z = true;
            r10.loadUrl(kotlin.jvm.internal.l.k("javascript:", "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();"));
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: f1.l
                @Override // java.lang.Runnable
                public final void run() {
                    m.F(m.this);
                }
            }, 1500L);
        }
    }

    @Override // f1.q0
    public Bundle w(String str) {
        Uri parse = Uri.parse(str);
        l0 l0Var = l0.f8470a;
        Bundle j02 = l0.j0(parse.getQuery());
        String string = j02.getString("bridge_args");
        j02.remove("bridge_args");
        if (!l0.X(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                c cVar = c.f8386a;
                j02.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", c.a(jSONObject));
            } catch (JSONException e10) {
                l0 l0Var2 = l0.f8470a;
                l0.f0(B, "Unable to parse bridge_args JSON", e10);
            }
        }
        String string2 = j02.getString("method_results");
        j02.remove("method_results");
        l0 l0Var3 = l0.f8470a;
        if (!l0.X(string2)) {
            try {
                JSONObject jSONObject2 = new JSONObject(string2);
                c cVar2 = c.f8386a;
                j02.putBundle("com.facebook.platform.protocol.RESULT_ARGS", c.a(jSONObject2));
            } catch (JSONException e11) {
                l0 l0Var4 = l0.f8470a;
                l0.f0(B, "Unable to parse bridge_args JSON", e11);
            }
        }
        j02.remove("version");
        e0 e0Var = e0.f8417a;
        j02.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", e0.t());
        return j02;
    }
}
