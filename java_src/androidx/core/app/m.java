package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.k;
import androidx.core.graphics.drawable.IconCompat;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f1588a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f1589b = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle a(k.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat d10 = aVar.d();
        bundle.putInt("icon", d10 != null ? d10.h() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(q qVar) {
        new Bundle();
        throw null;
    }

    private static Bundle[] c(q[] qVarArr) {
        if (qVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[qVarArr.length];
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            q qVar = qVarArr[i10];
            bundleArr[i10] = b(null);
        }
        return bundleArr;
    }
}
