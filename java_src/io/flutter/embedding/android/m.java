package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.s;
import q8.d;
/* loaded from: classes.dex */
public class m implements s.d {

    /* renamed from: a  reason: collision with root package name */
    private final q8.d f10223a;

    /* renamed from: b  reason: collision with root package name */
    private final s.b f10224b = new s.b();

    public m(q8.d dVar) {
        this.f10223a = dVar;
    }

    @Override // io.flutter.embedding.android.s.d
    public void a(KeyEvent keyEvent, final s.d.a aVar) {
        int action = keyEvent.getAction();
        if (action == 0 || action == 1) {
            this.f10223a.e(new d.b(keyEvent, this.f10224b.a(keyEvent.getUnicodeChar())), action != 0, new d.a() { // from class: io.flutter.embedding.android.l
                @Override // q8.d.a
                public final void a(boolean z10) {
                    s.d.a.this.a(z10);
                }
            });
        } else {
            aVar.a(false);
        }
    }
}
