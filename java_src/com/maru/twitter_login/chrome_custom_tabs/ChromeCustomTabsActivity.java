package com.maru.twitter_login.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.maru.twitter_login.chrome_custom_tabs.a;
import java.util.HashMap;
import q.d;
import q.f;
import r8.c;
import r8.j;
import r8.k;
/* loaded from: classes.dex */
public class ChromeCustomTabsActivity extends Activity implements k.c {

    /* renamed from: j  reason: collision with root package name */
    public k f7488j;

    /* renamed from: k  reason: collision with root package name */
    public String f7489k;

    /* renamed from: l  reason: collision with root package name */
    public d.a f7490l;

    /* renamed from: m  reason: collision with root package name */
    public com.maru.twitter_login.chrome_custom_tabs.a f7491m;

    /* renamed from: n  reason: collision with root package name */
    public f f7492n;

    /* renamed from: o  reason: collision with root package name */
    public z7.a f7493o;

    /* renamed from: p  reason: collision with root package name */
    protected final int f7494p = 0;

    /* loaded from: classes.dex */
    class a implements a.InterfaceC0107a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f7495a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChromeCustomTabsActivity f7496b;

        a(String str, ChromeCustomTabsActivity chromeCustomTabsActivity) {
            this.f7495a = str;
            this.f7496b = chromeCustomTabsActivity;
        }

        @Override // com.maru.twitter_login.chrome_custom_tabs.a.InterfaceC0107a
        public void a() {
            this.f7496b.b();
            ChromeCustomTabsActivity.this.c();
        }

        @Override // com.maru.twitter_login.chrome_custom_tabs.a.InterfaceC0107a
        public void b() {
            ChromeCustomTabsActivity chromeCustomTabsActivity = ChromeCustomTabsActivity.this;
            chromeCustomTabsActivity.f7492n = chromeCustomTabsActivity.f7491m.d();
            Uri parse = Uri.parse(this.f7495a);
            ChromeCustomTabsActivity.this.f7491m.f(parse, null, null);
            ChromeCustomTabsActivity chromeCustomTabsActivity2 = ChromeCustomTabsActivity.this;
            chromeCustomTabsActivity2.f7490l = new d.a(chromeCustomTabsActivity2.f7492n);
            d a10 = ChromeCustomTabsActivity.this.f7490l.a();
            ChromeCustomTabsActivity.this.d(a10);
            com.maru.twitter_login.chrome_custom_tabs.a.g(this.f7496b, a10, parse, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(d dVar) {
        dVar.f15868a.setPackage(a8.a.b(this));
        a8.a.a(this, dVar.f15868a);
    }

    @Override // r8.k.c
    public void I(j jVar, k.d dVar) {
    }

    public void b() {
        this.f7492n = null;
        finish();
        this.f7488j.c("onClose", new HashMap());
    }

    public void c() {
        this.f7488j.e(null);
        this.f7493o = null;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 0) {
            b();
            c();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(y7.a.chrome_custom_tab);
        Bundle extras = getIntent().getExtras();
        this.f7493o = z7.a.f20892m.get(extras.getString("managerId"));
        this.f7489k = extras.getString("id");
        c b10 = this.f7493o.f20894k.b();
        k kVar = new k(b10, "twitter_login/auth_browser_" + this.f7489k);
        this.f7488j = kVar;
        kVar.e(this);
        String string = extras.getString("url");
        com.maru.twitter_login.chrome_custom_tabs.a aVar = new com.maru.twitter_login.chrome_custom_tabs.a();
        this.f7491m = aVar;
        aVar.h(new a(string, this));
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f7491m.c(this);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f7491m.i(this);
    }
}
