package com.google.firebase.firestore;
/* loaded from: classes.dex */
public class f implements Comparable<f> {

    /* renamed from: j  reason: collision with root package name */
    private final com.google.protobuf.i f6750j;

    private f(com.google.protobuf.i iVar) {
        this.f6750j = iVar;
    }

    public static f g(com.google.protobuf.i iVar) {
        q6.x.c(iVar, "Provided ByteString must not be null.");
        return new f(iVar);
    }

    public static f h(byte[] bArr) {
        q6.x.c(bArr, "Provided bytes array must not be null.");
        return new f(com.google.protobuf.i.u(bArr));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(f fVar) {
        return q6.g0.j(this.f6750j, fVar.f6750j);
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && this.f6750j.equals(((f) obj).f6750j);
    }

    public int hashCode() {
        return this.f6750j.hashCode();
    }

    public com.google.protobuf.i i() {
        return this.f6750j;
    }

    public byte[] k() {
        return this.f6750j.L();
    }

    public String toString() {
        return "Blob { bytes=" + q6.g0.A(this.f6750j) + " }";
    }
}
