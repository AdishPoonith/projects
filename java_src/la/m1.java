package la;

import java.io.Closeable;
import v9.g;
/* loaded from: classes.dex */
public abstract class m1 extends g0 implements Closeable {

    /* renamed from: l  reason: collision with root package name */
    public static final a f13649l = new a(null);

    /* loaded from: classes.dex */
    public static final class a extends v9.b<g0, m1> {

        /* renamed from: la.m1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0200a extends kotlin.jvm.internal.m implements da.l<g.b, m1> {

            /* renamed from: j  reason: collision with root package name */
            public static final C0200a f13650j = new C0200a();

            C0200a() {
                super(1);
            }

            @Override // da.l
            /* renamed from: a */
            public final m1 invoke(g.b bVar) {
                if (bVar instanceof m1) {
                    return (m1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(g0.f13620k, C0200a.f13650j);
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }
}
