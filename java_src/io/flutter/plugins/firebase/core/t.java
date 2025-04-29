package io.flutter.plugins.firebase.core;

import io.flutter.plugins.firebase.core.l;
import java.util.ArrayList;
import java.util.List;
import r8.a;
/* loaded from: classes.dex */
public final /* synthetic */ class t {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements l.h<l.g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10598a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f10599b;

        a(ArrayList arrayList, a.e eVar) {
            this.f10598a = arrayList;
            this.f10599b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        public void b(Throwable th) {
            ArrayList b10;
            b10 = l.b(th);
            this.f10599b.a(b10);
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        /* renamed from: c */
        public void a(l.g gVar) {
            this.f10598a.add(0, gVar);
            this.f10599b.a(this.f10598a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements l.h<List<l.g>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10600a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f10601b;

        b(ArrayList arrayList, a.e eVar) {
            this.f10600a = arrayList;
            this.f10601b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        public void b(Throwable th) {
            ArrayList b10;
            b10 = l.b(th);
            this.f10601b.a(b10);
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        /* renamed from: c */
        public void a(List<l.g> list) {
            this.f10600a.add(0, list);
            this.f10601b.a(this.f10600a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements l.h<l.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10602a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f10603b;

        c(ArrayList arrayList, a.e eVar) {
            this.f10602a = arrayList;
            this.f10603b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        public void b(Throwable th) {
            ArrayList b10;
            b10 = l.b(th);
            this.f10603b.a(b10);
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        /* renamed from: c */
        public void a(l.f fVar) {
            this.f10602a.add(0, fVar);
            this.f10603b.a(this.f10602a);
        }
    }

    static {
        int i10 = l.d.f10548e;
    }

    public static r8.i<Object> a() {
        return l.e.f10549d;
    }

    public static /* synthetic */ void b(l.d dVar, Object obj, a.e eVar) {
        ArrayList b10;
        ArrayList arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = (ArrayList) obj;
            if (!l.b.f10547a && arrayList2 == null) {
                throw new AssertionError();
            }
            String str = (String) arrayList2.get(0);
            if (str == null) {
                throw new NullPointerException("appNameArg unexpectedly null.");
            }
            l.f fVar = (l.f) arrayList2.get(1);
            if (fVar == null) {
                throw new NullPointerException("initializeAppRequestArg unexpectedly null.");
            }
            dVar.a(str, fVar, new a(arrayList, eVar));
        } catch (Error | RuntimeException e10) {
            b10 = l.b(e10);
            eVar.a(b10);
        }
    }

    public static /* synthetic */ void c(l.d dVar, Object obj, a.e eVar) {
        ArrayList b10;
        try {
            dVar.b(new b(new ArrayList(), eVar));
        } catch (Error | RuntimeException e10) {
            b10 = l.b(e10);
            eVar.a(b10);
        }
    }

    public static /* synthetic */ void d(l.d dVar, Object obj, a.e eVar) {
        ArrayList b10;
        try {
            dVar.c(new c(new ArrayList(), eVar));
        } catch (Error | RuntimeException e10) {
            b10 = l.b(e10);
            eVar.a(b10);
        }
    }

    public static void e(r8.c cVar, final l.d dVar) {
        r8.a aVar = new r8.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp", a());
        if (dVar != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.firebase.core.q
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    t.b(l.d.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        r8.a aVar2 = new r8.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore", a());
        if (dVar != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.firebase.core.r
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    t.c(l.d.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        r8.a aVar3 = new r8.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource", a());
        if (dVar != null) {
            aVar3.e(new a.d() { // from class: io.flutter.plugins.firebase.core.s
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    t.d(l.d.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
    }
}
