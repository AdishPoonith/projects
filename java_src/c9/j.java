package c9;

import c9.a;
import java.util.ArrayList;
import java.util.List;
import r8.a;
import r8.r;
/* loaded from: classes.dex */
public final /* synthetic */ class j {
    public static r8.i<Object> a() {
        return new r();
    }

    public static /* synthetic */ void b(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.remove((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.g((String) arrayList2.get(0), (Boolean) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void d(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.e((String) arrayList2.get(0), (String) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(a.b bVar, Object obj, a.e eVar) {
        Long valueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        String str = (String) arrayList2.get(0);
        Number number = (Number) arrayList2.get(1);
        if (number == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = a.a(th);
            }
        }
        arrayList.add(0, bVar.c(str, valueOf));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void f(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.h((String) arrayList2.get(0), (Double) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void g(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.f((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void h(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.b((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void i(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.a((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static void j(r8.c cVar, final a.b bVar) {
        r8.a aVar = new r8.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.remove", a(), cVar.d());
        if (bVar != null) {
            aVar.e(new a.d() { // from class: c9.b
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    j.b(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        r8.a aVar2 = new r8.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.setBool", a(), cVar.d());
        if (bVar != null) {
            aVar2.e(new a.d() { // from class: c9.c
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    j.c(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        r8.a aVar3 = new r8.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.setString", a(), cVar.d());
        if (bVar != null) {
            aVar3.e(new a.d() { // from class: c9.d
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    j.d(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        r8.a aVar4 = new r8.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.setInt", a(), cVar.d());
        if (bVar != null) {
            aVar4.e(new a.d() { // from class: c9.e
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    j.e(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
        r8.a aVar5 = new r8.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.setDouble", a(), cVar.d());
        if (bVar != null) {
            aVar5.e(new a.d() { // from class: c9.f
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    j.f(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar5.e(null);
        }
        r8.a aVar6 = new r8.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.setStringList", a(), cVar.d());
        if (bVar != null) {
            aVar6.e(new a.d() { // from class: c9.g
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    j.g(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar6.e(null);
        }
        r8.a aVar7 = new r8.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.clearWithPrefix", a(), cVar.d());
        if (bVar != null) {
            aVar7.e(new a.d() { // from class: c9.h
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    j.h(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar7.e(null);
        }
        r8.a aVar8 = new r8.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.getAllWithPrefix", a(), cVar.d());
        if (bVar != null) {
            aVar8.e(new a.d() { // from class: c9.i
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    j.i(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar8.e(null);
        }
    }
}
