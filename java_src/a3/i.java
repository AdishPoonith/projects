package a3;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class i implements t2.a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final String f155a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f156b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f157c;

    /* JADX INFO: Access modifiers changed from: protected */
    public i(String str, List<String> list, boolean z10) {
        this.f155a = str;
        this.f156b = Collections.unmodifiableList(list);
        this.f157c = z10;
    }
}
