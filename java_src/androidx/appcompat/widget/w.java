package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
/* loaded from: classes.dex */
final class w {

    /* renamed from: a  reason: collision with root package name */
    private TextView f1370a;

    /* renamed from: b  reason: collision with root package name */
    private TextClassifier f1371b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(TextView textView) {
        this.f1370a = (TextView) androidx.core.util.d.c(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f1371b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1370a.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
        return textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f1371b = textClassifier;
    }
}
