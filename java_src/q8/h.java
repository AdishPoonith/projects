package q8;

import java.util.HashMap;
import r8.k;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final r8.k f16344a;

    /* renamed from: b  reason: collision with root package name */
    private final k.c f16345b;

    /* loaded from: classes.dex */
    class a implements k.c {
        a() {
        }

        @Override // r8.k.c
        public void I(r8.j jVar, k.d dVar) {
            dVar.a(null);
        }
    }

    public h(e8.a aVar) {
        a aVar2 = new a();
        this.f16345b = aVar2;
        r8.k kVar = new r8.k(aVar, "flutter/navigation", r8.g.f16776a);
        this.f16344a = kVar;
        kVar.e(aVar2);
    }

    public void a() {
        d8.b.f("NavigationChannel", "Sending message to pop route.");
        this.f16344a.c("popRoute", null);
    }

    public void b(String str) {
        d8.b.f("NavigationChannel", "Sending message to push route information '" + str + "'");
        HashMap hashMap = new HashMap();
        hashMap.put("location", str);
        this.f16344a.c("pushRouteInformation", hashMap);
    }

    public void c(String str) {
        d8.b.f("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f16344a.c("setInitialRoute", str);
    }
}
