package io.flutter.plugin.platform;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private io.flutter.view.c f10434a;

    public boolean a(MotionEvent motionEvent, boolean z10) {
        io.flutter.view.c cVar = this.f10434a;
        if (cVar == null) {
            return false;
        }
        return cVar.K(motionEvent, z10);
    }

    public boolean b(View view, View view2, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.c cVar = this.f10434a;
        if (cVar == null) {
            return false;
        }
        return cVar.x(view, view2, accessibilityEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(io.flutter.view.c cVar) {
        this.f10434a = cVar;
    }
}
