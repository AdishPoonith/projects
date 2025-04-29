package w6;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCanceledListener;
/* loaded from: classes.dex */
public final /* synthetic */ class f implements OnCanceledListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f19986a;

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f19986a.cancel();
    }
}
