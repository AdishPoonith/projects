package l5;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f13062a = Logger.getLogger(b.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f13063b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: l5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class EnumC0195b {

        /* renamed from: j  reason: collision with root package name */
        public static final EnumC0195b f13064j;

        /* renamed from: k  reason: collision with root package name */
        public static final EnumC0195b f13065k;

        /* renamed from: l  reason: collision with root package name */
        private static final /* synthetic */ EnumC0195b[] f13066l;

        /* renamed from: l5.b$b$a */
        /* loaded from: classes.dex */
        enum a extends EnumC0195b {
            a(String str, int i10) {
                super(str, i10);
            }

            @Override // l5.b.EnumC0195b
            public boolean b() {
                return !b.c();
            }
        }

        /* renamed from: l5.b$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        enum C0196b extends EnumC0195b {
            C0196b(String str, int i10) {
                super(str, i10);
            }

            @Override // l5.b.EnumC0195b
            public boolean b() {
                return !b.c() || b.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            f13064j = aVar;
            C0196b c0196b = new C0196b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            f13065k = c0196b;
            f13066l = new EnumC0195b[]{aVar, c0196b};
        }

        private EnumC0195b(String str, int i10) {
        }

        public static EnumC0195b valueOf(String str) {
            return (EnumC0195b) Enum.valueOf(EnumC0195b.class, str);
        }

        public static EnumC0195b[] values() {
            return (EnumC0195b[]) f13066l.clone();
        }

        public abstract boolean b();
    }

    private b() {
    }

    static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            f13062a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return l5.a.a() || f13063b.get();
    }
}
