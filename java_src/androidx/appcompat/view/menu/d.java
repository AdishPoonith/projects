package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class d extends BaseAdapter {

    /* renamed from: j  reason: collision with root package name */
    e f861j;

    /* renamed from: k  reason: collision with root package name */
    private int f862k = -1;

    /* renamed from: l  reason: collision with root package name */
    private boolean f863l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f864m;

    /* renamed from: n  reason: collision with root package name */
    private final LayoutInflater f865n;

    /* renamed from: o  reason: collision with root package name */
    private final int f866o;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f864m = z10;
        this.f865n = layoutInflater;
        this.f861j = eVar;
        this.f866o = i10;
        a();
    }

    void a() {
        g v10 = this.f861j.v();
        if (v10 != null) {
            ArrayList<g> z10 = this.f861j.z();
            int size = z10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (z10.get(i10) == v10) {
                    this.f862k = i10;
                    return;
                }
            }
        }
        this.f862k = -1;
    }

    public e b() {
        return this.f861j;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public g getItem(int i10) {
        ArrayList<g> z10 = this.f864m ? this.f861j.z() : this.f861j.E();
        int i11 = this.f862k;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return z10.get(i10);
    }

    public void d(boolean z10) {
        this.f863l = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> z10 = this.f864m ? this.f861j.z() : this.f861j.E();
        int i10 = this.f862k;
        int size = z10.size();
        return i10 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f865n.inflate(this.f866o, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f861j.F() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f863l) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
