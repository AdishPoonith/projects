package b9;

import b9.a;
import java.util.ArrayList;
import r8.a;
import r8.r;
/* loaded from: classes.dex */
public final /* synthetic */ class h {
    public static r8.i<Object> a() {
        return new r();
    }

    public static /* synthetic */ void b(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.b());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.f());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void d(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.c());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.g());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void f(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.e());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void g(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.a(arrayList2.get(0) == null ? null : a.c.values()[((Integer) arrayList2.get(0)).intValue()]));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static void h(r8.c cVar, final a.b bVar) {
        r8.a aVar = new r8.a(cVar, "dev.flutter.pigeon.PathProviderApi.getTemporaryPath", a(), cVar.d());
        if (bVar != null) {
            aVar.e(new a.d() { // from class: b9.b
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    h.b(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        r8.a aVar2 = new r8.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationSupportPath", a(), cVar.d());
        if (bVar != null) {
            aVar2.e(new a.d() { // from class: b9.c
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    h.c(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        r8.a aVar3 = new r8.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationDocumentsPath", a(), cVar.d());
        if (bVar != null) {
            aVar3.e(new a.d() { // from class: b9.d
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    h.d(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        r8.a aVar4 = new r8.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePath", a(), cVar.d());
        if (bVar != null) {
            aVar4.e(new a.d() { // from class: b9.e
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    h.e(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
        r8.a aVar5 = new r8.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalCachePaths", a(), cVar.d());
        if (bVar != null) {
            aVar5.e(new a.d() { // from class: b9.f
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    h.f(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar5.e(null);
        }
        r8.a aVar6 = new r8.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePaths", a(), cVar.d());
        if (bVar != null) {
            aVar6.e(new a.d() { // from class: b9.g
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    h.g(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar6.e(null);
        }
    }
}
