package com.google.firebase.firestore;

import com.google.firebase.firestore.n;
import java.util.Map;
/* loaded from: classes.dex */
public class v0 extends n {
    private v0(FirebaseFirestore firebaseFirestore, m6.l lVar, m6.i iVar, boolean z10, boolean z11) {
        super(firebaseFirestore, lVar, iVar, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v0 h(FirebaseFirestore firebaseFirestore, m6.i iVar, boolean z10, boolean z11) {
        return new v0(firebaseFirestore, iVar.getKey(), iVar, z10, z11);
    }

    @Override // com.google.firebase.firestore.n
    public Map<String, Object> d() {
        Map<String, Object> d10 = super.d();
        q6.b.d(d10 != null, "Data in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return d10;
    }

    @Override // com.google.firebase.firestore.n
    public Map<String, Object> e(n.a aVar) {
        q6.x.c(aVar, "Provided serverTimestampBehavior value must not be null.");
        Map<String, Object> e10 = super.e(aVar);
        q6.b.d(e10 != null, "Data in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return e10;
    }
}
