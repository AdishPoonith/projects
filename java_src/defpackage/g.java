package defpackage;

import defpackage.g;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import r8.a;
import r8.c;
import r8.i;
import s9.h;
import s9.j;
import t9.o;
/* renamed from: g  reason: default package */
/* loaded from: classes.dex */
public interface g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8875a = a.f8876a;

    /* renamed from: g$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f8876a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final h<h> f8877b;

        /* renamed from: g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0146a extends m implements da.a<h> {

            /* renamed from: j  reason: collision with root package name */
            public static final C0146a f8878j = new C0146a();

            C0146a() {
                super(0);
            }

            @Override // da.a
            /* renamed from: a */
            public final h invoke() {
                return h.f9053d;
            }
        }

        static {
            h<h> a10;
            a10 = j.a(C0146a.f8878j);
            f8877b = a10;
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(g gVar, Object obj, a.e reply) {
            List b10;
            l.e(reply, "reply");
            l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            l.c(obj2, "null cannot be cast to non-null type <root>.ToggleMessage");
            try {
                gVar.a((d) obj2);
                b10 = o.b(null);
            } catch (Throwable th) {
                b10 = c.b(th);
            }
            reply.a(b10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(g gVar, Object obj, a.e reply) {
            List b10;
            l.e(reply, "reply");
            try {
                b10 = o.b(gVar.isEnabled());
            } catch (Throwable th) {
                b10 = c.b(th);
            }
            reply.a(b10);
        }

        public final i<Object> c() {
            return f8877b.getValue();
        }

        public final void d(c binaryMessenger, final g gVar) {
            l.e(binaryMessenger, "binaryMessenger");
            r8.a aVar = new r8.a(binaryMessenger, "dev.flutter.pigeon.WakelockPlusApi.toggle", c());
            if (gVar != null) {
                aVar.e(new a.d() { // from class: f
                    @Override // r8.a.d
                    public final void a(Object obj, a.e eVar) {
                        g.a.e(g.this, obj, eVar);
                    }
                });
            } else {
                aVar.e(null);
            }
            r8.a aVar2 = new r8.a(binaryMessenger, "dev.flutter.pigeon.WakelockPlusApi.isEnabled", c());
            if (gVar != null) {
                aVar2.e(new a.d() { // from class: e
                    @Override // r8.a.d
                    public final void a(Object obj, a.e eVar) {
                        g.a.f(g.this, obj, eVar);
                    }
                });
            } else {
                aVar2.e(null);
            }
        }
    }

    void a(d dVar);

    b isEnabled();
}
