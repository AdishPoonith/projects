package k4;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
/* loaded from: classes.dex */
final class h implements View.OnClickListener {

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ Context f12582j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ Intent f12583k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Context context, Intent intent) {
        this.f12582j = context;
        this.f12583k = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f12582j.startActivity(this.f12583k);
        } catch (ActivityNotFoundException e10) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e10);
        }
    }
}
