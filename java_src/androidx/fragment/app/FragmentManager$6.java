package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.e;
import java.util.Map;
/* loaded from: classes.dex */
class FragmentManager$6 implements androidx.lifecycle.g {

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ String f2145j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ s f2146k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.e f2147l;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ n f2148m;

    @Override // androidx.lifecycle.g
    public void q(androidx.lifecycle.i iVar, e.a aVar) {
        Map map;
        Map map2;
        if (aVar == e.a.ON_START) {
            map2 = this.f2148m.f2306j;
            Bundle bundle = (Bundle) map2.get(this.f2145j);
            if (bundle != null) {
                this.f2146k.a(this.f2145j, bundle);
                this.f2148m.r(this.f2145j);
            }
        }
        if (aVar == e.a.ON_DESTROY) {
            this.f2147l.c(this);
            map = this.f2148m.f2307k;
            map.remove(this.f2145j);
        }
    }
}
