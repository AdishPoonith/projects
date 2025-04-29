package com.google.firebase.firestore;
/* loaded from: classes.dex */
public class g extends u0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g(m6.u uVar, FirebaseFirestore firebaseFirestore) {
        super(j6.b1.b(uVar), firebaseFirestore);
        if (uVar.q() % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException("Invalid collection reference. Collection references must have an odd number of segments, but " + uVar.h() + " has " + uVar.q());
    }
}
