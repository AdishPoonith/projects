package y9;

import java.lang.reflect.Method;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public class a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0290a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0290a f20625a = new C0290a();

        /* renamed from: b  reason: collision with root package name */
        public static final Method f20626b;

        /* renamed from: c  reason: collision with root package name */
        public static final Method f20627c;

        /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[LOOP:0: B:3:0x0015->B:13:0x003f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[EDGE_INSN: B:24:0x0043->B:15:0x0043 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                y9.a$a r0 = new y9.a$a
                r0.<init>()
                y9.a.C0290a.f20625a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.jvm.internal.l.d(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L15:
                r5 = 0
                if (r4 >= r2) goto L42
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.l.a(r7, r8)
                if (r7 == 0) goto L3b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                kotlin.jvm.internal.l.d(r7, r8)
                java.lang.Object r7 = t9.g.L(r7)
                boolean r7 = kotlin.jvm.internal.l.a(r7, r0)
                if (r7 == 0) goto L3b
                r7 = 1
                goto L3c
            L3b:
                r7 = 0
            L3c:
                if (r7 == 0) goto L3f
                goto L43
            L3f:
                int r4 = r4 + 1
                goto L15
            L42:
                r6 = r5
            L43:
                y9.a.C0290a.f20626b = r6
                int r0 = r1.length
            L46:
                if (r3 >= r0) goto L5b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = kotlin.jvm.internal.l.a(r4, r6)
                if (r4 == 0) goto L58
                r5 = r2
                goto L5b
            L58:
                int r3 = r3 + 1
                goto L46
            L5b:
                y9.a.C0290a.f20627c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y9.a.C0290a.<clinit>():void");
        }

        private C0290a() {
        }
    }

    public void a(Throwable cause, Throwable exception) {
        l.e(cause, "cause");
        l.e(exception, "exception");
        Method method = C0290a.f20626b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public fa.c b() {
        return new fa.b();
    }
}
