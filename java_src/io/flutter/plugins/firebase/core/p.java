package io.flutter.plugins.firebase.core;

import io.flutter.plugins.firebase.core.l;
import java.util.ArrayList;
import r8.a;
/* loaded from: classes.dex */
public final /* synthetic */ class p {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements l.h<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10589a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f10590b;

        a(ArrayList arrayList, a.e eVar) {
            this.f10589a = arrayList;
            this.f10590b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        public void b(Throwable th) {
            ArrayList b10;
            b10 = l.b(th);
            this.f10590b.a(b10);
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        /* renamed from: c */
        public void a(Void r32) {
            this.f10589a.add(0, null);
            this.f10590b.a(this.f10589a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements l.h<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10591a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f10592b;

        b(ArrayList arrayList, a.e eVar) {
            this.f10591a = arrayList;
            this.f10592b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        public void b(Throwable th) {
            ArrayList b10;
            b10 = l.b(th);
            this.f10592b.a(b10);
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        /* renamed from: c */
        public void a(Void r32) {
            this.f10591a.add(0, null);
            this.f10592b.a(this.f10591a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements l.h<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10593a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f10594b;

        c(ArrayList arrayList, a.e eVar) {
            this.f10593a = arrayList;
            this.f10594b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        public void b(Throwable th) {
            ArrayList b10;
            b10 = l.b(th);
            this.f10594b.a(b10);
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        /* renamed from: c */
        public void a(Void r32) {
            this.f10593a.add(0, null);
            this.f10594b.a(this.f10593a);
        }
    }

    public static r8.i<Object> a() {
        return new r8.r();
    }

    public static /* synthetic */ void b(l.c cVar, Object obj, a.e eVar) {
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
            Boolean bool = (Boolean) arrayList2.get(1);
            if (bool == null) {
                throw new NullPointerException("enabledArg unexpectedly null.");
            }
            cVar.e(str, bool, new a(arrayList, eVar));
        } catch (Error | RuntimeException e10) {
            b10 = l.b(e10);
            eVar.a(b10);
        }
    }

    public static /* synthetic */ void c(l.c cVar, Object obj, a.e eVar) {
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
            Boolean bool = (Boolean) arrayList2.get(1);
            if (bool == null) {
                throw new NullPointerException("enabledArg unexpectedly null.");
            }
            cVar.f(str, bool, new b(arrayList, eVar));
        } catch (Error | RuntimeException e10) {
            b10 = l.b(e10);
            eVar.a(b10);
        }
    }

    public static /* synthetic */ void d(l.c cVar, Object obj, a.e eVar) {
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
            cVar.g(str, new c(arrayList, eVar));
        } catch (Error | RuntimeException e10) {
            b10 = l.b(e10);
            eVar.a(b10);
        }
    }

    public static void e(r8.c cVar, final l.c cVar2) {
        r8.a aVar = new r8.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", a());
        if (cVar2 != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.firebase.core.m
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    p.b(l.c.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        r8.a aVar2 = new r8.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", a());
        if (cVar2 != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.firebase.core.n
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    p.c(l.c.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        r8.a aVar3 = new r8.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.delete", a());
        if (cVar2 != null) {
            aVar3.e(new a.d() { // from class: io.flutter.plugins.firebase.core.o
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar) {
                    p.d(l.c.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
    }
}
