package com.google.android.gms.internal.p000firebaseauthapi;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import s.a;
import w5.f;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.i1  reason: invalid package */
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map f4711a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f4712b = new a();

    public static String a(String str) {
        g1 g1Var;
        Map map = f4711a;
        synchronized (map) {
            g1Var = (g1) map.get(str);
        }
        if (g1Var != null) {
            return h(g1Var.b(), g1Var.a(), g1Var.b().contains(":")).concat("emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static String b(String str) {
        g1 g1Var;
        Map map = f4711a;
        synchronized (map) {
            g1Var = (g1) map.get(str);
        }
        return (g1Var != null ? "".concat(h(g1Var.b(), g1Var.a(), g1Var.b().contains(":"))) : "https://").concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String c(String str) {
        g1 g1Var;
        Map map = f4711a;
        synchronized (map) {
            g1Var = (g1) map.get(str);
        }
        return (g1Var != null ? "".concat(h(g1Var.b(), g1Var.a(), g1Var.b().contains(":"))) : "https://").concat("identitytoolkit.googleapis.com/v2");
    }

    public static String d(String str) {
        g1 g1Var;
        Map map = f4711a;
        synchronized (map) {
            g1Var = (g1) map.get(str);
        }
        return (g1Var != null ? "".concat(h(g1Var.b(), g1Var.a(), g1Var.b().contains(":"))) : "https://").concat("securetoken.googleapis.com/v1");
    }

    public static void e(String str, h1 h1Var) {
        Map map = f4712b;
        synchronized (map) {
            if (map.containsKey(str)) {
                ((List) map.get(str)).add(new WeakReference(h1Var));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WeakReference(h1Var));
                map.put(str, arrayList);
            }
        }
    }

    public static void f(f fVar, String str, int i10) {
        String b10 = fVar.r().b();
        Map map = f4711a;
        synchronized (map) {
            map.put(b10, new g1(str, i10));
        }
        Map map2 = f4712b;
        synchronized (map2) {
            if (map2.containsKey(b10)) {
                boolean z10 = false;
                for (WeakReference weakReference : (List) map2.get(b10)) {
                    h1 h1Var = (h1) weakReference.get();
                    if (h1Var != null) {
                        h1Var.zzi();
                        z10 = true;
                    }
                }
                if (!z10) {
                    f4711a.remove(b10);
                }
            }
        }
    }

    public static boolean g(f fVar) {
        return f4711a.containsKey(fVar.r().b());
    }

    private static String h(String str, int i10, boolean z10) {
        StringBuilder sb;
        String str2;
        if (z10) {
            sb = new StringBuilder();
            sb.append("http://[");
            sb.append(str);
            str2 = "]:";
        } else {
            sb = new StringBuilder();
            sb.append("http://");
            sb.append(str);
            str2 = ":";
        }
        sb.append(str2);
        sb.append(i10);
        sb.append("/");
        return sb.toString();
    }
}
