package com.google.firebase.firestore;
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: g  reason: collision with root package name */
    static final i0 f6776g = new i0(0, 0, 0, 0, null, a.SUCCESS);

    /* renamed from: a  reason: collision with root package name */
    private final int f6777a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6778b;

    /* renamed from: c  reason: collision with root package name */
    private final long f6779c;

    /* renamed from: d  reason: collision with root package name */
    private final long f6780d;

    /* renamed from: e  reason: collision with root package name */
    private final a f6781e;

    /* renamed from: f  reason: collision with root package name */
    private final Exception f6782f;

    /* loaded from: classes.dex */
    public enum a {
        ERROR,
        RUNNING,
        SUCCESS
    }

    public i0(int i10, int i11, long j10, long j11, Exception exc, a aVar) {
        this.f6777a = i10;
        this.f6778b = i11;
        this.f6779c = j10;
        this.f6780d = j11;
        this.f6781e = aVar;
        this.f6782f = exc;
    }

    public static i0 a(i6.e eVar) {
        return new i0(0, eVar.e(), 0L, eVar.d(), null, a.RUNNING);
    }

    public static i0 b(i6.e eVar) {
        return new i0(eVar.e(), eVar.e(), eVar.d(), eVar.d(), null, a.SUCCESS);
    }

    public long c() {
        return this.f6779c;
    }

    public int d() {
        return this.f6777a;
    }

    public a e() {
        return this.f6781e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i0.class != obj.getClass()) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (this.f6777a == i0Var.f6777a && this.f6778b == i0Var.f6778b && this.f6779c == i0Var.f6779c && this.f6780d == i0Var.f6780d && this.f6781e == i0Var.f6781e) {
            Exception exc = this.f6782f;
            Exception exc2 = i0Var.f6782f;
            return exc != null ? exc.equals(exc2) : exc2 == null;
        }
        return false;
    }

    public long f() {
        return this.f6780d;
    }

    public int g() {
        return this.f6778b;
    }

    public int hashCode() {
        long j10 = this.f6779c;
        long j11 = this.f6780d;
        int hashCode = ((((((((this.f6777a * 31) + this.f6778b) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f6781e.hashCode()) * 31;
        Exception exc = this.f6782f;
        return hashCode + (exc != null ? exc.hashCode() : 0);
    }
}
