package e9;

import e9.m;
import java.util.ArrayList;
import r8.a;
/* loaded from: classes.dex */
public final /* synthetic */ class l {
    public static r8.i<Object> a() {
        return m.b.f8179d;
    }

    public static /* synthetic */ void b(m.a aVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            aVar.a();
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = m.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(m.a aVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, aVar.j((m.c) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = m.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void d(m.a aVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            aVar.k((m.f) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = m.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(m.a aVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            aVar.h((m.i) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = m.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void f(m.a aVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            aVar.i((m.e) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = m.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void g(m.a aVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            aVar.c((m.j) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = m.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void h(m.a aVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            aVar.f((m.g) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = m.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void i(m.a aVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            aVar.b((m.i) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = m.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void j(m.a aVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, aVar.g((m.i) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = m.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void k(m.a aVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            aVar.e((m.h) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = m.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void l(m.a aVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            aVar.l((m.i) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = m.a(th);
        }
        eVar.a(arrayList);
    }

    public static void m(r8.c cVar, final m.a aVar) {
        r8.a aVar2 = new r8.a(cVar, "dev.flutter.pigeon.AndroidVideoPlayerApi.initialize", a());
        if (aVar != null) {
            aVar2.e(new a.d() { // from class: e9.a
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    l.b(m.a.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        r8.a aVar3 = new r8.a(cVar, "dev.flutter.pigeon.AndroidVideoPlayerApi.create", a());
        if (aVar != null) {
            aVar3.e(new a.d() { // from class: e9.c
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    l.c(m.a.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        r8.a aVar4 = new r8.a(cVar, "dev.flutter.pigeon.AndroidVideoPlayerApi.dispose", a());
        if (aVar != null) {
            aVar4.e(new a.d() { // from class: e9.e
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    l.e(m.a.this, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
        r8.a aVar5 = new r8.a(cVar, "dev.flutter.pigeon.AndroidVideoPlayerApi.setLooping", a());
        if (aVar != null) {
            aVar5.e(new a.d() { // from class: e9.f
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    l.f(m.a.this, obj, eVar);
                }
            });
        } else {
            aVar5.e(null);
        }
        r8.a aVar6 = new r8.a(cVar, "dev.flutter.pigeon.AndroidVideoPlayerApi.setVolume", a());
        if (aVar != null) {
            aVar6.e(new a.d() { // from class: e9.g
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    l.g(m.a.this, obj, eVar);
                }
            });
        } else {
            aVar6.e(null);
        }
        r8.a aVar7 = new r8.a(cVar, "dev.flutter.pigeon.AndroidVideoPlayerApi.setPlaybackSpeed", a());
        if (aVar != null) {
            aVar7.e(new a.d() { // from class: e9.h
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    l.h(m.a.this, obj, eVar);
                }
            });
        } else {
            aVar7.e(null);
        }
        r8.a aVar8 = new r8.a(cVar, "dev.flutter.pigeon.AndroidVideoPlayerApi.play", a());
        if (aVar != null) {
            aVar8.e(new a.d() { // from class: e9.i
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    l.i(m.a.this, obj, eVar);
                }
            });
        } else {
            aVar8.e(null);
        }
        r8.a aVar9 = new r8.a(cVar, "dev.flutter.pigeon.AndroidVideoPlayerApi.position", a());
        if (aVar != null) {
            aVar9.e(new a.d() { // from class: e9.j
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    l.j(m.a.this, obj, eVar);
                }
            });
        } else {
            aVar9.e(null);
        }
        r8.a aVar10 = new r8.a(cVar, "dev.flutter.pigeon.AndroidVideoPlayerApi.seekTo", a());
        if (aVar != null) {
            aVar10.e(new a.d() { // from class: e9.k
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    l.k(m.a.this, obj, eVar);
                }
            });
        } else {
            aVar10.e(null);
        }
        r8.a aVar11 = new r8.a(cVar, "dev.flutter.pigeon.AndroidVideoPlayerApi.pause", a());
        if (aVar != null) {
            aVar11.e(new a.d() { // from class: e9.b
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    l.l(m.a.this, obj, eVar);
                }
            });
        } else {
            aVar11.e(null);
        }
        r8.a aVar12 = new r8.a(cVar, "dev.flutter.pigeon.AndroidVideoPlayerApi.setMixWithOthers", a());
        if (aVar != null) {
            aVar12.e(new a.d() { // from class: e9.d
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    l.d(m.a.this, obj, eVar);
                }
            });
        } else {
            aVar12.e(null);
        }
    }
}
