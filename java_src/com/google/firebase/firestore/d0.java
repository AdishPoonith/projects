package com.google.firebase.firestore;
/* loaded from: classes.dex */
public class d0 implements Comparable<d0> {

    /* renamed from: j  reason: collision with root package name */
    private final double f6741j;

    /* renamed from: k  reason: collision with root package name */
    private final double f6742k;

    public d0(double d10, double d11) {
        if (Double.isNaN(d10) || d10 < -90.0d || d10 > 90.0d) {
            throw new IllegalArgumentException("Latitude must be in the range of [-90, 90]");
        }
        if (Double.isNaN(d11) || d11 < -180.0d || d11 > 180.0d) {
            throw new IllegalArgumentException("Longitude must be in the range of [-180, 180]");
        }
        this.f6741j = d10;
        this.f6742k = d11;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(d0 d0Var) {
        int k10 = q6.g0.k(this.f6741j, d0Var.f6741j);
        return k10 == 0 ? q6.g0.k(this.f6742k, d0Var.f6742k) : k10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return this.f6741j == d0Var.f6741j && this.f6742k == d0Var.f6742k;
        }
        return false;
    }

    public double g() {
        return this.f6741j;
    }

    public double h() {
        return this.f6742k;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f6741j);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f6742k);
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "GeoPoint { latitude=" + this.f6741j + ", longitude=" + this.f6742k + " }";
    }
}
