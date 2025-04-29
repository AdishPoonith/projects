package com.maru.twitter_login.chrome_custom_tabs;

import a8.d;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import q.c;
import q.e;
import q.f;
/* loaded from: classes.dex */
public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private f f7498a;

    /* renamed from: b  reason: collision with root package name */
    private c f7499b;

    /* renamed from: c  reason: collision with root package name */
    private e f7500c;

    /* renamed from: d  reason: collision with root package name */
    private InterfaceC0107a f7501d;

    /* renamed from: com.maru.twitter_login.chrome_custom_tabs.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0107a {
        void a();

        void b();
    }

    public static boolean e(Activity activity) {
        return a8.a.b(activity) != null;
    }

    public static void g(Activity activity, q.d dVar, Uri uri, int i10) {
        dVar.f15868a.setData(uri);
        activity.startActivityForResult(dVar.f15868a, i10);
    }

    @Override // a8.d
    public void a() {
        this.f7499b = null;
        this.f7498a = null;
        InterfaceC0107a interfaceC0107a = this.f7501d;
        if (interfaceC0107a != null) {
            interfaceC0107a.a();
        }
    }

    @Override // a8.d
    public void b(c cVar) {
        this.f7499b = cVar;
        cVar.f(0L);
        InterfaceC0107a interfaceC0107a = this.f7501d;
        if (interfaceC0107a != null) {
            interfaceC0107a.b();
        }
    }

    public void c(Activity activity) {
        String b10;
        if (this.f7499b == null && (b10 = a8.a.b(activity)) != null) {
            a8.c cVar = new a8.c(this);
            this.f7500c = cVar;
            c.a(activity, b10, cVar);
        }
    }

    public f d() {
        c cVar = this.f7499b;
        if (cVar == null) {
            this.f7498a = null;
        } else if (this.f7498a == null) {
            this.f7498a = cVar.d(null);
        }
        return this.f7498a;
    }

    public boolean f(Uri uri, Bundle bundle, List<Bundle> list) {
        f d10;
        if (this.f7499b == null || (d10 = d()) == null) {
            return false;
        }
        return d10.f(uri, bundle, list);
    }

    public void h(InterfaceC0107a interfaceC0107a) {
        this.f7501d = interfaceC0107a;
    }

    public void i(Activity activity) {
        e eVar = this.f7500c;
        if (eVar == null) {
            return;
        }
        activity.unbindService(eVar);
        this.f7499b = null;
        this.f7498a = null;
        this.f7500c = null;
    }
}
