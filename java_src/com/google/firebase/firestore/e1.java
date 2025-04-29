package com.google.firebase.firestore;
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: b  reason: collision with root package name */
    static final e1 f6747b = new b().a();

    /* renamed from: a  reason: collision with root package name */
    private final int f6748a;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private int f6749a = 5;

        public e1 a() {
            return new e1(this.f6749a);
        }

        public b b(int i10) {
            if (i10 >= 1) {
                this.f6749a = i10;
                return this;
            }
            throw new IllegalArgumentException("Max attempts must be at least 1");
        }
    }

    private e1(int i10) {
        this.f6748a = i10;
    }

    public int a() {
        return this.f6748a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && e1.class == obj.getClass() && this.f6748a == ((e1) obj).f6748a;
    }

    public int hashCode() {
        return this.f6748a;
    }

    public String toString() {
        return "TransactionOptions{maxAttempts=" + this.f6748a + '}';
    }
}
