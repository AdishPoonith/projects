.class public abstract Lk4/b$a;
.super Lp4/b;
.source "SourceFile"

# interfaces
.implements Lk4/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.dynamic.IObjectWrapper"

    invoke-direct {p0, v0}, Lp4/b;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static x(Landroid/os/IBinder;)Lk4/b;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.dynamic.IObjectWrapper"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lk4/b;

    if-eqz v1, :cond_1

    check-cast v0, Lk4/b;

    return-object v0

    :cond_1
    new-instance v0, Lk4/l;

    invoke-direct {v0, p0}, Lk4/l;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
