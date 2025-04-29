package y;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: r  reason: collision with root package name */
    private int f20290r;

    /* renamed from: s  reason: collision with root package name */
    private int f20291s;

    /* renamed from: t  reason: collision with root package name */
    private LayoutInflater f20292t;

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f20291s = i10;
        this.f20290r = i10;
        this.f20292t = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // y.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f20292t.inflate(this.f20291s, viewGroup, false);
    }

    @Override // y.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f20292t.inflate(this.f20290r, viewGroup, false);
    }
}
