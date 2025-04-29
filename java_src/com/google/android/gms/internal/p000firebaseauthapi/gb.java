package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.gb  reason: invalid package */
/* loaded from: classes.dex */
public final class gb {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f4616a = Logger.getLogger(gb.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference f4617b = new AtomicReference(new ha());

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentMap f4618c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentMap f4619d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentMap f4620e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    private static final ConcurrentMap f4621f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f4622g = 0;

    private gb() {
    }

    public static ba a(String str) {
        return ((ha) f4617b.get()).b(str);
    }

    public static synchronized vr b(as asVar) {
        vr c10;
        synchronized (gb.class) {
            ba a10 = a(asVar.H());
            if (!((Boolean) f4619d.get(asVar.H())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(asVar.H())));
            }
            c10 = a10.c(asVar.G());
        }
        return c10;
    }

    public static synchronized w6 c(as asVar) {
        w6 b10;
        synchronized (gb.class) {
            ba a10 = a(asVar.H());
            if (!((Boolean) f4619d.get(asVar.H())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(asVar.H())));
            }
            b10 = a10.b(asVar.G());
        }
        return b10;
    }

    public static Class d(Class cls) {
        try {
            return qj.a().b(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object e(String str, m4 m4Var, Class cls) {
        return ((ha) f4617b.get()).a(str, cls).e(m4Var);
    }

    public static Object f(String str, w6 w6Var, Class cls) {
        return ((ha) f4617b.get()).a(str, cls).d(w6Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized Map g() {
        Map unmodifiableMap;
        synchronized (gb.class) {
            unmodifiableMap = Collections.unmodifiableMap(f4621f);
        }
        return unmodifiableMap;
    }

    public static synchronized void h(lk lkVar, hj hjVar, boolean z10) {
        synchronized (gb.class) {
            AtomicReference atomicReference = f4617b;
            ha haVar = new ha((ha) atomicReference.get());
            haVar.c(lkVar, hjVar);
            Map c10 = lkVar.a().c();
            String d10 = lkVar.d();
            k(d10, c10, true);
            String d11 = hjVar.d();
            k(d11, Collections.emptyMap(), false);
            if (!((ha) atomicReference.get()).e(d10)) {
                f4618c.put(d10, new fb(lkVar));
                l(lkVar.d(), lkVar.a().c());
            }
            ConcurrentMap concurrentMap = f4619d;
            concurrentMap.put(d10, Boolean.TRUE);
            concurrentMap.put(d11, Boolean.FALSE);
            atomicReference.set(haVar);
        }
    }

    public static synchronized void i(hj hjVar, boolean z10) {
        synchronized (gb.class) {
            AtomicReference atomicReference = f4617b;
            ha haVar = new ha((ha) atomicReference.get());
            haVar.d(hjVar);
            Map c10 = hjVar.a().c();
            String d10 = hjVar.d();
            k(d10, c10, true);
            if (!((ha) atomicReference.get()).e(d10)) {
                f4618c.put(d10, new fb(hjVar));
                l(d10, hjVar.a().c());
            }
            f4619d.put(d10, Boolean.TRUE);
            atomicReference.set(haVar);
        }
    }

    public static synchronized void j(cb cbVar) {
        synchronized (gb.class) {
            qj.a().f(cbVar);
        }
    }

    private static synchronized void k(String str, Map map, boolean z10) {
        synchronized (gb.class) {
            if (z10) {
                ConcurrentMap concurrentMap = f4619d;
                if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
                if (((ha) f4617b.get()).e(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!f4621f.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (f4621f.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.firebase-auth-api.w6, java.lang.Object] */
    private static void l(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f4621f.put((String) entry.getKey(), ja.e(str, ((fj) entry.getValue()).f4586a.a(), ((fj) entry.getValue()).f4587b));
        }
    }
}
