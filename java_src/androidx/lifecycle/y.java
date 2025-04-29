package androidx.lifecycle;

import androidx.lifecycle.x;
/* loaded from: classes.dex */
public final /* synthetic */ class y {
    static {
        x.b.a aVar = x.b.f2580a;
    }

    public static w a(x.b bVar, Class modelClass) {
        kotlin.jvm.internal.l.e(modelClass, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static w b(x.b bVar, Class modelClass, c0.a extras) {
        kotlin.jvm.internal.l.e(modelClass, "modelClass");
        kotlin.jvm.internal.l.e(extras, "extras");
        return bVar.a(modelClass);
    }
}
