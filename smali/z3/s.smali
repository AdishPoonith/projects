.class public abstract Lz3/s;
.super Lm4/b;
.source "SourceFile"

# interfaces
.implements Lz3/t;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.signin.internal.IRevocationService"

    invoke-direct {p0, v0}, Lm4/b;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final p(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p3, 0x2

    if-eq p1, p3, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-interface {p0}, Lz3/t;->j0()V

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Lz3/t;->Q0()V

    :goto_0
    return p2
.end method
