package com.google.firebase.firestore;

import android.util.SparseArray;
/* loaded from: classes.dex */
public class z extends w5.l {

    /* renamed from: j  reason: collision with root package name */
    private final a f6859j;

    /* loaded from: classes.dex */
    public enum a {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        
        private static final SparseArray<a> B = b();

        /* renamed from: j  reason: collision with root package name */
        private final int f6876j;

        a(int i10) {
            this.f6876j = i10;
        }

        private static SparseArray<a> b() {
            a[] values;
            SparseArray<a> sparseArray = new SparseArray<>();
            for (a aVar : values()) {
                a aVar2 = sparseArray.get(aVar.h());
                if (aVar2 != null) {
                    throw new IllegalStateException("Code value duplication between " + aVar2 + "&" + aVar.name());
                }
                sparseArray.put(aVar.h(), aVar);
            }
            return sparseArray;
        }

        public static a g(int i10) {
            return B.get(i10, UNKNOWN);
        }

        public int h() {
            return this.f6876j;
        }
    }

    public z(String str, a aVar) {
        super(str);
        q6.x.c(str, "Provided message must not be null.");
        q6.b.d(aVar != a.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.f6859j = (a) q6.x.c(aVar, "Provided code must not be null.");
    }

    public z(String str, a aVar, Throwable th) {
        super(str, th);
        q6.x.c(str, "Provided message must not be null.");
        q6.b.d(aVar != a.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.f6859j = (a) q6.x.c(aVar, "Provided code must not be null.");
    }

    public a a() {
        return this.f6859j;
    }
}
