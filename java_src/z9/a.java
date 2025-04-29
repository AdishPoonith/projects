package z9;

import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public class a extends y9.a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0295a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0295a f20896a = new C0295a();

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f20897b;

        /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
        static {
            /*
                z9.a$a r0 = new z9.a$a
                r0.<init>()
                z9.a.C0295a.f20896a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L1f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1f
                goto L20
            L1f:
                r1 = r0
            L20:
                if (r1 == 0) goto L2e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L2a
                r2 = 1
                goto L2b
            L2a:
                r2 = 0
            L2b:
                if (r2 == 0) goto L2e
                r0 = r1
            L2e:
                z9.a.C0295a.f20897b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z9.a.C0295a.<clinit>():void");
        }

        private C0295a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0295a.f20897b;
        return num == null || num.intValue() >= i10;
    }

    @Override // y9.a
    public void a(Throwable cause, Throwable exception) {
        l.e(cause, "cause");
        l.e(exception, "exception");
        if (c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
