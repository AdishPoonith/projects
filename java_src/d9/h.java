package d9;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import d9.a;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.Map;
/* loaded from: classes.dex */
final class h implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7952a;

    /* renamed from: b  reason: collision with root package name */
    private final a f7953b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f7954c;

    /* loaded from: classes.dex */
    interface a {
        String a(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(final Context context) {
        this(context, new a() { // from class: d9.g
            @Override // d9.h.a
            public final String a(Intent intent) {
                String h10;
                h10 = h.h(context, intent);
                return h10;
            }
        });
    }

    h(Context context, a aVar) {
        this.f7952a = context;
        this.f7953b = aVar;
    }

    private void f() {
        if (this.f7954c == null) {
            throw new a.C0127a("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
        }
    }

    private static Bundle g(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, map.get(str));
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(Context context, Intent intent) {
        ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
        if (resolveActivity == null) {
            return null;
        }
        return resolveActivity.toShortString();
    }

    @Override // d9.a.b
    public Boolean a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        String a10 = this.f7953b.a(intent);
        return a10 == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(a10));
    }

    @Override // d9.a.b
    public void b() {
        this.f7952a.sendBroadcast(new Intent("close action"));
    }

    @Override // d9.a.b
    public Boolean c(String str, Map<String, String> map) {
        f();
        try {
            this.f7954c.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", g(map)));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    @Override // d9.a.b
    public Boolean d(String str, a.d dVar) {
        f();
        try {
            this.f7954c.startActivity(WebViewActivity.a(this.f7954c, str, dVar.c().booleanValue(), dVar.b().booleanValue(), g(dVar.d())));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(Activity activity) {
        this.f7954c = activity;
    }
}
