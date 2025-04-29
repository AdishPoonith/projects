package io.grpc.internal;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f11002a = Logger.getLogger(a1.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11003a;

        static {
            int[] iArr = new int[f7.b.values().length];
            f11003a = iArr;
            try {
                iArr[f7.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11003a[f7.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11003a[f7.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11003a[f7.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11003a[f7.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11003a[f7.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private a1() {
    }

    public static Object a(String str) {
        f7.a aVar = new f7.a(new StringReader(str));
        try {
            return e(aVar);
        } finally {
            try {
                aVar.close();
            } catch (IOException e10) {
                f11002a.log(Level.WARNING, "Failed to close", (Throwable) e10);
            }
        }
    }

    private static List<?> b(f7.a aVar) {
        aVar.a();
        ArrayList arrayList = new ArrayList();
        while (aVar.t()) {
            arrayList.add(e(aVar));
        }
        boolean z10 = aVar.T() == f7.b.END_ARRAY;
        b5.n.u(z10, "Bad token: " + aVar.q());
        aVar.k();
        return Collections.unmodifiableList(arrayList);
    }

    private static Void c(f7.a aVar) {
        aVar.H();
        return null;
    }

    private static Map<String, ?> d(f7.a aVar) {
        aVar.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (aVar.t()) {
            linkedHashMap.put(aVar.z(), e(aVar));
        }
        boolean z10 = aVar.T() == f7.b.END_OBJECT;
        b5.n.u(z10, "Bad token: " + aVar.q());
        aVar.l();
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static Object e(f7.a aVar) {
        b5.n.u(aVar.t(), "unexpected end of JSON");
        switch (a.f11003a[aVar.T().ordinal()]) {
            case 1:
                return b(aVar);
            case 2:
                return d(aVar);
            case 3:
                return aVar.N();
            case 4:
                return Double.valueOf(aVar.y());
            case 5:
                return Boolean.valueOf(aVar.x());
            case 6:
                return c(aVar);
            default:
                throw new IllegalStateException("Bad token: " + aVar.q());
        }
    }
}
