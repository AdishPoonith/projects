package q6;

import android.util.Log;
/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private static b f16313a = b.WARN;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16314a;

        static {
            int[] iArr = new int[b.values().length];
            f16314a = iArr;
            try {
                iArr[b.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16314a[b.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16314a[b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        DEBUG,
        WARN,
        NONE
    }

    public static void a(String str, String str2, Object... objArr) {
        b(b.DEBUG, str, str2, objArr);
    }

    private static void b(b bVar, String str, String str2, Object... objArr) {
        if (bVar.ordinal() >= f16313a.ordinal()) {
            String str3 = String.format("(%s) [%s]: ", "24.6.0", str) + String.format(str2, objArr);
            int i10 = a.f16314a[bVar.ordinal()];
            if (i10 == 1) {
                Log.i("Firestore", str3);
            } else if (i10 == 2) {
                Log.w("Firestore", str3);
            } else if (i10 == 3) {
                throw new IllegalStateException("Trying to log something on level NONE");
            }
        }
    }

    public static boolean c() {
        return f16313a.ordinal() >= b.DEBUG.ordinal();
    }

    public static void d(b bVar) {
        f16313a = bVar;
    }

    public static void e(String str, String str2, Object... objArr) {
        b(b.WARN, str, str2, objArr);
    }
}
