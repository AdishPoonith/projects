package com.google.firebase.firestore;

import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    private static final c f6813a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final e f6814b = new e();

    /* loaded from: classes.dex */
    static class a extends r {

        /* renamed from: c  reason: collision with root package name */
        private final List<Object> f6815c;

        a(List<Object> list) {
            this.f6815c = list;
        }

        @Override // com.google.firebase.firestore.r
        String d() {
            return "FieldValue.arrayRemove";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public List<Object> h() {
            return this.f6815c;
        }
    }

    /* loaded from: classes.dex */
    static class b extends r {

        /* renamed from: c  reason: collision with root package name */
        private final List<Object> f6816c;

        b(List<Object> list) {
            this.f6816c = list;
        }

        @Override // com.google.firebase.firestore.r
        String d() {
            return "FieldValue.arrayUnion";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public List<Object> h() {
            return this.f6816c;
        }
    }

    /* loaded from: classes.dex */
    static class c extends r {
        c() {
        }

        @Override // com.google.firebase.firestore.r
        String d() {
            return "FieldValue.delete";
        }
    }

    /* loaded from: classes.dex */
    static class d extends r {

        /* renamed from: c  reason: collision with root package name */
        private final Number f6817c;

        d(Number number) {
            this.f6817c = number;
        }

        @Override // com.google.firebase.firestore.r
        String d() {
            return "FieldValue.increment";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Number h() {
            return this.f6817c;
        }
    }

    /* loaded from: classes.dex */
    static class e extends r {
        e() {
        }

        @Override // com.google.firebase.firestore.r
        String d() {
            return "FieldValue.serverTimestamp";
        }
    }

    r() {
    }

    public static r a(Object... objArr) {
        return new a(Arrays.asList(objArr));
    }

    public static r b(Object... objArr) {
        return new b(Arrays.asList(objArr));
    }

    public static r c() {
        return f6813a;
    }

    public static r e(double d10) {
        return new d(Double.valueOf(d10));
    }

    public static r f(long j10) {
        return new d(Long.valueOf(j10));
    }

    public static r g() {
        return f6814b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String d();
}
