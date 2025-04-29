package z7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.maru.twitter_login.chrome_custom_tabs.ChromeCustomTabsActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import r8.j;
import r8.k;
import y7.b;
/* loaded from: classes.dex */
public class a implements k.c {

    /* renamed from: m  reason: collision with root package name */
    public static final Map<String, a> f20892m = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public k f20893j;

    /* renamed from: k  reason: collision with root package name */
    public b f20894k;

    /* renamed from: l  reason: collision with root package name */
    public String f20895l = UUID.randomUUID().toString();

    public a(b bVar) {
        this.f20894k = bVar;
        k kVar = new k(bVar.b(), "twitter_login/auth_browser");
        this.f20893j = kVar;
        kVar.e(this);
        f20892m.put(this.f20895l, this);
    }

    @Override // r8.k.c
    public void I(j jVar, k.d dVar) {
        if ("open".equals(jVar.f16777a)) {
            b(this.f20894k.h(), (String) jVar.a("id"), (String) jVar.a("url"), dVar);
        } else if ("isAvailable".equals(jVar.f16777a)) {
            dVar.a(Boolean.valueOf(com.maru.twitter_login.chrome_custom_tabs.a.e(this.f20894k.h())));
        } else {
            dVar.c();
        }
    }

    public void a() {
        this.f20893j.e(null);
        f20892m.remove(this.f20895l);
        this.f20894k = null;
    }

    public void b(Activity activity, String str, String str2, k.d dVar) {
        Boolean bool;
        if (com.maru.twitter_login.chrome_custom_tabs.a.e(activity)) {
            Bundle bundle = new Bundle();
            bundle.putString("url", str2);
            bundle.putString("id", str);
            bundle.putString("managerId", this.f20895l);
            Intent intent = new Intent(activity, ChromeCustomTabsActivity.class);
            intent.putExtras(bundle);
            activity.startActivity(intent);
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        dVar.a(bool);
    }
}
