package b4;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o extends o4.j {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2922a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e f2923b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f2923b = eVar;
        this.f2922a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int f10 = this.f2923b.f(this.f2922a);
        if (this.f2923b.i(f10)) {
            this.f2923b.o(this.f2922a, f10);
        }
    }
}
