package com.google.firebase.firestore;
/* loaded from: classes.dex */
public class z0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6877a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f6878b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z0(boolean z10, boolean z11) {
        this.f6877a = z10;
        this.f6878b = z11;
    }

    public boolean a() {
        return this.f6877a;
    }

    public boolean b() {
        return this.f6878b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            return this.f6877a == z0Var.f6877a && this.f6878b == z0Var.f6878b;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f6877a ? 1 : 0) * 31) + (this.f6878b ? 1 : 0);
    }

    public String toString() {
        return "SnapshotMetadata{hasPendingWrites=" + this.f6877a + ", isFromCache=" + this.f6878b + '}';
    }
}
