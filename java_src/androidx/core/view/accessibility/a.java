package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: j  reason: collision with root package name */
    private final int f1829j;

    /* renamed from: k  reason: collision with root package name */
    private final b f1830k;

    /* renamed from: l  reason: collision with root package name */
    private final int f1831l;

    public a(int i10, b bVar, int i11) {
        this.f1829j = i10;
        this.f1830k = bVar;
        this.f1831l = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1829j);
        this.f1830k.F(this.f1831l, bundle);
    }
}
