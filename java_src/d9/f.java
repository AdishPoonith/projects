package d9;

import d9.a;
import java.util.ArrayList;
import java.util.Map;
import r8.a;
/* loaded from: classes.dex */
public final /* synthetic */ class f {
    public static r8.i<Object> a() {
        return a.c.f7943d;
    }

    public static /* synthetic */ void b(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.a((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.c((String) arrayList2.get(0), (Map) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void d(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.d((String) arrayList2.get(0), (a.d) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            bVar.b();
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static void f(r8.c cVar, final a.b bVar) {
        r8.a aVar = new r8.a(cVar, "dev.flutter.pigeon.UrlLauncherApi.canLaunchUrl", a());
        if (bVar != null) {
            aVar.e(new a.d() { // from class: d9.b
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    f.b(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        r8.a aVar2 = new r8.a(cVar, "dev.flutter.pigeon.UrlLauncherApi.launchUrl", a());
        if (bVar != null) {
            aVar2.e(new a.d() { // from class: d9.c
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    f.c(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        r8.a aVar3 = new r8.a(cVar, "dev.flutter.pigeon.UrlLauncherApi.openUrlInWebView", a());
        if (bVar != null) {
            aVar3.e(new a.d() { // from class: d9.d
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    f.d(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        r8.a aVar4 = new r8.a(cVar, "dev.flutter.pigeon.UrlLauncherApi.closeWebView", a());
        if (bVar != null) {
            aVar4.e(new a.d() { // from class: d9.e
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    f.e(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
    }
}
