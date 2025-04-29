package e;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class f extends e.a<Intent, androidx.activity.result.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7967a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    @Override // e.a
    /* renamed from: d */
    public Intent a(Context context, Intent input) {
        l.e(context, "context");
        l.e(input, "input");
        return input;
    }

    @Override // e.a
    /* renamed from: e */
    public androidx.activity.result.a c(int i10, Intent intent) {
        return new androidx.activity.result.a(i10, intent);
    }
}
