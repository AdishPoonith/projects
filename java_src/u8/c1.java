package u8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r8.a;
import u8.v0;
/* loaded from: classes.dex */
public final /* synthetic */ class c1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements v0.i<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f19173a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f19174b;

        a(Map map, a.e eVar) {
            this.f19173a = map;
            this.f19174b = eVar;
        }

        @Override // u8.v0.i
        public void b(Throwable th) {
            Map b10;
            Map map = this.f19173a;
            b10 = v0.b(th);
            map.put("error", b10);
            this.f19174b.a(this.f19173a);
        }

        @Override // u8.v0.i
        /* renamed from: c */
        public void a(Void r32) {
            this.f19173a.put("result", null);
            this.f19174b.a(this.f19173a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements v0.i<v0.g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f19175a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f19176b;

        b(Map map, a.e eVar) {
            this.f19175a = map;
            this.f19176b = eVar;
        }

        @Override // u8.v0.i
        public void b(Throwable th) {
            Map b10;
            Map map = this.f19175a;
            b10 = v0.b(th);
            map.put("error", b10);
            this.f19176b.a(this.f19175a);
        }

        @Override // u8.v0.i
        /* renamed from: c */
        public void a(v0.g gVar) {
            this.f19175a.put("result", gVar);
            this.f19176b.a(this.f19175a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements v0.i<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f19177a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f19178b;

        c(Map map, a.e eVar) {
            this.f19177a = map;
            this.f19178b = eVar;
        }

        @Override // u8.v0.i
        public void b(Throwable th) {
            Map b10;
            Map map = this.f19177a;
            b10 = v0.b(th);
            map.put("error", b10);
            this.f19178b.a(this.f19177a);
        }

        @Override // u8.v0.i
        /* renamed from: c */
        public void a(Void r32) {
            this.f19177a.put("result", null);
            this.f19178b.a(this.f19177a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements v0.i<List<v0.f>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f19179a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f19180b;

        d(Map map, a.e eVar) {
            this.f19179a = map;
            this.f19180b = eVar;
        }

        @Override // u8.v0.i
        public void b(Throwable th) {
            Map b10;
            Map map = this.f19179a;
            b10 = v0.b(th);
            map.put("error", b10);
            this.f19180b.a(this.f19179a);
        }

        @Override // u8.v0.i
        /* renamed from: c */
        public void a(List<v0.f> list) {
            this.f19179a.put("result", list);
            this.f19180b.a(this.f19179a);
        }
    }

    public static r8.i<Object> a() {
        return v0.e.f19301d;
    }

    public static /* synthetic */ void b(v0.d dVar, Object obj, a.e eVar) {
        Map b10;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str == null) {
                throw new NullPointerException("appNameArg unexpectedly null.");
            }
            v0.h hVar = (v0.h) arrayList.get(1);
            if (hVar == null) {
                throw new NullPointerException("assertionArg unexpectedly null.");
            }
            dVar.b(str, hVar, (String) arrayList.get(2), new a(hashMap, eVar));
        } catch (Error | RuntimeException e10) {
            b10 = v0.b(e10);
            hashMap.put("error", b10);
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void c(v0.d dVar, Object obj, a.e eVar) {
        Map b10;
        HashMap hashMap = new HashMap();
        try {
            String str = (String) ((ArrayList) obj).get(0);
            if (str == null) {
                throw new NullPointerException("appNameArg unexpectedly null.");
            }
            dVar.c(str, new b(hashMap, eVar));
        } catch (Error | RuntimeException e10) {
            b10 = v0.b(e10);
            hashMap.put("error", b10);
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void d(v0.d dVar, Object obj, a.e eVar) {
        Map b10;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str == null) {
                throw new NullPointerException("appNameArg unexpectedly null.");
            }
            dVar.h(str, (String) arrayList.get(1), new c(hashMap, eVar));
        } catch (Error | RuntimeException e10) {
            b10 = v0.b(e10);
            hashMap.put("error", b10);
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void e(v0.d dVar, Object obj, a.e eVar) {
        Map b10;
        HashMap hashMap = new HashMap();
        try {
            String str = (String) ((ArrayList) obj).get(0);
            if (str == null) {
                throw new NullPointerException("appNameArg unexpectedly null.");
            }
            dVar.i(str, new d(hashMap, eVar));
        } catch (Error | RuntimeException e10) {
            b10 = v0.b(e10);
            hashMap.put("error", b10);
            eVar.a(hashMap);
        }
    }

    public static void f(r8.c cVar, final v0.d dVar) {
        r8.a aVar = new r8.a(cVar, "dev.flutter.pigeon.MultiFactorUserHostApi.enrollPhone", a());
        if (dVar != null) {
            aVar.e(new a.d() { // from class: u8.y0
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    c1.b(v0.d.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        r8.a aVar2 = new r8.a(cVar, "dev.flutter.pigeon.MultiFactorUserHostApi.getSession", a());
        if (dVar != null) {
            aVar2.e(new a.d() { // from class: u8.z0
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    c1.c(v0.d.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        r8.a aVar3 = new r8.a(cVar, "dev.flutter.pigeon.MultiFactorUserHostApi.unenroll", a());
        if (dVar != null) {
            aVar3.e(new a.d() { // from class: u8.a1
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    c1.d(v0.d.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        r8.a aVar4 = new r8.a(cVar, "dev.flutter.pigeon.MultiFactorUserHostApi.getEnrolledFactors", a());
        if (dVar != null) {
            aVar4.e(new a.d() { // from class: u8.b1
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    c1.e(v0.d.this, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
    }
}
