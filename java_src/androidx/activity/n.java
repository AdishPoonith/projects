package androidx.activity;

import android.view.View;
/* loaded from: classes.dex */
public final class n {
    public static final void a(View view, i fullyDrawnReporterOwner) {
        kotlin.jvm.internal.l.e(view, "<this>");
        kotlin.jvm.internal.l.e(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(m.report_drawn, fullyDrawnReporterOwner);
    }
}
