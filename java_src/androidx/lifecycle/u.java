package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a;
import java.util.Map;
/* loaded from: classes.dex */
public final class u implements a.c {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.savedstate.a f2565a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2566b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f2567c;

    /* renamed from: d  reason: collision with root package name */
    private final s9.h f2568d;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.m implements da.a<v> {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ b0 f2569j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b0 b0Var) {
            super(0);
            this.f2569j = b0Var;
        }

        @Override // da.a
        /* renamed from: a */
        public final v invoke() {
            return t.b(this.f2569j);
        }
    }

    public u(androidx.savedstate.a savedStateRegistry, b0 viewModelStoreOwner) {
        s9.h a10;
        kotlin.jvm.internal.l.e(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.l.e(viewModelStoreOwner, "viewModelStoreOwner");
        this.f2565a = savedStateRegistry;
        a10 = s9.j.a(new a(viewModelStoreOwner));
        this.f2568d = a10;
    }

    private final v b() {
        return (v) this.f2568d.getValue();
    }

    @Override // androidx.savedstate.a.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2567c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, s> entry : b().e().entrySet()) {
            String key = entry.getKey();
            Bundle a10 = entry.getValue().c().a();
            if (!kotlin.jvm.internal.l.a(a10, Bundle.EMPTY)) {
                bundle.putBundle(key, a10);
            }
        }
        this.f2566b = false;
        return bundle;
    }

    public final void c() {
        if (this.f2566b) {
            return;
        }
        this.f2567c = this.f2565a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        this.f2566b = true;
        b();
    }
}
