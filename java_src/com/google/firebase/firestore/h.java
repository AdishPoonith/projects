package com.google.firebase.firestore;

import j6.n;
import j6.y1;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final b f6757a;

    /* renamed from: b  reason: collision with root package name */
    private final v0 f6758b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6759c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6760d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6761a;

        static {
            int[] iArr = new int[n.a.values().length];
            f6761a = iArr;
            try {
                iArr[n.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6761a[n.a.METADATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6761a[n.a.MODIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6761a[n.a.REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        ADDED,
        MODIFIED,
        REMOVED
    }

    h(v0 v0Var, b bVar, int i10, int i11) {
        this.f6757a = bVar;
        this.f6758b = v0Var;
        this.f6759c = i10;
        this.f6760d = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<h> a(FirebaseFirestore firebaseFirestore, n0 n0Var, y1 y1Var) {
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        if (y1Var.g().isEmpty()) {
            m6.i iVar = null;
            int i12 = 0;
            for (j6.n nVar : y1Var.d()) {
                m6.i b10 = nVar.b();
                v0 h10 = v0.h(firebaseFirestore, b10, y1Var.k(), y1Var.f().contains(b10.getKey()));
                q6.b.d(nVar.c() == n.a.ADDED, "Invalid added event for first snapshot", new Object[0]);
                q6.b.d(iVar == null || y1Var.h().c().compare(iVar, b10) < 0, "Got added events in wrong order", new Object[0]);
                arrayList.add(new h(h10, b.ADDED, -1, i12));
                iVar = b10;
                i12++;
            }
        } else {
            m6.n g10 = y1Var.g();
            for (j6.n nVar2 : y1Var.d()) {
                if (n0Var != n0.EXCLUDE || nVar2.c() != n.a.METADATA) {
                    m6.i b11 = nVar2.b();
                    v0 h11 = v0.h(firebaseFirestore, b11, y1Var.k(), y1Var.f().contains(b11.getKey()));
                    b f10 = f(nVar2);
                    if (f10 != b.ADDED) {
                        i10 = g10.q(b11.getKey());
                        q6.b.d(i10 >= 0, "Index for document not found", new Object[0]);
                        g10 = g10.s(b11.getKey());
                    } else {
                        i10 = -1;
                    }
                    if (f10 != b.REMOVED) {
                        g10 = g10.e(b11);
                        i11 = g10.q(b11.getKey());
                        q6.b.d(i11 >= 0, "Index for document not found", new Object[0]);
                    } else {
                        i11 = -1;
                    }
                    arrayList.add(new h(h11, f10, i10, i11));
                }
            }
        }
        return arrayList;
    }

    private static b f(j6.n nVar) {
        int i10 = a.f6761a[nVar.c().ordinal()];
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return b.MODIFIED;
            }
            if (i10 == 4) {
                return b.REMOVED;
            }
            throw new IllegalArgumentException("Unknown view change type: " + nVar.c());
        }
        return b.ADDED;
    }

    public v0 b() {
        return this.f6758b;
    }

    public int c() {
        return this.f6760d;
    }

    public int d() {
        return this.f6759c;
    }

    public b e() {
        return this.f6757a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f6757a.equals(hVar.f6757a) && this.f6758b.equals(hVar.f6758b) && this.f6759c == hVar.f6759c && this.f6760d == hVar.f6760d;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f6757a.hashCode() * 31) + this.f6758b.hashCode()) * 31) + this.f6759c) * 31) + this.f6760d;
    }
}
